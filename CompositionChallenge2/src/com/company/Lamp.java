package com.company;

public class Lamp {

    private String sytle;
    private boolean battery;
    private int glowRating;

    public Lamp(String sytle, boolean battery, int glowRating) {
        this.sytle = sytle;
        this.battery = battery;
        this.glowRating = glowRating;
    }

    public void turnOn() {
        System.out.println("lamp -> turning on");
    }

    public String getSytle() {
        return sytle;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlowRating() {
        return glowRating;
    }
}
