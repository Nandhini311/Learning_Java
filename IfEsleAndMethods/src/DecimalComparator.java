public class DecimalComparator {
    public static void main(String[] args) {
        boolean answer = areEqualByThreeDecimalPlaces(-3.568, -3.56822);
        System.out.println(answer);
    }
    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2){
        int newValue1 = (int) (value1*1000);
        int newValue2 = (int) (value2*1000);
        return (newValue1 == newValue2);
    }

}