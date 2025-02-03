public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(9));
    }
    public static int sumFirstAndLastDigit(int number){
        if (number<0) return -1;
        int sum = 0, lastDigit = 0;
        lastDigit = number%10;
        while(number>=10){
            number = number/10;
        }
        System.out.println(number);
        sum = number+lastDigit;
        return sum;
    }
}