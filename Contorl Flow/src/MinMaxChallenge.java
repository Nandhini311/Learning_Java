import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE; //default values.
        // (what should be the initial value of min? it cannot be zero, any positive integer will be greater than zero?)
        //storing the maximum possible value an integar can store
        int min = Integer.MAX_VALUE;
        boolean valid = true;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Please enter a character to quit or number to calculate max or min");
            try{
                String input = scan.nextLine();
                int number = Integer.parseInt(input);
                if(max<number)
                {
                    max = number;
                }
                if(min>number){
                    min = number;
                }
            }catch(NumberFormatException nxe){
                System.out.println("you decided to quit");
                valid = false;
            }
        }while(valid);
        System.out.println("The minimum value: "+ min);
        System.out.println("The maximum value: "+ max);
    }
}
