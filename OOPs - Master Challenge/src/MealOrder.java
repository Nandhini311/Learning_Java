public class MealOrder  {
    private Item drink;
    private Item sides;
    private Burger burger;

    public MealOrder(String burgerType, String drinkName, String sideName){
        if(burgerType.equalsIgnoreCase("deluxe"))
        {
            this.burger = new DeluxBurger(burgerType, 8.5);
        }
        else {
           this.burger = new Burger(burgerType, 4.5);
        }
        sides = new Item(sideName, "Sides", 1.5);
        drink = new Item(drinkName, "Drinks", 2.0);
    }

    //default meal order
    public MealOrder(){
        this("Hamburger", "Coke", "Fries");
    }

    public double getTotalOrderValue(){

        if(burger instanceof DeluxBurger){
            return burger.getAdjustedPrice();
        }
        else {
            double sum = drink.getAdjustedPrice() + sides.getAdjustedPrice() + burger.getAdjustedPrice();
            return sum;
        }
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3,
                                  String extra4, String extra5) {
        if (burger instanceof DeluxBurger db) {
            db.addingTopping(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.addingTopping(extra1, extra2, extra3);
        }
    }
    public void setDrinkSize(String size) {
        drink.setSize(size);
    }

    public void printOrderList(){
        burger.printItem();
        if(burger instanceof DeluxBurger){
            drink.printItem(drink.getName(), 0);
            sides.printItem(sides.getName(), 0);
        }
        else {
            drink.printItem();
            sides.printItem();
        }
        System.out.println("-".repeat(30));
        System.out.printf("TOTAL PRICE %.2f", getTotalOrderValue());
    }
}
