public class Main {
    public static void main(String[] args) {
//        System.out.println(NumberOfDaysInMonth.isLeapYear(-1600));
//        System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
//        System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
//        System.out.println(NumberOfDaysInMonth.isLeapYear(2000));

        NumberOfDaysInMonth.getDaysInMonth(1, 2020 );
        NumberOfDaysInMonth.getDaysInMonth(2, 2020 );
        NumberOfDaysInMonth.getDaysInMonth(2, 2018 );
        NumberOfDaysInMonth.getDaysInMonth(-1, 2020 );
        NumberOfDaysInMonth.getDaysInMonth(1, -2020 );
        System.out.println(NumberOfDaysInMonth.isLeapYear(9000));

    }
}
