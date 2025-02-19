public class ProductInheritance {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    //parameterless constructor - since super() will be by default called in the child class
    public ProductInheritance(){
    }

    public ProductInheritance(String model, String manufacturer){
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

// public class Monitor extends ProductInheritance(){} - will throw error as only one class can be public
class Monitor extends ProductInheritance{
    private int size;
    private String resolution;

        public Monitor(String model, String manufacturer, int size, String resolution ) {
            super(model, manufacturer);
            this.size = size;
            this.resolution = resolution;
        }
        public void drawPixelAt(int x, int y, String color){
            System.out.println(String.format(
                    "Drawing pixel at %d, %d in color %s", x, y, color));
        }
}

class Motherboard extends ProductInheritance{
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer,int ramSlots, int cardSlots, String bios ){
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now Loading");
    }
}

class ComputerCase extends ProductInheritance{
    private String powerSupply;

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public  void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}

