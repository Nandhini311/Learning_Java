public class DigitSum {
    public static int SumDigit(int num){
        if (num < 0) return -1;
        int sum = 0;
        while(num>1) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of digits of " + SumDigit(9999));
    }
}
