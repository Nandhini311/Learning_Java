public class VarArgs {
    public static void main(String[] args) {
        System.out.println("Hello World Again");
        String[] splitStrings = "Hello World again".split(" ");
        //The split() method splits a string into an array of substrings using a regular expression as the separator.
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello"); //passing one string as input.

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");
    }

    //varArgs - allows you to pass any number of strings to the method - 0/1/2, and it will treat them as an array.
    private static void printText(String... textList){
        for(String t: textList){
            System.out.println(t);
        }
    }

    //there can be only one variable argument in a method.
    //the variable argument must be the last argument
}
