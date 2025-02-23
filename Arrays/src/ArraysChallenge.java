import java.util.*;

public class ArraysChallenge {
    public static void main(String[] args) {
        int[] array1 = randomIntArray(5);
        int[] DescArray1 = descSortedArray(array1);
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[] {1, 6, 7, 8, 2};
        System.out.println(Arrays.toString(array2));
        array2 = descSortedArray(array2);
        System.out.println(Arrays.toString(array2));
        //this generates us an integer of random int values
        //now sorting them in descending order.


    }

    public static int[] randomIntArray(int size){
        Random random = new Random();
        int[] myArray = new int[size];
        for(int i = 0; i< size; i++){
            myArray[i] = random.nextInt(100);
        }
        return myArray;
    }

    public static int[] descSortedArray(int[] array){
        Arrays.sort(array);
        int n = array.length;
        int temp = 0;
        for(int i=0; i < n/2 ; i++ ){
            temp = array[i];
            array[i] = array[n-1 - i];
            array[n-1 -i] = temp;
            }
        return array;
    }
}
