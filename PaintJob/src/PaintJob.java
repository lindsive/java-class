public class PaintJob {
    public static int getBucketCount(double width,
                                     double height,
                                     double areaPerBucket,
                                     int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        double calculatedBuckets = Math.ceil((area / areaPerBucket) - extraBuckets);

        int amount = (int) calculatedBuckets;
        return amount;


    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if ((width <= 0 || height <= 0 || areaPerBucket <= 0)) {
            return -1;
        }

        double area = width * height;
        double neededBuckets =  Math.ceil(area / areaPerBucket);

        double needed = neededBuckets;
        return (int) needed;

    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if ((area <= 0 || areaPerBucket <= 0)) {
            return -1;
        }

        double neededBuckets = Math.ceil( area / areaPerBucket);
                return (int) neededBuckets;

    }
}
