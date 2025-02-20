public class MoviePolyUsingInheritance {
    private String title;

    public MoviePolyUsingInheritance(String title){
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        //.getClass returns the class object of the current instance
        // retrieves the simple name of the class without the package
        System.out.println(title + "is a " + instanceType + " film");
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
}

/*class Comedy extends MoviePolyUsingInheritance{

}
*/

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


