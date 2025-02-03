public class SwitchMore {
    public static void main(String[] args) {
        int switchValue = 8;
        //replaced with enhanced switch; available after java version 14
        switch (switchValue) {
            case 1 -> System.out.println(" I am value 1");
            //: replaced with -> and there is no break statement.
            case 2, 3, 4, 5 -> System.out.println(" I am value 2 or 3 or 4 or 5");
            case 8 -> System.out.println(" I am value 8");
            default -> System.out.println(" I am neither value 2 nor 8");
        }
        System.out.println(getQuarter("Nember"));
    }

    //Enhanced switch statement
    public static String getQuarter(String month){
        return switch (month){
            // value found by the switch is directly returned to the invoker.
            case "January", "February", "March" -> "1st";
            case "April","May", "June"  -> "2nd";
            case "July", "August","September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default ->{
            String badResponse = "Invalid month";
            yield badResponse; } //cannot use return here; yield works here; badResponse is returned to switch
        };
    }

    //traditional switch statement
    /*public static String getQuarter(String quarter){
        switch (quarter){
            case "January":
            case "February":
            case "March":
                return "1st";
            case "April":
            case "May":
            case "June":
                return "2nd";    //acts as a break statement
            case "July":
            case "August":
            case "September":
                return "3rd";
            case "October":
            case "November":
            case "December":
                return "4th";
        }
        return "Invalid Quarter";
      }*/
    }



