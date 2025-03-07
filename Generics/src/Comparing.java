import java.util.Arrays;

public class Comparing {
    public static void main(String[] args) {
        Integer five = 5;
        //comparable can be used on the wrapperclasses 
        Integer[] others = {0, 5, 10, -50, 50};
        for(Integer i: others){
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five, (val == 0 ? "==" : val < 0 ? "<":">"), i, val);
        }

        String banana = "banana";
        String[] fruit = {"apple", "banana", "pear", "BANANA"};
        for(String s: fruit){
            int val = banana.compareTo(s);
            if(val==0){
                System.out.println(s + " and " + banana + " are equal" + " compareTo Value: " + val);
            }
            else if(val > 0 ){
                System.out.println(banana + ">" + s + " compareTo Value: " + val);
            }
            else {
                System.out.println(s + ">" + banana + " compareTo Value: " + val);
            }
        }

        Student [] students = {new Student("Zach"), new Student("Tim"), new Student("Ann")};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        
        //now comparing directly with a string. 
        Student Tim = new Student("Tim");
        Tim.compareTo("Nandhini"); //will throw an error //should be compared against an object.


    }
}

//we are implementing comparable cuz java doesn't know how to compare
class Student implements Comparable{
    private String name;

    Student(String name){
        this.name = name;
    }


    public String toString(){
        return this.name;
    }

    @Override
    public int compareTo(Object o) {
        Student other = (Student) o; //typecasting
        return name.compareTo(other.name);
    }
}