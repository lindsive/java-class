package com.company;

public class Shirt {

    private String color;
    private char size;

    public static void putOn() {
        System.out.println("shirt is on!");
    }

    public static void takeOff() {
        System.out.println("shirt is off!");
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setSize(char newSize) {
        this.size = newSize;
    }
}
