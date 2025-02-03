public class DeclaringInSwitch {
    public static void main(String[] args) {
    }
    public static void aMethod(int value){
        switch(value) {
            case 1:
                System.out.println(1);
                //i;                   this is not okay, i is declared below only.
                break;
            case 2:
                int i = 10;           //this is ok
                System.out.println(i);
                break;

            default:
                i = value;
                System.out.println(i);
                break;
        }

        //System.out.println(i); will cause an error: i is out of scope outside of the switch. 

    }
}
