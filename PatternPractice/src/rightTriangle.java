public class rightTriangle {
    public static void rTriangle(int n) {
        for (int i = 0; i <= n; i++) { // outer loop for number of rows (n)
            for (int j = n; j <= n; j++) { // inner loop for spaces
                System.out.print(" "); // print space
            }
            for (int j = 0; j <= i; j++) { // inner loop columns
                System.out.print("* "); // print star
            }
            System.out.println(); // ending line after each row
        }
    }
}

