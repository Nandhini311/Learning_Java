public class PrimeNumberCounter {
    public static void main(String[] args) {
        //boolean answer = isPrime(7);
        //System.out.println(answer);
        int primeNumberCounter = 0;
        for (int i = 10; i<= 50; i++){
                if (isPrime(i)) {
                    System.out.println(i + " is a prime number");
                    primeNumberCounter++;
            }
        }
        System.out.println("Total number of prime numbers between 10 and 50 is: " + primeNumberCounter);
        }
    public static boolean isPrime(int n){
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i*i <= n ; i+=2 )
            //increment is +2 here as there is check for even number before this line
            /* this is based on the idea that for every factor greater than square root of n,
            there is a factor smaller than square root of n that is a pair of it
            let's say n = 36, (1, 36), (2, 18), (3, 12), (4,9), (6,6) */
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }


}
