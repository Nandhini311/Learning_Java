
import javax.lang.model.element.Element;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

record Place(String name, int distance){

    @Override
    public String toString(){
        return String.format("%s -> %d", name, distance);
    }
    //we can create a class as well but record is more efficient here, less boilerplate code, immutable.
}

public class LinkedListChallenge {
    public static void main(String[] args) {
        LinkedList<Place> town = new LinkedList<>();
        town.add(new Place("Sydney", 0));
        town.add(new Place("Adelaide", 1374));
        town.add(new Place("Brisbane", 917));
        town.add(new Place("Alice Springs", 2771));
        town.add(new Place("Darwin", 3972));
        town.add(new Place("Perth", 3923));
        town.sort(Comparator.comparing(Place::distance));

        var iterator = town.listIterator();
        boolean quitloop = false;
        boolean forward = true;
        printMenu();
        Scanner sc = new Scanner(System.in);
        while(!quitloop){
            if(!iterator.hasPrevious()){
                System.out.println("You are originating from "+ iterator.next());
                forward = true; //can go forward when this is the case.
            }
            if(!iterator.hasNext()){
                System.out.println("You have reached destination " + iterator.previous());
                forward = false;
            }
            System.out.println("Enter Value: ");
            String input = sc.nextLine();

            switch (input){
                default:
                        quitloop = true;
                        break;
                case "F":
                    if(!forward) { //we are coming from backward mode
                        forward = true; //turn on forward mode.
                        if(iterator.hasNext()){
                        iterator.next();
                        }
                    }
                    System.out.println("User wants to go forward");
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    if(forward){
                        forward = false;
                        if(iterator.hasPrevious()){
                            iterator.previous();
                    }

                    System.out.println("User wants to go backward");
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                     }
                    }

                    break;
                case "L":
                    System.out.println("User wants to list all the places");
                    System.out.println(town);
                    break;
                case "M":
                    System.out.println("User wants re-view the menu");
                    printMenu();
                    break;
            }

        }

    }

    private static void printMenu(){
        System.out.printf("Available actions (select word or letter: ) %n" +
                "(F)orward %n" + "(B)ackward %n" + "(L)ist Places %n" + "(M)enu %n" + "(Q)uit %n");

    }

    private static void addElement(LinkedList<Place> list, Place value){
        //we need to ensure that there is no duplicate in the list.
        //this is for checking the value of place as it is - including name and distance.

        if(list.contains(value)){
            System.out.println("Found duplicate: "+ value);
            return;
        }

        for(Place p: list){
            if(p.name().equalsIgnoreCase(value.name())){
                System.out.println("Found duplicate: "+ value.name());
                return;
            }
        }

        //now we know it's not duplicate element.
        int matchedIndex = 0;
        //where to add the new element.
        for(var listPlace: list){
            if(value.distance() < listPlace.distance()){
                list.add(matchedIndex, value);
                return;
            }
            matchedIndex++;
        }
        //incase it's of highest distance, it won't get added in that conditional statement
        list.add(value);
    }


}
