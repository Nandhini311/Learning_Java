public class EqualSumChecker {
    public static void main(String[] args) {
        boolean equalSum = hasEqualSum(1, -1, 0);
        System.out.println(equalSum);
    }
    public static boolean hasEqualSum(int a, int b, int c){
        return ((a + b) == c);
    }
}