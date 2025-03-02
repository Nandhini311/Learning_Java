public class Main {
    public static void main(String[] args) {
        MealOrder deluxeMeal = new MealOrder("burger", "7-up",
                "chili");
        deluxeMeal.addBurgerToppings("PINEAPPLE", "CANNED TUNA", "MOZZARELLA",
                "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printOrderList();
    }
}
