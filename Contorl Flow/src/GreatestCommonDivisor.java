public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(36,12));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second <10){
            return -1;
        }
        int number = 0;
        if(first>second) number = second;
        number = first;
        int GCD = 0;
        for(int i=1; i<=number;i++)
        {
            if(first%i == 0 && second%i == 0){
                GCD = i;
            }
        }
        return GCD;
    }
}