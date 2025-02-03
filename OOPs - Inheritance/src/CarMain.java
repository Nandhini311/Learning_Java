public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();//since Car is public class, it is accessible from the Main class
        Car car2 = new Car();

        Car car1; //only declared; uninitialized variable. causes compile time error.
        car1 = null; //will throw runtime error; nullpointer exception.
        //why no error even if no values were assigned to the fields ? java assigns default values for fields/methods in classes.
        //NULL values get printed, NULL Is special key word which means that the variables or method are not assigned to any instance or object.
        //primitive data types are never NULL, that's why for doors value printed is 0.

        car.describeCar(); //calling the describeCar method.
        //the private fields cannot be accessed here
        //car.doors = 4; would throw error
        //System.out.println(car.ownerName); // ownerName is public
        //making fields isn't the best practice - we can use getters and setters instead.

        //int localVariable; will throw error as local variables won't have default values initialized.
        //System.out.println(localVariable);
        System.out.println(car.getMake());
        car.setMake("holden");
        System.out.println(car.getMake());
        System.out.println(car2.getMake());

    }
}
