import java.util.Scanner; //allows you to use some othe's code.
public class ReadingUserInput {
    public static void main(String[] args) {
        int currentYear = 2025;
        //exception handling7
        try{
            System.out.println(getInputFromConsole(currentYear)); //potential code that might throw error
        }catch(NullPointerException e){  //e is varaible here
            System.out.println("Console input is not available. Switching to Scanner...");
            System.out.println("you name is " +getInputFromScanner(currentYear));
        }
    }
    public static String getInputFromConsole(int currentYear){
        String nameUser = System.console().readLine("Hi, What's your Name?");
        System.out.println("Hi " + nameUser + ",Thanks for taking this course");
        return " ";
    }
    public  static String getInputFromScanner(int currentYear){
        Scanner scannerInput = new Scanner(System.in); //alows you get input from the user //creating a new object
        String Name = scannerInput.nextLine();

        System.out.println("Hi "+ Name + ", Thanks for taking up this course");
        System.out.println("We need your year of birth");
        //let's create a loop that runs untill user provides the right dob
        boolean validDob = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " + (currentYear-125)+" and <=" + (currentYear));
            String DateOfBirth = scannerInput.nextLine(); //input provided is by default string, we need to convert it into integer.
            //what to do if user gives any invalid input that cannot be converted to an integer and subtracted from the current year? like 198c.
            //we need to do exception handling.
            try{
                age = checkData(currentYear, DateOfBirth);  //let's add some validation.
                //you can send scannerInput.nextLine() as a parameter too.
                validDob = age < 0 ? false: true; //ternary operator.

            }catch(NumberFormatException badUserData){
                System.out.println("Charactes are not allowed !! Try again");
            } //after catch block is executed, the flows goes to what is after catch and not back to try.
        } while(!validDob);
        return "So you are "+ age + " years old";
    }

    public static int checkData (int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        if((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }
        else return (currentYear - dob);
    }

}
