public class BankAccount {
    private String accountNumber;
    private double balance;
    private BankTransactionHistory transactionHistory;

    BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        transactionHistory = new BankTransactionHistory();
    }

    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Insufficient funds ! ");
        }
        else {
            balance -= amount;
            transactionHistory.addTransaction("Withdrew: $"+ amount);
        }
    }

    public void deposit(double amount){
        balance = amount+ balance;
        transactionHistory.addTransaction("Deposited: $"+ amount);
    }

    public void showBalance(){
        System.out.println("Account "+ accountNumber + " - Balance: $"+ balance);
        transactionHistory.showHistory();
    }




}

class Customer {
    private String name;
    private String customerID;
    private BankAccount bankAccount;

    Customer(String name, String customerID, String accountNumber, double balance) {
        this.name = name;
        this.customerID = customerID;
        bankAccount = new BankAccount(accountNumber, balance);
    }

    public void showDetails() {
        System.out.println("Customer: " + name + " (ID: " + customerID + ")");
        bankAccount.showBalance();
    }

    public BankAccount account(){
        return  bankAccount;
    }

}


