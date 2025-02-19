//correct
public class CarEngine {
    private String type;
    private String horsepower;

    public CarEngine(String horsepower, String type) {
        this.horsepower = horsepower;
        this.type = type;
    }

    public String showDetails(){
        return ("Horse power "+ horsepower + " type (petrol/diesel/electric): "+ type);
    }
}
