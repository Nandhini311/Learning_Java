import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {

    public static void main(String[] args) {
        int[] InputArray = readIntegers();
        System.out.println("Minimum value in the array is: " + findMin(InputArray));
    }
    public static int[] readIntegers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input example - 1, 2, 3, 4");
        String value = sc.nextLine();
        String[] inputArray = value.split(",");
        System.out.println(Arrays.toString(inputArray));
        //now this string - we need as an array of int
        int[] Array = new int[inputArray.length];

        for(int i=0; i< inputArray.length; i++){
            Array[i] = Integer.parseInt(inputArray[i].trim()); //trim to remove the trailing spaces.
        }
        return Array;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++ ){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
