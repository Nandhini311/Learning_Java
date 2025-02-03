public class ForLoop {
    public static void main(String[] args) {
        //for loop for when you know the exact number of items iteration needs to be done.
        for(int counter = 1; counter <=5; counter++){
            System.out.println(counter);
        }

        for(double rate = 2.0; rate <= 5.0; rate++){
            System.out.println(calculateInterest( 10000d,rate));
            System.out.println(rate); //added
        }
    }

    public static double calculateInterest(double amount, double interstRate){
        return amount * interstRate / 100;
    }
}
