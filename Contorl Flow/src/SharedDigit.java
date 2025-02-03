public class SharedDigit {
        // write code here
        public static void main(String[] args) {
            System.out.println(hasSharedDigit(12,23));
        }
        public static boolean hasSharedDigit(int number1, int number2){
            if((number1 >=10 && number1<=99) && (number2 >=10 && number2 <=99)) {
                int a, b, c, d;
                a = number1 % 10;
                b = number1/10;
                c = number2 % 10;
                d = number2/10;
                if (a == c || a == d || b == c || b == d) return true;
            }
            return false;
        }
    }
