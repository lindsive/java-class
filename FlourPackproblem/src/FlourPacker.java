public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((goal < 0) || (bigCount < 0) || (smallCount < 0)) {
            return false;
        }

        while (5 * bigCount > goal) {
            bigCount--;
        }

        if ((goal - (5 * bigCount) <= smallCount)){
            return true;
        }
        return false;
    }
}
