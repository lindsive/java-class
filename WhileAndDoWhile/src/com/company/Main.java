package com.company;

public class Main {

    public static void main(String[] args) {
//	    int count = 1;
//	    while (count != 6) {
//            System.out.println("count value is " + count);
//            count++;
//        }
//
//	    while(true) {
//	        if (count == 6) {
//	            break;
//            }
//            System.out.println("count value is " + count);
//	        count++;
//        }

//        int count = 1;
//	    do {
//            System.out.println("count value was " + count);
//            count++;
//        } while(count != 6);

       int number = 4;
       int finishNumber = 20;
       int evenNumbersFound = 0;

       while(number <= finishNumber) {
           number++;
           if (!isEvenNumber(number)) {
               continue;
           }
           evenNumbersFound++;
           if (evenNumbersFound >= 5) {
               break;
           }
           System.out.println("even number " + number);
       }
        System.out.println("total even numbers found = " + evenNumbersFound);
    }

    // challenge 1
    // create a method called isEvenNumber that takes a parameter of type int
    // its purpose is to determine if the argument passed to the method is an even number or not
    // return true if an even number, otherwise, return false

    public static boolean isEvenNumber(int num) {
        if ((num % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    // challenge 2
    // modify the while code
    // make it also record the totsl number of even numbers it has found
    // and break once 5 are found
    // at the end, display total number of even numbers found

//    int number = 4;
//    int finishNumber = 20;
//
//       while(number <= finishNumber) {
//        number++;
//        if (!isEvenNumber(number)) {
//            continue;
//        }
//        System.out.println("even number " + number);
//    }
//}
}
