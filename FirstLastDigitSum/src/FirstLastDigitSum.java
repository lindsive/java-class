public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = number % 10;
        int firstDigit = number;

        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        int sum = (firstDigit + lastDigit);

        if (sum < 0) {
            return -1;
        }
        return sum;
    }

}
