import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListLearn {
    public static void main(String[] args) {
        //LinkedList <String> placesToVisit - new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        //placesToVisit.add(0, "Canberra"); //can mention the index as well
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        //printItinerary(placesToVisit);
        //testIterator(placesToVisit);
        testListIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");
        //Queue methods
        list.offer("Melbourne"); //does what addLast does.
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        //Stack methods.
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list){
        list.remove(4); //removes element at index 4, 5th element
        list.remove("Brisbane");
        System.out.println(list);
        String s1 = list.remove(); //removes first element
        System.out.println(s1 + "was removed");

        String s2 = list.removeFirst(); //removes first element
        System.out.println(s2+ "was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");

        //Queue/Dequeue methods
        String p1 = list.poll();
        System.out.println(p1);

        String p2 = list.pollFirst();
        System.out.println(p2);

        String p3 = list.pollLast();
        System.out.println(p3);
    }

    private static void gettingElements(LinkedList<String> list){
        System.out.println("Retrieved Element " + list.get(4));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

        //Queue retrieval method
        System.out.println("Element = " + list.element());
        System.out.println("Element from peek = " + list.peek());
        System.out.println("Element from peek first= " + list.peekFirst());
        System.out.println("Element from peek last = " + list.peekLast());
    }

    //for iteration, we can use traditional and enhanced for loop as well.
    //now let's see how ListIterator works.
    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at "+ list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> From: "+ previousTown + " to "+ town);
            previousTown = town;
        }
    }

    private static void testIterator(LinkedList<String> list){
        //can only move forward.
        var iterator = list.iterator(); //initializing.
        while(iterator.hasNext()){
            //returns the next element and moves to the next one.
            if(iterator.next().equals("Brisbane")){
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    private static void testListIterator(LinkedList<String> list){
        var iterator = list.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("Brisbane")){
                iterator.add("Lake Wivenhoe");
            }
        }
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3); //starts from position 3.
        System.out.println(iterator2.previous());
    }
}
