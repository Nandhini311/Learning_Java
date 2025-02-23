public class MovieNextMain {
    public static void main(String[] args) {
        var airplane = MoviePolyUsingInheritance.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Adventure("Airplane");
        plane.AdventureMovie();

        //var - allows you to declare local variables without mentioning the type; type will be decided during compile time.
        //value must be initialized

        Object unknownObject = MoviePolyUsingInheritance.getMovie("A", "Airplane");
        if(unknownObject.getClass().getSimpleName() == "Adventure"){
            Adventure a = (Adventure) unknownObject;
            a.AdventureMovie();
        }
        //instanceOf operator
        else if(unknownObject instanceof ScienceFiction){
            ((ScienceFiction) unknownObject).watchMovie();
        }
        else if(unknownObject instanceof Comedy cm){
            cm.watchComedy();
        }
        //cm is a variable created as part of the instanceof check, if condition is true,
        // cm will be the reference for that unknownObject.



    }
}
