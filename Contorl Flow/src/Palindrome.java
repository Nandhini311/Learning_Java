public class Palindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome(101));
    }
    public static boolean isPalindrome(int number){
            int reverseNumber = 0;
            int initialNumber = Math.abs(number);
            number = Math.abs(number);
            if(number<10) return false;
            while(number>0){
                reverseNumber = reverseNumber*10 + number%10;
                number = number/10;
            }
            return (reverseNumber == initialNumber);
        }
}

/* public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverseNumber = 0;
        int original = number;
        while(number !=0){
            reverseNumber = reverseNumber*10 + number%10;
            number = number/10;
        }
        return (reverseNumber == original);
    }
} */