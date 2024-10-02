//package com.hms.hms.model;
//
//public class RadiologicalTest extends LabTest {
//    private String plateDimension;
//
//    // Full constructor
//    public RadiologicalTest(String title, double cost, boolean isAvailable, String plateDimension) {
//        super(title, cost, isAvailable);
//        this.plateDimension = plateDimension;
//    }
//
//    // Overloaded constructor without plateDimension
//    public RadiologicalTest(String title, double cost, boolean isAvailable) {
//        super(title, cost, isAvailable);
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + "\n"
//                + "Plate Dimension: " + (plateDimension != null ? plateDimension : "N/A") + "\n";
//    }
//
//    // Getters and setters (with validation)
//    public String getPlateDimension() {
//        return plateDimension;
//    }
//
//    public void setPlateDimension(String plateDimension) {
//        if (plateDimension == null || plateDimension.isEmpty()) {
//            throw new IllegalArgumentException("Plate dimension cannot be null or empty");
//        }
//        this.plateDimension = plateDimension;
//    }
//}
