public class StringBuilderLearn {
    public static void main(String[] args) {
        String helloWorld = "Hello World";
        helloWorld.concat(" and GoodBye");
        //the result is not assigned to anything, hello world and goodbye is in heap memory but there is no reference for this String object


        //directly assigning the literal is not allowed in string builder
        //StringBuilder helloWorldBuilder = "Hello" + "World";
        StringBuilder helloWorldBuilder = new StringBuilder("Hello World");
        helloWorldBuilder.append(" and Goodbye");
        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a1".repeat(17));
        StringBuilder emptyStart32 = new StringBuilder(32); //capacity will be 32.
        emptyStart32.append("a1".repeat(20));

        printInformation(emptyStart); //by default is 16, only after that it will request for more memory
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + "World");
        builderPlus.append((" and Goodbye"));

        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        builderPlus.replace(16, 19, "G"); //excludes character at index 19
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus); //length will be only 7 characters
    }

    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("Capacity " + builder.capacity());
    }
}
