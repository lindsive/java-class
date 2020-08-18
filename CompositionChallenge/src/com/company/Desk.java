package com.company;

public class Desk {

    private String color;
    private int drawers;
    private String material;
    private Dimensions dimensions;

    public Desk(String color, int drawers, String material, Dimensions dimensions) {
        this.color = color;
        this.drawers = drawers;
        this.material = material;
        this.dimensions = dimensions;
    }

    public void clean() {
        System.out.println("desk has been cleaned");
    }

    public String getColor() {
        return color;
    }

    public int getDrawers() {
        return drawers;
    }

    public String getMaterial() {
        return material;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
