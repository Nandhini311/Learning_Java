public class Item {
    private String name;
    private String type;
    private double price;
    private String size = "MEDIUM"; //default value;

    //constructor
    Item(String name, String type, double price){
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }

    public double getBasePrice(){
        return price;
    }

    public double getAdjustedPrice() {
        double value = switch (this.size) {
            case "SMALL" -> getBasePrice()*0.9;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
        return value;
    }

    public String getName(){
        if(type.equals("DRINKS") || type.equals("SIDES")){
            return size + " " + name;
        }
        return name;
    }

    public void setSize(String size){
        this.size = size;
    }

    public void printItem(){
        System.out.printf("The price of %s is %.2f%n", getName(), getAdjustedPrice());
    }

    public void printItem(String name, double price){
        System.out.printf("The price of %s is %.2f%n", name, price);
    }
}
