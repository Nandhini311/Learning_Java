public class AnimalDog extends AnimalInheritance {
    /*this means that now dog is a sub/child class of AnimalInheritance class.
    a class can only specify one and only one class in its extends clause
   */

    private String earShape;
    private String tailShape;


    //when an subclass is instantiated, java automatically call the constructor of the superclass first to ensure
    //the parent class is initialized properly.
    //implicit constructor
    public AnimalDog(){
        super("Mutt", "Big", 50);
        //will call the  AnimalInheritance three parameter constructor for initializing values.
        /*a way to call a constructor on the super class directly from the subclass's constructor
        if you don't make a call to super(), java will do it for you default
        if your super class doesn't have a default constructor, then you must explicitly call super() in all
        of your constructors*/
    }

    public AnimalDog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public AnimalDog(String type, double weight, String earShape, String tailShape){
        super(type, weight < 15 ? "small": (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "AnimalDog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
    
    @Override
    public void makesNoise(){
        //type is first initialized as a private field; so even the subclass cannot access it
        //to resolve this, we can use protected modifier - it will allow subclass to access parent's field.
        //conditional encapulisation
        if(type == "Wolf"){
        bark();
        System.out.println();}
    }

    @Override
    public void move(String speed){
        super.move(speed);
        //System.out.println("Dogs walk, run and wag tails");

        if(speed == "slow") {
                walk();
                wagTail();

        }else
            {
                run();
                bark();
            }
        }

    public void bark(){
        System.out.print("Woof");
    }

    public void run(){
        System.out.print("Dog Running ");
    }

    public void walk(){
        System.out.print("Dog Walking ");
    }

    public void wagTail(){
        System.out.print("Tail Wagging ");
    }
}

