package com.hms.hms.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHmsApplication implements CommandLineRunner {

	private static final String URL = "jdbc:mysql://localhost:3306/hms";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "12345";

	public static void main(String[] args) {
		SpringApplication.run(SpringHmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			 Statement statement = connection.createStatement()) {

			// Create the table if not exists
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS lab_tests (" +
					"id INT AUTO_INCREMENT PRIMARY KEY, " +
					"test_name VARCHAR(255) NOT NULL, " +
					"cost DECIMAL(10, 2) NOT NULL, " +
					"is_available BOOLEAN NOT NULL)");

			// Insert data, handling duplicates by clearing existing data first
			statement.executeUpdate("DELETE FROM lab_tests");
			statement.executeUpdate("INSERT INTO lab_tests (test_name, cost, is_available) VALUES " +
					"('Blood Test', 50.00, TRUE), " +
					"('X-Ray', 100.00, TRUE), " +
					"('MRI Scan', 300.00, FALSE)");


			System.out.println("Table created and data inserted successfully!");

			// Query and display data
			try (java.sql.ResultSet resultSet = statement.executeQuery("SELECT * FROM lab_tests")) {
				while (resultSet.next()) {
					String testName = resultSet.getString("test_name");
					double testCost = resultSet.getDouble("cost");
					String availability = resultSet.getBoolean("is_available") ? "Available" : "Not Available";

					System.out.println("Test Name: " + testName);
					System.out.println("Cost: " + testCost);
					System.out.println("Availability: " + availability);
					System.out.println("----------------------------------");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
