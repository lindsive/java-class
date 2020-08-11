package com.company;

public class Car {

    // state component
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // setters
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    // getters
    public String getModel() {
        return this.model;
    }
}