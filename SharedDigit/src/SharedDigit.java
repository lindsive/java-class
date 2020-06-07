public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {
            int firstNum1 = num1 / 10;
            int lastNum1 = num1 % 10;
            int firstNum2 = num2 / 10;
            int lastNum2 = num2 % 10;

            if (firstNum1 == firstNum2 || firstNum1 == lastNum2 || lastNum1 == firstNum2 || lastNum1 == lastNum2)

                return true;
        }
        return false;
    }
}
