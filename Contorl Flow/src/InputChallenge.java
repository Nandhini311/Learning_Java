import java.util.Scanner;

public class InputChallenge {
    public static void main(String[] args) {
        //getting 5 valid numbers from the user;
        Scanner scanInput = new Scanner(System.in);
        int sum = 0;
        int counter = 1;
        do{
            System.out.println("Please enter number "+ counter +":");
            String number = scanInput.nextLine();
            try{
                sum = sum + Integer.parseInt(number);
                counter ++; //this will get only executed if no error is thrown.
            }
            catch(NumberFormatException e){
                System.out.println("Charactes are not allowed !! Try again");
            }
        }while( counter != 6);
        System.out.println("Sum of the values provided "+sum);
    }
}
