public class LargestPrime_imp {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }
    public static int getLargestPrime(int number){
        if(number <= 0 || number == 1){
            return -1;
        }
        int largestPrimeNumber = -1;
        while(number%2==0){
            number = number/2;
            largestPrimeNumber = 2;
        }

        while(number%3 ==0)
        {
            number = number/3;
            largestPrimeNumber = 3;
        }
        for(int i=5; i*i <= number; i=i+2){
            while(number%i ==0){
                number = number/i;
                largestPrimeNumber = i;
            }
        }
        if (number > 2) {
            largestPrimeNumber = number;
        }
        return largestPrimeNumber;
    }
}