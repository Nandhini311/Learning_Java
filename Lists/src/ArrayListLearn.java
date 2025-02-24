import java.util.ArrayList;
import java.util.Arrays;

record  GroceryItem(String name, String type, int count){
    //data in record is immutable.
    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}
public class ArrayListLearn {
    public static void main(String[] args) {
        GroceryItem [] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList(); //uses the object class by default.
        //using the generic class as it is without mentioning the type of data it stores or handles
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        //now this stores element of groceryList object.
        groceryList.add(new GroceryItem("Beans", "PRODUCE", 1));
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Carrots", "PRODUCE", 1));
        groceryList.add(1, new GroceryItem("Chocolates", "Desserts", 1));
        //this will add the data at index 1, so you can specify the position as well.
        //you can use set method for replacing an element.
        groceryList.set(0, new GroceryItem("milk"));
        groceryList.remove(1); //removes element at index 1
        System.out.println(groceryList);
        //Yes, System.out.println(object) implicitly calls object.toString().
        // This happens because System.out.println() is designed to handle any object type,
        // and Java uses toString() as a default way to convert an object into a printable string.

    }
}
