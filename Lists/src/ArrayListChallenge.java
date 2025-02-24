import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceryList = new ArrayList<>();
        while(flag) {
            System.out.printf("WELCOME TO NANDY INSTAMART %n" + "Available actions: %n" +
                    "0 - to shutdown %n" + "1 - to add items (comma delimited list): %n" +
                    "2 - to remove any items (comma delimited list %n" + "Enter a number for which action you want to do : %n");


            int input = sc.nextInt();
            sc.nextLine(); //consumes the enter as the input.
            switch (input) {
                case 1 -> addItems(groceryList);
                case 2 -> removeItems(groceryList);
                default -> flag = false;
            }
        }
        groceryList.sort(Comparator.naturalOrder());
        System.out.println(groceryList);

    }

    public static void addItems(ArrayList<String> groceryList){
        System.out.println("Please enter the list of items to be the added to the grocery list: ");
        String[] items = sc.nextLine().split(",");  //It returns an array (String[]) where each element is a part of the original string.
        groceryList.addAll(List.of(items));
//        for(String i : items){
//            i = i.trim(); //trim to trim the extra spaces.
//            groceryList.add(i);
//
//        }
        //now sorting the groceryList
    }

    public static void removeItems(ArrayList<String> groceryList){
        System.out.println("Please enter the list of items to be removed: ");
        String[] itemsToRemove = sc.nextLine().split(",");
        //reads an entire line of input from the user until a newline character (\n) is encountered.
        groceryList.removeAll(List.of(itemsToRemove));
    }

}
