public class While {
    //while loop when you don't have the range of value for which you need to iterate.
    //while some condition is true; it executes the given piece of code; whereas for loop for the range i to n
   public static void main(String[] args) {
       /* int j = 1;
        while(j<=5){
            System.out.println(j);
            j++; //code will be stuck in an infinite loop if there is no false condition.
            //will crash at some point due to run of memory issue.
        }

        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<10); //incase of do-while, the code executed atleast only once.
        */
       int number = 0;
       while (number < 50){
           number += 5;
           if(number == 25){
               continue; //continue statement will stop executing the current iteration of a block of code in loop.
           }
           System.out.print(number+ "_");
    }


    }


}
