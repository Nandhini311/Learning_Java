public class PToys extends ProductForSale {
    public PToys(String type, double price, String description){
        super(type, price, description);
    }
    @Override
    public void showDetails() {
        System.out.printf("The toy type is: "+ type + "%n description: + %n" + " and it costs: " + price + "$ %n");
    }

}
