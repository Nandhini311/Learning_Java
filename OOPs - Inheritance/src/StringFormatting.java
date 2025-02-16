public class StringFormatting {
    public static void main(String[] args) {
        String bulletIt ="Print a Bulleted List: \n" +
                "\t\t\u2022 First Point \n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        //using text block to reproduce the same.
        String textblock = """
                    Print a BlulletedList:
                            \u2022 First Point
                               \u2022 Sub Point""";

        System.out.println(textblock);

        int age = 35;
        System.out.printf("Your age is %d\n", age);

        int yearOfBirth = 2025 - age;
        System.out.printf("Age = %d, Birth year = %d\n", age, yearOfBirth);

        //can do the same with String.format()
        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
