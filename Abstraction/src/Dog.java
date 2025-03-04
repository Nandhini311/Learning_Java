public class Dog extends Animal {
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    //there is a parameterised constructor in the parent class; so java provide default constructor.
    @Override
    public void move(String speed) {
        if(speed == "slow"){
        System.out.printf(type + getExplicitType() + "is walking %n");
        }
    }

    @Override
    public void makeNoise() {
        if(type == "Wolf"){
            System.out.printf(type +" is Howling %n");
        }
        else{
            System.out.printf("Woof! %n");
        }
    }

}
