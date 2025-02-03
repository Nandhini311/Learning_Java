public class Sum3And5Challenge{
    public static void main(String[] args){
        int sum = 0;
        int counter = 0;
        for(int i = 1; i<=1000 ; i++){
            if(counter != 5){
                //if loop is going for forver, it could cause the code to block; cause it to crash as it runs out of memory.
                if (i % 3 == 0 && i % 5 ==0){
                    sum += i;
                    System.out.println(i + " Found a match");
                    counter ++;
                }
            }
        }
        System.out.println("Sum of the numbers meeting the condition :" + sum);
    }
}