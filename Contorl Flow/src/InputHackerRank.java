import java.util.Scanner;

public class InputHackerRank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        /*when you '/n' it acts as input buffer; untill you press enter the data typed is temporarily stored.
        only when you press enter, the input is read /
        it allows the system to manage input/output in chunks rather than processing every keystroke or data element one by one.
         */
        String s = scan.nextLine();
        s = scan.nextLine();
        // Write your code here.

        System.out.println("String: "+ s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}