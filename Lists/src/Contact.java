public class MobileContact {
    private String myNumber;
    private String name;

    public MobileContact(String name, String phoneNumber){
        this.name = name;
        this.myNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return myNumber;
    }

    public static MobileContact createContact(String name, String phoneNumber){
        MobileContact contact = new MobileContact(name, phoneNumber);
        return contact;
    }
}
