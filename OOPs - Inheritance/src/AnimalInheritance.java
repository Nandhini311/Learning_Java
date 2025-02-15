public class AnimalInheritance {
    //Animal class
    protected String type;
    private String size;
    private double weight;


    //default constructor
    public AnimalInheritance(){

    }

    public AnimalInheritance(String type, String size, double weight){
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    //the default parameter now doesn't get created

    @Override
    public String toString() {
        return "Inheritance{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }

    public void makesNoise(){
        System.out.println(type + " This animal makes some kind of noise");
    }
}
