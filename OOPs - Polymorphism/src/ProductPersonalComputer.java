public class ProductPersonalComputer extends  ProductInheritance{
    //inheritance allows you to inherit or extend only one parent class
    //ProductPersonalComputer will now have all the methods and fields of the parent class.

    //by this we are saying that Personalcomputer is composed of these three classes as well.
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public ProductPersonalComputer(String model, String manufacturer,
                                   ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200, 10, "yellow");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }

    /*public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }*/
}
