public class CCSmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;


    //constructor to initialize the values.
    public CCSmartKitchen(){
        this.brewMaster = new CoffeeMaker();
        this.dishWasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }

    //getter method
    public CoffeeMaker getBrewMaster(){
        return brewMaster;
    }

    public DishWasher getDishWasher(){
        return dishWasher;
    }

    public Refrigerator getIceBox(){
        return iceBox;
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();
    }

    public void setKitchenWork(boolean value1, boolean value2, boolean value3){
        brewMaster.addWater(value1);
        dishWasher.loadDishWasher(value2);
        iceBox.pourMilk(value3);

    }
}

class CoffeeMaker{
    private boolean hasWorkToDo;

    public void addWater(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Brewing Coffee");
            this.hasWorkToDo = false;
        }
    }
}

class DishWasher{

    private boolean hasWorkToDo;
    public void loadDishWasher(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    //execute method.
    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Loading dishes");
            this.hasWorkToDo = false;
        }
    }
}

class Refrigerator{
    private boolean hasWorkToDo;
    public void pourMilk(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Ordering Food");
            this.hasWorkToDo = false;
        }
    }
}