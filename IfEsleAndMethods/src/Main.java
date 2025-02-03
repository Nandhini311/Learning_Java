public class Main {
    public static void main(String[] args){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
        if (gameOver == true){
            finalScore += (levelCompleted*bonus);
            System.out.println(finalScore);
        }
        else{
            finalScore = finalScore - bonus;
            System.out.println(finalScore);
        }
    }
}
