public class MinutesToYearsDaysCalculator {
    // write code here
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        else{
            long hours = minutes / 60;
            long years = hours / 8760;
            long days = (hours % 8760 )/24;
            System.out.println( minutes + " min = " + years + "y and " + days +" d");
        }
    }
}