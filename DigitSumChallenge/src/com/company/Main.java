package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return - 1;
        }
        int sum = 0;

        // least significant digit of 125
        // 125 / 10 == 12;
        // 12 * 10 = 120;
        // 125 - 120 = 5

        while (number > 0) {
            // extract least significatio digit
            int digit = number % 10;
            sum += digit;

            // drop least signficiant digit
            number /= 10;
        }
        return sum;
    }
}
