import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        double average = 0;
        int counter = 0;
        boolean valid = true;
        Scanner scan = new Scanner(System.in);
        do{
            try{
                int input = Integer.parseInt(scan.nextLine());
                sum = sum + input;
                counter++;
            }
            catch(NumberFormatException nxe){
                valid = false;
            }
        }while(valid);
        System.out.println("SUM = "+ sum);
        average = sum/counter;
        long AVG = Math.round(average); //this function retuns a long value
        System.out.println("AVG = " + AVG);

    }
}