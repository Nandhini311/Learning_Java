import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        //size is fixed once it's created. you cannot add or delete elements; can only assign values.
        myIntArray[5] = 50; //n-1 indexing, so value of 6 is 50
        System.out.println(myIntArray[1]);
        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]); //third element.
        System.out.println(myDoubleArray[1]); //0.0

        //array initializer if you already know the values in your array.
        int[] firstFivePositives = new int[]{1, 2, 6, 4, 5}; //size is not mandatory to be specified.
        int arrayLength = firstFivePositives.length;
        System.out.println(arrayLength);
        System.out.println(firstFivePositives[arrayLength-1]);

        for(int i: firstFivePositives){
            System.out.print(i +" ");
        }

        System.out.println();
        //anonymous array - can be used only when we declare.
        String[] names = {"Andy", "Bob", "Charles"}; //no need to use new <type>[];
        for(int i=0; i< names.length; i++ ){
            System.out.println(names[i]);
        }

        //toString in the helper class prints all the arrayElements.
        String arrayElements = Arrays.toString(names);
        System.out.println(arrayElements); //now can print without a for loop, using the Array helper class.

        Object objectVariable = firstFivePositives;
        if(objectVariable instanceof int[]){
            System.out.println("object variable is really an integer array");
        }

        //to story any type of data.
        Object[] ObjectArray = new Object[5];
        ObjectArray[0] = "Hello";
        ObjectArray[1] = new StringBuilder("World");
        ObjectArray[2] = 3;

        System.out.println(Arrays.toString(ObjectArray));
        System.out.println(ObjectArray[2].getClass().getSimpleName());

}
}
