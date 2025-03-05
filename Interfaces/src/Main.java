public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird; //bird is indeed an animal.
        //animal reference pointing to bird
        //however, it can fly as well.
        FlightEnabled flier = bird;
        //flier reference pointing to bird
        Trackable tracked = bird;

        //it is important to note that bird is not an instance of FlightEnabled;
        // it jsut agrees to behave certain way

        /* animal → Sees bird only as an Animal (can’t call fly() or track()).
        flier → Sees bird only as something that can fly().
        tracked → Sees bird only as something that can track(). */

        animal.move(); //should call the bird's move definiton only
        //flier.move();
        //tracked.move();

//      bird.fly();
//     flier.fly(); //would mean the same as flier is a reference variable for bird.
        inFlight(flier);
        inFlight(new Jet());

        Trackable truck = new Truck();
        truck.track();

        double KmsTraveled = 100;
        double milesTraveled = KmsTraveled * FlightEnabled.KM_TO_MILES;

    }

    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked){ //tracked is a variable
            tracked.track();
        }
        flier.land();
    }
}
