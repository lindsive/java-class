package com.company;

public class Main {

    public static void main(String[] args) {
        String method1 = getDurationString(61, 1);
        String method2 = getDurationString(1);
        System.out.println(method1);
        System.out.println(method2);

    }
    public static String getDurationString(double minutes, double seconds) {
        if ((minutes <= 0) || (seconds <= 0) || (seconds >= 59)) {
            return "invalid values";
        } else {
            double secondsRemaining = seconds / 60;
            double hoursInMinutes = minutes / 60;
            System.out.println("there are " + hoursInMinutes + " hours in " + minutes + " minutes");
            System.out.println("testing calculations of secondsInMinutes" + hoursInMinutes);

        }
        return "valid";
    }

    public static String getDurationString(double seconds) {
        if (seconds <= 0) {
            return "invalid value";
        } else {
            double minutesInSeconds = seconds / 60;
            System.out.println("there are " + minutesInSeconds + " minutes in " + seconds + " seconds");
        }
        return "valid";
    }
}
