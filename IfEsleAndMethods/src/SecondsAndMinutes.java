public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(70));
        System.out.println(getDurationString(90, 90));
        System.out.println(getDurationString(90, 59));
        System.out.println(getDurationString1(125, 90));
    }

    public static String getDurationString(int seconds) {
        String Value;
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            Value = getDurationString(minutes, remainingSeconds);
        } else {
            Value = "Invalid Value, seconds less than 0";
        }
        return Value;
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60; //+ seconds / 60; as seconds is always between 0 and 59.
            //return String.format("%d H %d m %d s", hours, remainingMinutes, remainingSeconds);
            return hours + "H " + remainingMinutes + "m " + seconds + "s";
        }
        return "Invalid Value, minutes less than 0 or seconds less than 0 or greater than 59";
    }

    public static String getDurationString1(int minutes, int seconds) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60 + seconds / 60;
            int remainingSeconds = seconds % 60;
            //return String.format("%d H %d m %d s", hours, remainingMinutes, remainingSeconds);
            return hours + "H " + remainingMinutes + "m " + remainingSeconds + "s";
    }
}


