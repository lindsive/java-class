public class Main {
    public static void main(String[] args) {
        boolean check1 = TeenNumberChecker.hasTeen(9, 99, 19);
        boolean check2 = TeenNumberChecker.hasTeen(23, 15, 42);
        boolean check3 = TeenNumberChecker.hasTeen(22, 23, 134);
        System.out.println(check1);
        System.out.println(check2);
        System.out.println(check3);

        boolean checkTeen1 = TeenNumberChecker.isTeen(9);
        boolean checkTeen2 = TeenNumberChecker.isTeen(13);

        System.out.println(checkTeen1);
        System.out.println(checkTeen2);
    }
}
