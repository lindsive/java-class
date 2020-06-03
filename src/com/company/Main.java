package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        System.out.println("challenge 1");
        // using the for statement, call the calculateInterest method with
        // the amount of 10000 w an interestRate of 2, 3, 4, 5, 6, 7, 8
        // and print the results to the console

        for(int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println(" ");
        System.out.println("challenge 2");
        // how would you modify the for loop above to do the same thing
        // as shown but to start from 8% and work back to 2%
        for(int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println(" ");
        System.out.println("challenge 3");

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number");
                if (count == 10) {
                    break;
                }
            }
        }


    }
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    // create a for statement using any range of numbers
    // determine if the number is a prime number using the isPrime method
    // if it is a prime number, print it out and increment a count of the
    // number of the prime numbers found
    // if the count is 3 exit the for loop
    // hint: use the break; statement to exit


    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
