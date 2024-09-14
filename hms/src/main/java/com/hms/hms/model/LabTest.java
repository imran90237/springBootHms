package com.hms.hms.model;

public class LabTest {
    protected String title;
    protected double cost;
    protected boolean isAvailable;

    public LabTest(String title, double cost, boolean isAvailable) {
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Test Title: " + title + "\n"
                + "Cost: " + cost + "\n"
                + "Available: " + (isAvailable ? "Yes" : "No");
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
