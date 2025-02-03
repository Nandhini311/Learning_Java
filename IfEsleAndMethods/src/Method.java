public class Method {
    public static void main(String[] args) {
        //you cannot create a method inside a method.
        int Score = calculation(true, 800, 200, 3);
        System.out.println(Score);
        int Score2 = calculation(true, 900, 200, 5);
        System.out.println(Score2);
        System.out.println(calculation(true,700,300,1));
        //arguments are the values passed to the method when calling it.
    }
    //method are piece of code that can be reused. all methods in java should belong to a class.

    //public static void calculation(boolean gameOver, int finalScore, int bonus, int levelCompleted)
    //void datatype - aka nothing will be returned.
    public static int calculation(boolean gameOver, int finalScore, int bonus, int levelCompleted) {
        //parameters are definition shown in the method declaration.
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
        //return statement returns the control to the invoker of a method.
        //you can also use return to end the execution of method before it goes till the end.
    }
}