package com.company;

public class Bed {

    private String size;
    private int comfortLevel;
    private Dimensions dimensions;

    public Bed(String size, int comfortLevel, Dimensions dimensions) {
        this.size = size;
        this.comfortLevel = comfortLevel;
        this.dimensions = dimensions;
    }

    public void makeBed() {
        System.out.println("bed has been made");
    }

    public String getSize() {
        return size;
    }

    public int getComfortLevel() {
        System.out.println("the comfort level is: " + comfortLevel);
        return comfortLevel;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
