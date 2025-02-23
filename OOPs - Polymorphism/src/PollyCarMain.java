import java.util.Scanner;

public class PollyCarMain {
    public static void main(String[] args) {

        PolyChallengeCar car = new PolyChallengeCar("2022 Blue Ferrari 296 GTS");
        startCar(car); //non-static method cannot be called from a static
        PolyChallengeCar gasCar = new GasPoweredCar("Ford F-150", 9.03, 2);
        startCar(gasCar);
        //you can now see same method executing different piece of code for each class.
    }

        public static void startCar(PolyChallengeCar Car){
            Car.startEngine();
            Car.runEngine();
        }
}
