public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if ((num1 >= 10 && num1 <= 1000) && (num2 >= 10 && num2 <= 1000) && (num3 >= 10 && num3 <= 1000)) {
            int num1Last = num1 % 10;
            int num2Last = num2 % 10;
            int num3Last = num3 % 10;

            if ((num1Last == num2Last) || (num1Last == num3Last) || (num2Last == num3Last))
                return true;
        }
        return false;
    }

    public static boolean isValid(int valid) {
        if (valid >= 10 && valid <= 1000) {
            return true;
        }
        return false;
    }
}
