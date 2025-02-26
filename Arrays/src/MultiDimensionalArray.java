import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        //outer array can reference to any kind of array itself

        Object[] outerArray = new Object[3];
        //now this object has three elements - each element can be array itself.
        System.out.println(Arrays.toString(outerArray));
        outerArray[0] = new String[] {"a", "b","c"};
        //now element 1 will be string of array
        System.out.println(Arrays.deepToString(outerArray));
        //System.out.println(Arrays.deepToString(outerArray[0]))
        // will throw an error because outerArray[0] is an object even
        // if we have given string of array as input for that element,
        // but we have declared it as an Object, so explicit type casting is needed.
        outerArray[1] = new String[][] {
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        //element 2 will be a 2D array
        System.out.println(Arrays.deepToString(outerArray));
        //outerArray[2] = new int[]{10, 11, 12};

        outerArray[2] = new String[] {"Hello"};
        System.out.println(Arrays.deepToString(outerArray)); //given input is an array
        //System.out.println(Arrays.deepToString((Object[]) outerArray[2]);
        //won't work because you cannot type one string as an object array. only any other array can be typecast as an object array.


        for(Object element : outerArray){
           System.out.println("Element type = " + element.getClass().getSimpleName());
           System.out.println("Element toString() = " + element);
           System.out.println(Arrays.deepToString((Object[]) element));
        }
    }
}
