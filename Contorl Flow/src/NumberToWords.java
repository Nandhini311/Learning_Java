public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(6780);
    }
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
            return;
        }
        int digitValue = getDigitCount(number);
        int reverseNumber = reverse(number);
        while(digitValue != 0) {
            int lastDigit = reverseNumber % 10;
            reverseNumber = reverseNumber / 10;
            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            digitValue--;
        }
    }

    public static int reverse(int number){
        int reverseValue = 0;
        while(number != 0){
            reverseValue = reverseValue*10 + number%10;
            number = number / 10;
        }
        return reverseValue;
    }

    public static int getDigitCount(int number){
        if(number < 0)
            return -1;
        if (number == 0)
            return 1;
        int digitCount = 0;
        while(number > 0){
            digitCount ++;
            number = number / 10;
        }
        return digitCount;
    }
 }
