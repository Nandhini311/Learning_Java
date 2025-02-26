import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);

        for(int[] i: array2){
            System.out.println(Arrays.toString(i));
            //loops through each array - which is of 4 integers
            //i is for each row
        }

        /*for(int i=0; i<array2.length; i++){
            var innerArray = array2[i]; //each element, each row.
            for (int j=0; j< innerArray.length; j++){
                System.out.print(array2[i][j]); //go through each values in an element.
            }
            System.out.println();
        }*/

//        for(var outer: array2){
//            for(var element: outer){
//                System.out.print(element+ " ");
//            }
//            System.out.println();
//        }
        for(int i=0; i<array2.length; i++){
            var innerArray = array2[i]; //each element, each row.
            for (int j=0; j< innerArray.length; j++) {
                array2[i][j] = i * 10 + j+1; //go through each values in an element.
            }
        }
        System.out.println(Arrays.deepToString(array2));

        array2[1] = new int[] {10, 20, 30}; //will be going to the second row
        System.out.println(Arrays.deepToString(array2));
    }
}
