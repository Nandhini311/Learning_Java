import java.util.ArrayList;
import java.util.Arrays;

public class BoxingUnboxing {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[5];
        intArray[0] = 50;
        System.out.println(intArray);

        //autuboxing
        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));

    }

    //autounboxing for method.
    private static int returnAnInt(Integer i){
        return i;
    }

    //manual boxing.
    private static Double getDoubleObject(){
        return Double.valueOf(100.00);
    }

    private static ArrayList<Integer> getList(int... varargs){
        //int can get 0 or more integers via parameter.
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i: varargs){
            aList.add(i); //autoboxing
        }
        return aList;
    }
}
