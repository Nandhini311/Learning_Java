import java.util.ArrayList;

public class BankingApplicationAutoBoxing {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob S", 1000.0);
        System.out.println(bob);

        Bank bank = new Bank("Chase");
        bank.AddNewCustomer("Jane A", 500.0);
        System.out.println(bank);

        bank.performTransaction("Jane A", -10.25);
        bank.performTransaction("jane A", -75.01);
        bank.printStatment("Jane a");

        bank.AddNewCustomer("bob s", 25);
        bank.performTransaction("Bob S", 100);
        bank.printStatment("Bob S");
    }
}



class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>(500);

    public Customer(String name, double initialDeposit){
        this.name = name;
        if(initialDeposit == 0.00){
            transactions.add(0.00);
        }
        else {
        transactions.add(initialDeposit);
        }
    }

    public String getCustomerName(){
        return name;
    }

    public ArrayList<Double> getTransactions(){
        return transactions;
    }
}
//isn't this boilerplate code? only constructors and getters? isn't it better to use record for this.

class Bank{
    private String BankName;
    private ArrayList<Customer> customerList = new ArrayList<>(10000);
    //if customer is already not in the bank, he should be newly added;

    public Bank(String name){
        this.BankName = name;
    }

    public String toString() {
        return "Bank{" +
                "name='" + BankName + '\'' +
                ", customers=" + customerList +
                '}';
    }

    public Customer getCustomer(String customerName){
        for(var i: customerList){
            if(i.getCustomerName().equalsIgnoreCase(customerName)){
                System.out.println("Customer");
                return i;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null;
    }

    //now adding a new customer.
    public void AddNewCustomer(String customerName, double initialDeposit){
        if(getCustomer(customerName)==null){
            Customer newCustomer = new Customer(customerName, initialDeposit);
            customerList.add(newCustomer);
            System.out.println("New Customer added: " + newCustomer);
        }
    }

    public void performTransaction(String customer, double value){
        for(var i: customerList){
           if(i.getCustomerName().equalsIgnoreCase(customer)){
               i.getTransactions().add(value);
               return;
           }
        }
            System.out.println("Customer not found");
    }

    public void printStatment(String customerName){
        for(var i: customerList){
            if(i.getCustomerName().equalsIgnoreCase(customerName)){
                System.out.println("_".repeat(20));
                System.out.println("This transaction is of Customer: "+ customerName);
                for(var j: i.getTransactions()){
                    System.out.printf("$%10.2f (%s)%n", j, j < 0 ? "debit" : "credit");
                }
                return;
            }
        }
    }
}