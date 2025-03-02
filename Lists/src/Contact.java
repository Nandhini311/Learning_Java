public class Contact {
    private String myNumber;
    private String name;

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.myNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return myNumber;
    }

    public static Contact createContact(String name, String phoneNumber){
        Contact contact = new Contact(name, phoneNumber);
        return contact;
    }
}
