public class BankTransactionHistory {
    private String lastTransaction;

    public void addTransaction(String transaction){
        lastTransaction = transaction;
    }

    public void showHistory(){
        if(lastTransaction != null){
            System.out.println("Last Transaction " + lastTransaction);
        }
        else{
            System.out.println("No Transactions yet.");
        }
    }
}
