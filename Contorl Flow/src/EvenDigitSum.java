public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(EventDigit(123456789));
    }
    public static int EventDigit(int number){
        if(number<0) return -1;
        int sum = 0, value = 0;
        while(number>0){
            value = number%10;
            if(value%2 ==0){
                sum+=value;
            }
            number = number/10;
        }
        return sum;
    }
}
