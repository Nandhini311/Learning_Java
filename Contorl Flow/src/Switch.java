public class Switch {
    public static void main(String[] args) {
        int switchValue = 2;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
            case 3: case 4: case 5: case 6:
                System.out.println("Value was a 3 or a 4 or a 5 or a 6");
                System.out.println("Actual value was " + switchValue);
            default:
                System.out.println("Value was between 1-6, have reached default");
                break;

                /* flow -> so the switch continues to compare the value against the condition until it matches,
                once sees the match valuing, it continues to execute the following statement until it reaches the end
                or comes across a default statement */

        }
    }
}

/* valid switch value types are byte, short, int, char, String, enum, Byte, Short, Integer, Character
invalid switch values are float, long, double, boolean, or their wrappers

if-else is used for a test conditions for a range of values, boolean data values
few values that appear often
switch is best suited for fixed limited values, all values are equally likely to appear,
it is faster if there are more than 5 test cases compared to if-else.
and are more readable.
 */
