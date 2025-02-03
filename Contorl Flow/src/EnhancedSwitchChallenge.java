public class EnhancedSwitchChallenge {
    public static void main(String[] args) {
      printDayOfWeek(0);
      printDayOfWeek(1);
      printDayOfWeek(2);
      printDayOfWeek(3);
      printDayOfWeek(4);
      printDayOfWeek(5);
      printDayOfWeek(6);
      printDayOfWeek(7);
    }
    public static void printDayOfWeek(int day){
        //enhanced switch statement as an expression, returning the result to a String named dayOfTheWeek.
        String dayOfTheWeek = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {
                String badValue = "Invalid day";
                yield badValue;
            }
        };
        System.out.println(dayOfTheWeek);
    }
}
