public class Burger extends Item{
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price){
        super(name, "BURGER" , price);
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }


    public double getAdjustedPrice(){
        return getBasePrice() + extra1.getBasePrice() + extra2.getBasePrice() + extra3.getBasePrice();
    }

    public double toppingPricing(String topping){
        return switch (topping.toUpperCase()){
            case "PINEAPPLE", "CANNED TUNA" -> 2.0;
            case "MOZZARELLA" -> 1.5;
            default -> 0.0;
        };
    }

    public void addingTopping(String topping1, String topping2, String topping3){
        this.extra1 = new Item(topping1, "TOPPING", toppingPricing(topping1));
        this.extra2 = new Item(topping2, "TOPPING", toppingPricing(topping2));
        this.extra3 = new Item(topping3, "TOPPING", toppingPricing(topping3));
    }

    public void printBurgerOrderList(){
        printItem("BURGER", getBasePrice());
        //now adding the list of the topping and their pricing.
        if(extra1 != null){
            extra1.printItem();
        }
        if(extra2 != null){
            extra2.printItem();
        }
        if(extra3 != null){
            extra3.printItem();
        }
    }

    @Override
    public void printItem(){
        printBurgerOrderList();
        System.out.println("-".repeat(30));
        super.printItem();
    }

}
