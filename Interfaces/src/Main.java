import java.util.ArrayList;
import java.util.List;

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

        //not recommended declaration, it is preferred to use the interfaces
        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new ArrayList<>();
        betterFliers.add(bird);
        //Once a class implements an interface, objects of that class can be referenced as instances of the interface type.

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        //landFliers(betterFliers);


    }

    //let's see why declaring with the interface is better
    private static void triggerFliers(List<FlightEnabled> fliers){
        for(var flier : fliers){
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers){
        for(var flier : fliers){
            flier.fly();
        }
    }

    private static void landFliers(ArrayList<FlightEnabled> fliers){
        for(var flier : fliers){
            flier.land();
        }
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
