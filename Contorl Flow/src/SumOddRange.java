public class SumOddRange {
    public static void main(String[] args) {
        System.out.print(sumOdd(1, 11));
    }

    public static boolean isOdd(int number) {
        if (number < 0) return false;
        if (number % 2 != 0) return true;
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sumOddValues = 0;
        if (start > 0 && end > 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sumOddValues += i;
                }
            }
            return sumOddValues;
        }
        return -1;
    }
}
