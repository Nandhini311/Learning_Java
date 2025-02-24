import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas","yogurt", "milk", "eggs"};
        List<String> list = List.of(items);
        System.out.println(list.size());
        System.out.println(list.getClass().getName());
        //list.add("yogurt"); //immutable list as List.of() always returns an unmodifiable list

        ArrayList<String> groceries = new ArrayList<>(list);
        System.out.println(groceries.size());
        System.out.println(groceries);
        groceries.add("mango");
        groceries.remove("milk");
        System.out.println(groceries);

        ArrayList <String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        //to get particular item from the list
        System.out.println("Third item = " + groceries.get(2));

        //to search for an element.
        if(groceries.contains("mustard")){
            System.out.println("List contains mustard");
        }

        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("last = " +groceries.lastIndexOf("yogurt"));
        System.out.println(groceries);

        //remove method removes only one item, not all the instances,
        groceries.remove("yogurt");
        //to remove more than one element at a time
        groceries.removeAll(List.of("apples", "yogurt"));
        //The removeAll() method removes all items from a list which belong to a specified collection.
        System.out.println(groceries);

        groceries.clear();//empties out the list
        System.out.println(groceries);
        //isEmpty() if the list is empty

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        System.out.println(groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);

        ArrayList<String> nameList = new ArrayList<>(List.of("nandhini", "Roopleen", "Sweta"));
    }
}
