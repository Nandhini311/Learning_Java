public class AnimalFish extends AnimalInheritance{
    private int gills;
    private int fins;

    public AnimalFish(String type, double weight, int gills, int fins){
        super(type, "small", weight); //calls the parameterized constructor in the parent class
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.print("muscles moving ");
    }

    private void moveBackFin(){
        System.out.print("backfin moving ");
    }

    public void move(String speed){
        super.move(speed);
        moveMuscles();
        if (speed == "fast"){
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "AnimalFish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
