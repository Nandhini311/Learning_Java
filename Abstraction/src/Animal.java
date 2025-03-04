public abstract class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight){
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    //abstract method cannot be private; cuz then the subclasses won't even be able to view it
    public abstract void move(String speed); //{} not allowed - considered empty method body
    public abstract void makeNoise();
    public String getExplicitType(){
        return getClass().getName() + "/ " + type;
    }
}


abstract class Mammal extends Animal{
    public Mammal(String name, String size, double weight){
        super(name, size, weight);
    }

    public abstract void shedhair();

    //implementation of other methods aren't mandatory since this is also an abstract class.
}
