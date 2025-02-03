public class TraditionalSwitchChallenge {
    public static void main(String[] args){
        NatoWords('v');
    }
    public static void NatoWords(char ch){
        switch(ch){
            case 'a':
                System.out.println("a is" + " Able");
                break;
            case 'b':
                System.out.println("b is" + " Baker");
                break;
            case 'c':
                System.out.println("c is" + " Charlie");
                break;
            case 'd':
                System.out.println("d is" + " Dog");
                break;
            case 'e':
                System.out.println("e is" + " Easy");
                break;
            default:
                System.out.println(ch + " is not found");
                break;
        }
    }
}
