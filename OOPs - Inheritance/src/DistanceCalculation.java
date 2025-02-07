public class DistanceCalculation {
    private int x;
    private int y;
    public DistanceCalculation(){

    }

    public DistanceCalculation(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void getX(){
        this.x = x;
    }

    public void getY(){
        this.y = y;
    }

    public int setX(){
        return x;
    }

    public int setY(){
        return y;
    }

    public double distance(){
        double value = (x*x + y*y);
        return Math.sqrt(value);
    }

    public double distance(int a, int b){
        double value = ((x-a)*(x-a))+ ((y-b)*(y-b));
        value = Math.sqrt(value);
        return value;
    }
}