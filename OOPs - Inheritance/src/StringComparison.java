public class StringComparison {
    public static void main(String[] args) {
        String hellowWorld = "Hello World";
        String helloWorldLower = hellowWorld.toLowerCase();
        if(hellowWorld.equals(helloWorldLower)){
            System.out.println("Values match exactly");
        }
        if (hellowWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values match ignoring case");
        }

        if(hellowWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }
        if(hellowWorld.endsWith("World")){
            System.out.println("String ends with World");
        }
        if(hellowWorld.contains("World")){
            System.out.println("String contains World");
        }

        if(hellowWorld.contentEquals("Hello World")){
            System.out.println("Values match exactly");
        }
        //why is there contentEquals when we have equals? becuase it can also support string bulders.
    }
}
