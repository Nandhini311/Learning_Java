import java.util.concurrent.TimeoutException;

public class MoviePolyUsingInheritance {
    private String title;

    public MoviePolyUsingInheritance(String title){
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        //.getClass returns the class object of the current instance
        // retrieves the simple name of the class without the package
        System.out.println(title + " is a " + instanceType + " film");
    }

    //method to create an instance instead of creating it in the main
    public static MoviePolyUsingInheritance getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            default -> new MoviePolyUsingInheritance(title);
            case 'A' -> new Adventure(title);
            case 'S' -> new ScienceFiction(title);
        };
    }
}

//subclasses
class Adventure extends MoviePolyUsingInheritance{
    public Adventure(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("... %s %n".repeat(3), "Pleasant Scene", "Scary Music" ,"Something Bad Happens");
    }

    public void AdventureMovie(){
        System.out.println("You are watching an adventure movie");
    }

}

class Comedy extends MoviePolyUsingInheritance{
    public Comedy(String Title){
        super(Title);
    }

    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                "Comedian Funny", "Goofy Clumsy", "Everyone Laughs");
    }

    public void watchComedy(){
        System.out.println("You are watching a funny movie");
    }

}


class ScienceFiction extends MoviePolyUsingInheritance{
    public ScienceFiction(String Title){
        super(Title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                "Bad Alient Do Bad Stuffs", "Space Guys Chase Aliens", "Something Bad Happens");
    }
}


