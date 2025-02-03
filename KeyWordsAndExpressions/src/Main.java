public class Main {
    public static void main(String[] args){
        //keywords - reserved words with predefined meaning to the compiler;hence cannot be used for variables/methods
        // there are 51 keywords
        //expression - evalutes /produces a single value
        //statement - standalone units of works (performs an action; may not have an output; mostly ends with ;
        //code block - set of zero,one or more statements
        double kilometers = (100 * 1.609344); // kilometers = xx is the expression here
        int highScore = 50;
        if (highScore > 25){
            highScore = 1000 + highScore; // 2 expression here.
        }                                 //code of block
        System.out.println(highScore); //statement
        int health = 78;
        if (highScore > 100 && health >50){ //3 expression here
            highScore = 1000 + health;
        }
    }
}
