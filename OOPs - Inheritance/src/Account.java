public class Account {
    private long accNumber;
    private int accBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public long getAccNumber() {
        return accNumber;
    }

    public int getAccBalance() {
        return accBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccBalance(int accBalance) {
        this.accBalance = accBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public void depositFund(int amount){
        accBalance += amount;
    }

    public void withdrawFund(int amount){
        if (accBalance - amount < 0){
            System.out.println("You cannot withdraw ! balance becomes negative");
        }
        else{accBalance = accBalance - amount;}

    }

    //constructor overloading - constructor with same names differentiated by the paramters or the order of the params.
    //constructor chaining is when one constructor calls another overloaded constructor
    public Account(){
        //this() must be the first statement in the constructor.
        this(56789, 2, "Default Name", "Default email address", "Defaul number" );
        //these default values can be initialzized if an object is created without any params.
        System.out.println("Empty constructor called");

        //so when a user doesn't a
    }

    public Account(long number, int balance, String customerName, String email, String phone){
        System.out.println("Account constructor with parameters called");
        phoneNumber = phone;
        accNumber = number;
        accBalance = balance;
        this.customerName = customerName;
        this.email = email;
    }

    public Account(String customerName, String email, String phone){
        this(8999890, 29009, customerName, email, phone);
    }

    public void Display(){
        System.out.println("Below are the details");
        System.out.println("Account Number: " + accNumber);
        System.out.println("Balance: " + accBalance);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
