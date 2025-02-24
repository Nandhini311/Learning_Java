import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAndArraysLists {
    public static void main(String[] args) {
        String[] originalArray = new String[]{"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        //originalList is just a list wrapper for the original String array - aka any changes made to the originalArray
        //will reflect in the originalList as well.

        originalList.set(0, "one");
        System.out.println(Arrays.toString(originalArray));

        //originalList.add("Four"); //will throw an error as original list is a fixed size list wrapper,
        // you cannot add or remove any element from this

        ArrayList<String> stringLists = new ArrayList<>(List.of("Honey", "Milk")); //input should be a list of values
        String[] stringArray = stringLists.toArray(new String[0]);
        //new String[0] - to ensure correct type array is created;
        // 0 is just best practice; if the parameter is passed is too small, java dynamically creates of the right size.
    }
}
