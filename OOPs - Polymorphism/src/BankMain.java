//composition.

public class BankMain {
    public static void main(String[] args) {
        Customer customer = new Customer("Nandhini", "11804841", "384267804569", 80000.00);
        customer.showDetails();

        customer.account().deposit(8000);
        customer.showDetails();
    }
}
