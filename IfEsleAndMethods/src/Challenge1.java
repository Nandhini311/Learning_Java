public class Challenge1 {
    public static void main(String[] args){
        int score = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",score);
        score = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", score);
        score = calculateHighScorePosition(500);
        displayHighScorePosition("Milley",score);
        score = calculateHighScorePosition(100);
        displayHighScorePosition("Dan",score);
        score = calculateHighScorePosition(25);
        displayHighScorePosition("Sarah",score);


    }
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName+ " managed to get into position "+ playerPosition + " on the score list");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }
        else if(playerScore >= 500){
            return 2;
        }
        else if(playerScore>=100){
            return 3;
        }
        else
            return 4;

        /* to reduce the number of return statements*
        int position = 4;
        if(playerScore >= 1000){
            position = 1;
        }
        else if(playerScore >= 500){
            position = 2;
        }
        else if(playerScore >= 100){
            position = 3;
        }
        return position;
         */
    }
}
