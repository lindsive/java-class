public class LeftTriangle {
    public static void printStars(int n) {
        for (int i = 0; i < n; i++) { // outer loop for number of rows (n)
            for (int j = 2 * (n - i); j>= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
