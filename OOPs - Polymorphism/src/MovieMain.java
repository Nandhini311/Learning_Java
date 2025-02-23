import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        /*MoviePolyUsingInheritance theMovie = new Adventure("Star Wars");
        //MoviePolyUsingInheritance type is okay as adventure is a child of this parent class.
        theMovie.watchMovie();

        MoviePolyUsingInheritance theMovie2 = new ScienceFiction("Starship Troopers");
        theMovie2.watchMovie();

        MoviePolyUsingInheritance theMovie3 = MoviePolyUsingInheritance.getMovie("Adventure", "XYZ");
        theMovie3.watchMovie();*/

        Scanner s = new Scanner(System.in);

        while(true){
            System.out.print("Enter Type (A for Adventure, S for Science Fiction" +
                    "Q for Quit): ");
            String type = s.nextLine(); //get's the input from the user.
            //if(type == "Q" || type == "q") doesn't work as equality sign checking the reference value and not the actual value/content
            if("Qq".contains(type)){
                break;}
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            MoviePolyUsingInheritance movie = MoviePolyUsingInheritance.getMovie(type, title);
            movie.watchMovie();
        }

        //to learn how to do this in a much simpler way - let's do it in MovieNextMain

    }
}
