public class Horse extends Mammal {
    //Mammal inherits all the methods/fields from Animals.
    //Horse inherits all the methods/fields of Animals from Mammal + the ones that of Mammal itself.
    //However since Horse class is not abstract, all the methods should be defined here.


    //constructor
    public Horse(String type, String size, double value){
        super(type, size, value);
    }

    //other methods
    @Override
    public void makeNoise(){
        System.out.println(type + "neighs");
    }

    @Override
    public void shedhair(){
      System.out.printf("Sheds hair in the spring");
    }
    @Override
    public void move(String speed) {
        if(speed == "slow"){
            System.out.printf(getExplicitType() + " is walking");
        }
        else{
            System.out.printf("The horse is running");
        }
    }
}
