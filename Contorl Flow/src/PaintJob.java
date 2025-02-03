public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <=0 || extraBuckets <0 ){
            return -1;
        }
        double areaToBeCovered = width*height; //correct
        double remainingArea = areaToBeCovered - (extraBuckets*areaPerBucket);
        return getBucketCount(remainingArea, areaPerBucket);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <=0 ){
            return -1;
        }
        double areaToBeCovered= (width*height);
        return getBucketCount(areaToBeCovered, areaPerBucket);
    }
    public static int getBucketCount(double areaPerBucket, double area){
        if(areaPerBucket <= 0 || area <= 0){
            return -1;
        }
        return (int)(Math.ceil(area/areaPerBucket));
    }
}