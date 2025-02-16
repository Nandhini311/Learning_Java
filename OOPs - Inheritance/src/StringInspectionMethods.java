public class StringInspectionMethods {
    public static void main(String[] args) {
        printInformation("Nandhini Says Hoi");
        printInformation("");
        printInformation("\t     \n");

        String HellowWorld = "Hello World Let's Code";
        System.out.printf("index of r = %d %n", HellowWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", HellowWorld.indexOf("World"));

        System.out.printf("index of o = %d %n", HellowWorld.indexOf('o'));
        System.out.printf("index of o = %d %n", HellowWorld.lastIndexOf('o'));

        System.out.printf("index of o = %d %n", HellowWorld.indexOf('o', 3)); //starts looking from index 3.
        System.out.printf("index of o = %d %n", HellowWorld.lastIndexOf('o', 8)); //starts looking from index 8
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
