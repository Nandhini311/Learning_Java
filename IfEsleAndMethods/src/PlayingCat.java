public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false,43));
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer){
            return (temperature < 46 && temperature > 34);
        }
        else return (temperature < 36 && temperature > 24);
    }
}