
public class PyramidPattern {

    public static void pyramidPattern(int n) {
        for (int i = 0; i < n; i++) { // outer loop for number of rows (n)
            for (int j = n - 1; j > i; j--) { // inner loop for spaces
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) { // inner loop for number of columns
                System.out.print("* "); // print star
            }

            System.out.println(); // ending line after each row
        }
    }
}
