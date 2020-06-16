import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter Number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }

            } else {
                break;
            }
            scanner.nextLine(); // handle input
        }
        System.out.println("min = " + min + ", max = " + max);
        scanner.close();
    }
}

// MY ATTEMPT

// public class MinAndMaxInputChallenge {
//    Scanner scanner = new Scanner(System.in);

//  int min = 0;
//    int max = 0;

//     while (true) {
//        System.out.println("Enter number");
//        boolean hasNextInt = scanner.hasNextInt();
//
//        if (hasNextInt) {
//            int enteredNum = scanner.nextInt();
//
//            if (enteredNum < minNum) {
//                enteredNum = minNum;
//                System.out.println(enteredNum + " is the new minimum number");
//            }
//            if (enteredNum > maxNum) {
//                enteredNum = maxNum;
//                System.out.println(enteredNum + " is the new maximum number");
//            }
//        } else {
//            System.out.println("Invalid Value");
//            System.out.println("The minimum number is: " + minNum);
//            System.out.println("The maximum number is: " + maxNum);
//        }
//        scanner.nextLine();
//    }
// }
