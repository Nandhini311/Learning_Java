import java.util.Random;

public class DEnumerationClass {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);

        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();
            System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());
            //.name() to get the exact value; .ordinal() to get the index value.

            if (weekDay == DayOfTheWeek.FRI) {
                System.out.println("Found a Friday");
            }

            switchDayOfWeek(DayOfTheWeek.THURS);
        }

        //passes through all the elements in enum.
        for(var topping: ToppingEnum.values()){
            System.out.printf(topping.name() +"'s price is: " + topping.getPrice() + "%n");
        }
    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay){
        int weekDayInteger = weekDay.ordinal()+1;
        switch (weekDay){
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name()+"day is Day " + weekDayInteger);
        }

    }
    public static DayOfTheWeek getRandomDay(){
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values(); //returns all the values of the DayOfTheWeek as an array.
        return allDays[randomInteger];
    }
}
