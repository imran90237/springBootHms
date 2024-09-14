package com.hms.hms.model;

public class PathologicalTest extends LabTest {
    private String reagent;

    // Constructors
    public PathologicalTest(String title, double cost, boolean isAvailable, String reagent) {
        super(title, cost, isAvailable);
        this.reagent = reagent;
    }

    public PathologicalTest(String title, double cost) {
        super(title, cost, true); // Assuming default availability as true
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Reagent: " + (reagent != null ? reagent : "N/A") + "\n";
    }

    // Getters and setters
    public String getReagent() {
        return reagent;
    }

    public void setReagent(String reagent) {
        this.reagent = reagent;
    }
}
