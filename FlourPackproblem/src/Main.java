public class Main {
    public static void main(String[] args) {
        System.out.println("1 big bag, 0 small bags, goal of 4 bags " + FlourPacker.canPack(1, 0, 4));
        System.out.println("1  big bag, 0 small, goal 5 " + FlourPacker.canPack(1, 0, 5));
        System.out.println("0 big bag, 5 small bag, goal 4 " + FlourPacker.canPack(0, 5, 4));
        System.out.println("2 big bag, 2 small bag, goal 11 " + FlourPacker.canPack(2, 2, 11));
        System.out.println("-3 big bag, 2 small bag, goal 12 " + FlourPacker.canPack(-3, 2, 12));
    }
}
