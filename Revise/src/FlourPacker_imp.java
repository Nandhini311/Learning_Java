public class FlourPacker_imp {
    public static void main(String[] args) {
        System.out.print(canPack(1, 6, 9));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false; //correct
        int bigValue = bigCount*5; //corect
        if(bigValue >= goal){
            int remainder = goal%5;
            if(smallCount >= remainder){
                return true;
            }}
        else{
            if(smallCount >= goal - bigValue){
                return true;
            }
        }
        return false;
    }
}