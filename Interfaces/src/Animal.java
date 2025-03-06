enum FlightStages implements Trackable{
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;
    @Override
    public void track() {
        if (this != GROUNDED){
            System.out.println("Monitoring "+ this);
        }
    }
}


record DragonFly(String name, String type) implements FlightEnabled{
    @Override
    public void takeOff() {}
    @Override
    public void land() {}
    @Override
    public void fly() {}
    @Override
    public void track() {}
}
class Satellite implements OrbitEarth{
    FlightStages stage = FlightStages.GROUNDED;

    @Override
    //needs to be mentioned public as the method written in OrbitEarth is public too.
    public void achieveOrbit() {
        System.out.printf("Orbit achieved");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void track() {

    }
}

interface OrbitEarth extends  FlightEnabled{
    void achieveOrbit();
    static void log(String description){
        var today = new java.util.Date();
        System.out.println(today + ":" + description);
    }

    private void logStage(FlightStages stage, String description){
        description = stage + ":" + description;
        log(description);
    }

    default FlightStages transition(FlightStages stage){
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, "Begining transition to "+ nextStage);
        return nextStage;
    }
}


interface FlightEnabled{
    public abstract void takeOff();
    abstract void land();
    void fly(); //how is this still okay? without an abstract modifier.
    //in interfaces any method that is declared without a body is implicit declared both public and abstract.
    //allowed modifiers for method -> public abstract, private concrete methods, default methods, static methods.
    //protected methods not allowed as it's mainly for inheritance.

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void track();
    //field declared on an interface is always public, static and final.

    //now if we are suddnely adding a method - every other classes or interfaces which have implemented this need to have this method defined.
    //it will be troublesome if the code base is too big.
    //we can resolve this by making this a default method

    default FlightStages transition(FlightStages stage){
        System.out.println("Transition not implemented on " + getClass().getName());
        return null;
    }

}

interface Trackable {
    void track();
}


public abstract class Animal {
    public abstract void move();
}
