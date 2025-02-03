/*
public class TeenNumberCheck{
    public static boolean hasTeen(int num1, int num2, int num3){
        if (num1 < 20 && ((num1%10) >=3 && (num1 % 10) <=9)){
            return true;
        }
        else if (num2 < 20 && ((num2%10) >=3 && (num2 % 10) <=9)){
            return true;
        }
        else if (num3 < 20 && ((num3%10) >=3 && (num3 % 10) <=9)){
            return true;
        }
        else return false;
    }

    public static boolean isTeen(int num1){
        if (num1 < 20 && num1 > 12){
            return ((num1 % 10) >= 3 && (num1 % 10) <= 9);
        }
        return false;
    }
}*/

public class TeenNumberCheck{
    public static void main(String[] args){
        System.out.println(checkTeen(13, 12, 19));
    }
    public static boolean checkTeen(int num1, int num2, int num3){
        return (num1 >= 13 && num1 <=19 || num2 >= 13 && num2 <=19 || num3 >= 13 && num3 <=19);
    }
}