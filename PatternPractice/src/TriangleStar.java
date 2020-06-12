import java.util.Scanner;

public class TriangleStar {
    public static void pattern() {
        System.out.println("Hello! How many stars would you like?");
        Scanner scan = new Scanner(System.in);
        int numOfStars = scan.nextInt();

        // outer loop is number of rows
        // inner loop is number of columns


        for (int i = 1; i <= numOfStars; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = numOfStars - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }

