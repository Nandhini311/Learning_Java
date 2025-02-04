public class AccountMain {
    public static void main(String[] args) {
       /* Account nandhini = new Account();
        nandhini.setCustomerName("Nandhini");
        nandhini.setAccNumber(346789023);
        nandhini.setAccBalance(70);
        nandhini.setEmail("s311nandhini@gmail.com");
        nandhini.setPhoneNumber("+91 7708958502");

        nandhini.withdrawFund(700);
        nandhini.depositFund(20);
        System.out.println(nandhini.getAccBalance());
        nandhini.withdrawFund(70);
        System.out.println(nandhini.getAccBalance());*/
        //this doesn't look effective for initializing values for the constructor objects.

        //constructors are special method which are used to initialize values for object
        //by default for every class, there is an implicit constructor created. However, if you create one explicitly, implicit one won't be created.
        //constructor shouldn't have any return type, only access modifier, name should be same as that of the class.
        Account acc1 = new Account(7890521, 5678, "Nandhini", "s311nandhini@gmail.com", "7708958502");
        acc1.Display();

        Account acc2 = new Account();
        System.out.println(acc2.getCustomerName());

        Account acc3 = new Account();
        acc3.Display();

        Account acc4 = new Account("Tim","tim@gmail.com", "9566789321");
        acc4.Display();

    }
}
