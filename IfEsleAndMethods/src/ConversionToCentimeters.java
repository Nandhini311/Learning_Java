public class ConversionToCentimeters {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(6));
        System.out.println(convertToCentimeters(5,10));
    }
    //feet to centimeters
    public static double convertToCentimeters(int inputHeight){
        double heightInCms = inputHeight * 30.48d;
        return heightInCms;
    }
    public static double convertToCentimeters(int heightFeet, int heightRemainingInches) {
        double heightInCms = (heightFeet * 30.48d) + (heightRemainingInches*2.54d) ;
        return heightInCms;
    }
}
