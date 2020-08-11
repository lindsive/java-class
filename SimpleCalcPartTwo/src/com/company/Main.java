package com.company;

public class Main {

    public static void main(String[] args) {
        SimpleCalc calculator = new SimpleCalc();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("division = " + calculator.getDivisionResult());
    }
}
