//package com.hms.hms.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Inheritance;
//import jakarta.persistence.InheritanceType;
//
//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//public class LabTest {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    protected String title;
//    protected double cost;
//    protected boolean isAvailable;
//
//    // Default constructor
//    public LabTest() { }
//
//    // Parameterized constructor
//    public LabTest(String title, double cost, boolean isAvailable) {
//        this.title = title;
//        this.cost = cost;
//        this.isAvailable = isAvailable;
//    }
//
//    @Override
//    public String toString() {
//        return "Test Title: " + title + "\n"
//                + "Cost: " + cost + "\n"
//                + "Available: " + (isAvailable ? "Yes" : "No");
//    }
//
//    // Getters and setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public double getCost() {
//        return cost;
//    }
//
//    public void setCost(double cost) {
//        this.cost = cost;
//    }
//
//    public boolean isAvailable() {
//        return isAvailable;
//    }
//
//    public void setAvailable(boolean isAvailable) {
//        this.isAvailable = isAvailable;
//    }
//}
