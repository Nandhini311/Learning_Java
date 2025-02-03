public class MethodChallenge {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("James", highScorePosition);
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

       /* int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;*/
    }
}
