import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
        //cuz myContacts is an array list which stores contact object as elements.
    }

    public boolean addNewContact(Contact contact){
        if(myContacts.contains(contact)){
            return false;
        }
        else {
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        boolean flag = true;
        if(myContacts.contains(oldContact))
        {
            int index = myContacts.indexOf(oldContact);
            myContacts.set(index, newContact);
        }
        else
        {
            flag = false;
        }
        return flag;
    }

    public boolean removeContact(Contact contact){

        int index = myContacts.indexOf(contact);
        if(index < 0){
            return false;
        }
        else {
            myContacts.remove(contact);
            return true;
        }
    }

    public int findContact(Contact contact){
        int index = myContacts.indexOf(contact);
        return index;
    }

    public int findContact(String myNumber){
        int index = -1;
        for(Contact i: myContacts){
            if(i.getPhoneNumber().toLowerCase().equals(myNumber.toLowerCase())){
                index = myContacts.indexOf(i);
            }
        }
        return index;
    }

    public Contact queryContact(String Name){
        for(Contact i: myContacts){
            if(i.getName().toLowerCase().equals(Name.toLowerCase())){
                return i;
            }

        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List: ");
        for(Contact i: myContacts){
            System.out.printf("%s -> %s %n",i.getName(), i.getPhoneNumber());
        }
    }
}