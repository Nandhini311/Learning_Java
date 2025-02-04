public class ConstructorChallenge {
    private String name;
    private int creditLimit;
    private String emailAddress;

    //these fields are private, so won't be able to access them outside the class directly

    //creating the getter method.
    //if we are using non-static fields inside a method, the method cannot be static.
    public String getName(){
        return name;
    }

    public int getCreditLimit(){
        return creditLimit;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public ConstructorChallenge(String Name, int creditLimitValue, String email){
        name = Name;
        creditLimit = creditLimitValue;
        emailAddress = email;
    }
    public ConstructorChallenge(){
        this("Default Name", 80000, "Default emailAddress");
    }

    public ConstructorChallenge(String Name, String email){
        this(Name, 75000, email);
    }

    public void display(){
        System.out.println("Values of this object are" + " " + name + " " + creditLimit+ " " + emailAddress);
    }
}
