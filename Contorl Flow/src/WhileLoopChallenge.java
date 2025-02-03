public class WhileLoopChallenge {
    public static void main(String[] args) {
        int number = 5, oddCounter = 0, evenCounter = 0;
        while(number < 20 && evenCounter<5){
            if(!isEvenNumber(number)){
                oddCounter++;
            }
            if(isEvenNumber(number)){
                System.out.print(number+"_");
                evenCounter++;
            }
            number++;
        }
        System.out.println("Count of even numbers: " + evenCounter);
        System.out.println("Count of odd numbers: "+ oddCounter);
        }
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
