package com.company;

public class Main {

    public static void main(String[] args) {
//	    int switchValue = 1;
//
//	    switch (switchValue) {
//            case 1:
//                System.out.println("value was 1");
//                break;
//
//            case 2:
//                System.out.println("value was 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("was a 3, 4, or 5");
//                break;
//
//            default:
//                System.out.println("not 1 or 2");
//                break;
//        }

        // challenge
        char letter = 'C';

        switch (letter) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("the letter is " + letter);
                break;
            default:
                System.out.println("the letter wasn't A, B, C, D, or E");
                break;
        }

        String month = "JUne";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("not sure");
                break;
        }
    }
}
