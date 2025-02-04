public class StudentPOJOMain {
    public static void main(String[] args) {
        for (int i =1; i<= 5; i++){
            StudentPOJO s = new StudentPOJO("S92300"+i,
                    switch(i) {
                case 1-> "Mary";
                case 2-> "John";
                case 3-> "Lucas";
                case 4-> "Tim";
                case 5-> "Harry";
                default -> "Anonymous";
            }, "05/11/1985", "Java MasterClass");
            System.out.println(s);
            }
            //how are these different objects? won't all the instance be named s?
            /* Even though the variable s is reused in each iteration,
            each call to new StudentPOJO(...) creates a completely new object in memory.
            Java ensures that each new call allocates a new and distinct object on the heap.
            So the objects are different, despite using the same variable s.
            s is just the reference variable here to refer to an object, it is not fixed name of the object.
             */

        }
}