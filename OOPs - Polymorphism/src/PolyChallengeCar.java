public class PolyChallengeCar {
    private String description;

    public PolyChallengeCar(String description){
        this.description = description;
    }
    public void startEngine(){
        System.out.println("Starting the car engine");
    }

    public void drive(){
        System.out.println("Driving the car, type is" + this.getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Running the car engine");
    }
}

class GasPoweredCar extends PolyChallengeCar {
    private double avgKmPerLitre;
    private int cylinder = 6;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinder){
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinder = cylinder;
    }

    @Override
    public void startEngine(){
        System.out.printf("All cylinders %d are filled, ready to go ! %n", cylinder);
    }

    public void runEngine(){
        System.out.printf("Gas is exceeding the average: .2%f", avgKmPerLitre);
    }
}

class ElectricCar extends PolyChallengeCar {
    private double avgKmPerCharge;
    private int batterySize = 2;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize){
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine(){
        System.out.printf("All Batteries (%d) are charged, ready to go ! %n", batterySize);
    }

    public void runEngine(){
        System.out.printf("Engine is exceeding the average battery consumption per kilometer: .2%f", avgKmPerCharge);
    }
}

class HybridCar extends PolyChallengeCar {

    private double avgKmPerLiter;
    private int cylinders = 6;

    private int batterySize;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter, int cylinders,
                     int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.%n", cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLiter);
    }
}