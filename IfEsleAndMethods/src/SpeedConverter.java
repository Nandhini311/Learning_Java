public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(8.96);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        long finalValue = -1;
        if (kilometersPerHour >= 0)
        {
            double milesPerHour = kilometersPerHour/1.609;
            finalValue = Math.round(milesPerHour);
            return finalValue;
        }
        else
            return finalValue;

    }
    public static void printConversion(double kilometersPerHour){
        long finalValue = toMilesPerHour(kilometersPerHour);
        if (finalValue == -1){
            System.out.print("Invalid Value");
        }
        else{
            System.out.print(kilometersPerHour + " km/h = " + finalValue + " mi/h");
        }
        //will throw an error if you return with if, else-if (no else)

    }
}