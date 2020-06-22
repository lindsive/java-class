package com.company;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    // setters
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // getters
    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public double getAdditionResult() {
        double sumValue = firstNumber + secondNumber;
        return sumValue;
    }

    public double getSubtractionResult() {
        double subtractionValue = firstNumber - secondNumber;
        return subtractionValue;
    }

    public double getMultiplicationResult() {
        double multiplyValue = firstNumber * secondNumber;
        return multiplyValue;
    }

    public double getDivisionResult() {
        double divisionResult = firstNumber / secondNumber;

        if(secondNumber == 0) {
            return 0;
        }
        return divisionResult;
    }
}
