public class StringInspectionMethods {
    public static void main(String[] args) {
        printInformation("Nandhini");
        printInformation("");
        printInformation("\t     \n");

        String HellowWorld = "Hello World";
        System.out.printf("index of r = %d %n", HellowWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", HellowWorld.indexOf("World"));

        System.out.printf("index of o = %d %n", HellowWorld.indexOf('o'));
        System.out.printf("index of o = %d %n", HellowWorld.lastIndexOf('o'));
    }

    public static void printInformation(String string){
        int length = string.length();

        if(string.isEmpty()){
            System.out.println("String is empty");
            return;
        }

        if(string.isBlank()){
            System.out.println("String is Blank");
        }
        System.out.printf("Lenth = %d %n", length);
        System.out.printf("First char = %c %n", string.charAt(0));

    }
}
