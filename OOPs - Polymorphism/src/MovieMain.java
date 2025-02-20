public class MovieMain {
    public static void main(String[] args) {
        MoviePolyUsingInheritance theMovie = new Adventure("Star Wars");
        //MoviePolyUsingInheritance type is okay as adventure is a child of this parent class.
        theMovie.watchMovie();

        MoviePolyUsingInheritance theMovie2 = new ScienceFiction("Starship Troopers");
        theMovie2.watchMovie();
    }
}
