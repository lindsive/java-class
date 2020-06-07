public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1)
            return false;

        int sum = 0;
        int perfectNum = 1;

        while (perfectNum < number) {
            if (number % perfectNum == 0)
                sum = sum + perfectNum;
            perfectNum++;

        }
        return perfectNum == sum;
    }
}
