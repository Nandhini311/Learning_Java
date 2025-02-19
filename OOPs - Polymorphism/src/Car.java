public class Car {
    private String brand;
    private String model;
    private double pricePerDay;
    private CarEngine engine; //Composition

    public Car(String brand, CarEngine engine, String model, double pricePerDay) {
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.engine = engine;
    }


    public String showDetails() {
        return ( "Car" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", pricePerDay= " + pricePerDay +
                "$ Engine " + engine.showDetails());
    }
}