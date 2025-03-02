public class DeluxBurger extends Burger{
    Item deluxe1;
    Item deluxe2;

    public DeluxBurger(String name, double price){
        super(name, price);
    }

    public void addingTopping(String topping1, String topping2, String topping3, String topping4, String topping5){
        super.addingTopping(topping1, topping2, topping3);
        this.deluxe1 = new Item(topping4, "TOPPING",0.0);
        this.deluxe2 = new Item(topping5, "TOPPING", 0.0);
    }

    @Override
    public void printBurgerOrderList(){
        super.printBurgerOrderList();
        if (deluxe1 != null) {
            deluxe1.printItem();
        }
        if (deluxe2 != null) {
            deluxe2.printItem();
        }
    }

    @Override
    public double toppingPricing(String topping) {
        return 0.0;
    }
}
