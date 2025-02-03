public class BarkingDog {
    public static void main(String[] args){
        boolean shouldIWakeUp = shouldWakeUp(true,45);
        System.out.println(shouldIWakeUp);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if (hourOfDay > 23 || hourOfDay < 0)
        {return false;
        }
        else if(barking == true && (hourOfDay < 8 || hourOfDay > 22))
        {return true;
        }
        else{return false;
        }
    }
}