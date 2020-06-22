package com.company;

public class Main {

    public static void main(String[] args) {
        // objects from the Class called Car
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}
