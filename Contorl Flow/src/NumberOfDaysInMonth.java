public class NumberOfDaysInMonth {
        // write code here
        public static void main(String[] args) {
            int a = getDaysInMonth(7, 2000);
            System.out.println(a);
        }
        public static boolean isLeapYear(int year){
            if(year >= 1 && year <= 9999){
                if (year % 4 == 0 && year % 100 != 0){
                    return true;
                }
                else if (year % 400 == 0) {
                    return true;
                }
            }
            return false;
        }

        public static int getDaysInMonth(int month, int year){
            if(month < 1 || year < 1 || year > 9999 || month > 12){
                return -1;
            }
            else{
                return switch(month){
                    case 4, 6, 9, 11 -> 30;
                    case 2 ->{
                        int i = isLeapYear(year)? 29: 28;
                        yield i;
                    }
                    case 1, 3, 5, 7, 8, 10, 12 -> 31;
                    default -> -1;
                    };
                }
            }
        }

