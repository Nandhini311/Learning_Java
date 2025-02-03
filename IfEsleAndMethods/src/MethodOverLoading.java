public class MethodOverLoading {
    public static void main(String[] args){
        calculateScore("Tim ", 500);
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player name:" + playerName + "scored " + score + " points");
        return score*1000;
    }
    public static void calculateScore(int score){
        System.out.println("Unnamed player name score" + score + "points");
    }
}
