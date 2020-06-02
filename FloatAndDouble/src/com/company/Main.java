package com.company;

public class Main {

    public static void main(String[] args) {
	    int intVal = 5 / 2;
	    float floatVal = 5f / 2f;
	    double doubleVal = 5d / 2d;
        System.out.println("int value= " + intVal);
        System.out.println("float value= " + floatVal);
        System.out.println("double value= " + doubleVal);

//        challenge
        double lbs = 200d;
        double kilo = lbs * 0.45359237d;

        System.out.println("result = " + kilo);
    }
}
