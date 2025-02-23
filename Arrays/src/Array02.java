import java.util.Arrays;
import java.util.Random;

public class Array02 {
    public static void main(String[] args) {
        int[] myFirstArray = getRandomArray(10);
        System.out.println(Arrays.toString(myFirstArray));
        Arrays.sort(myFirstArray); //doesn't return anything but sorts the array.
        System.out.println(Arrays.toString(myFirstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray)); //will print default value - 0
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray)); //all values will be set to 5 now.

        int[] thirdArray = Arrays.copyOf(myFirstArray, myFirstArray.length);
        System.out.println(Arrays.toString(thirdArray));

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray); //as binary search will only work on sorted list.
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "Mark") >=0 ){
            System.out.println("Found mark in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 4, 3, 5};

        //order, lenght also matters.
        if(Arrays.equals(s1, s2)){
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }


    }

    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i=0; i<len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
