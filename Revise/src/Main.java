public class Main {
    public static void main(String[] args) {
        int positive = 35;
        int zero = 0;
        int result = positive/zero;
        System.out.println(result);
        //throws an arithmetic exception as undefined value; this is unchecked exception.
    }
}
