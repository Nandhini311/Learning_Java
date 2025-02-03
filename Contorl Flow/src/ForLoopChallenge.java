public class ForLoopChallenge {
    public static void main(String[] args) {
        calculateInterest(100.00);
    }
    public static void calculateInterest(double amount){
        for(double interest=7.5; interest<=10.0; interest+=0.25){
            double interestAmount = (amount * (interest/100));
            if(interestAmount> 8.5){
                break;
            }
            System.out.println(amount + " at " + interest + "% interest = $" +interestAmount);

        }
    }
}
