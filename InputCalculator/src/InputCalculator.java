import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            boolean hasInt = scanner.hasNextInt();

            if (hasInt) {
                int num = scanner.nextInt();
                sum += num;
                counter++;

                int average = (sum / counter);

            } else {
                break;
            }
            scanner.nextLine();

        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / counter));

        scanner.close();
    }
}


