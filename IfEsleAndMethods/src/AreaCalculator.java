public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(7));
        System.out.println(area(10, 7));
    }
    //circle area
    public static double area(double radius){
        if (radius <0){
            return -1.0;
        }
        return (radius*radius*3.14159265359);
    }

    //rectangle area
    public static double area(double x, double y){
        if (x < 0 || y < 0){
            return -1.0;
        }
        return x*y;
    }
}

