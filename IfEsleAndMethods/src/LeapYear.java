public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1990));
    }
    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9000){
            return false;
        }
        if (year % 4 == 0 ){
            if (year % 100 == 0){
                return (year % 400 == 0); }
            else {
                return true;
            }
        }
        return false;
    }
}