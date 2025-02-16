public class StringManipulation {
    public static void main(String[] args) {
        String birthDate ="31/01/2000";
        int startingIndex = birthDate.indexOf("2000");
        System.out.println("StartingIndex = "+ startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));
        //substring extracts part of a given string from given index
        System.out.println("Birth month " + birthDate.substring(3, 5));

        String newDate = String.join("/", "25", "11", "1980");
        //joins a list of string with a delimiter.
        System.out.println(newDate);

        String concateNewDate = "25";
        concateNewDate = concateNewDate.concat("/");
        concateNewDate = concateNewDate.concat("11");
        concateNewDate = concateNewDate.concat("/");
        concateNewDate = concateNewDate.concat("1982");
        //this is not advised because each call is a new creation of a string object

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println(newDate);
        //java reads this as one string

        //method chaining.
        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace("/", "-"));
        System.out.println(newDate.replace("/", "00")); //can use a multi character string too

        //replaces all occurrences of a specified character or a substring

        System.out.println(newDate.replaceFirst("/", "//d"));
        System.out.println(newDate.replaceAll("//d", "---"));
        //replaceAll on the other hand replaces all occurrences of a regular expression pattern with a replacement.

        String str = "abcd3456efgh7891";
        System.out.println(str.replaceAll("\\d", "*" ));
        //replaces all digits with *

        System.out.println(("ABC\n").repeat(3));
        System.out.println("-".repeat(20));

        System.out.println(("ABC\n").repeat(3).indent(8));
        //to add indention
        System.out.println("-".repeat(20));

        System.out.println(("   ABC\n").repeat(3).indent(-2));
        //removes two spaces before printing.
        System.out.println("-".repeat(20));




    }
}
