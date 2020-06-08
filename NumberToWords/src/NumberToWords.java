public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0)
            System.out.println("Invalid Value");

        if (number == 0)
            System.out.println("Zero");

        int lastDigit;
        int num = reverse(number);

        while (num > 0) {
            lastDigit = num % 10;

            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
            }
            num = num / 10;
        }
        int difference = getDigitCount(number) - getDigitCount(reverse(number));
        if (difference > 0) {
            for(int i = 0; i < difference; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int reversed = 0;
        int num  = number;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;

        int count = 0;
        if (number == 0)
            count++;

        while(number > 0) {
            int digit = number % 10;
            number /= 10;
            count++;
        }
        return count++;
    }
}
