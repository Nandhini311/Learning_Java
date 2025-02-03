public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    //public String ownerName = "Nandhini";
    private boolean convertible = true; //by default gets assigned with false.
    //these are called fields as they are declared in the class. access modifier must be specified for fields,
    //if not by default package modifier will be assigned.

    //if we are using non-static fields inside a method, the method cannot be static.
    public String getMake(){
        return make;
    }

    public void setMake(String make){
        //this is a keyword in java that refers to the current object/instance from which it is being invoked.
        //helped us differentiate between the parameter make and the instance make of this class.

        //now adding some validation to this method
        if(make == null){
            make = "Unknown";
        }
        String lowercaseMake = make.toLowerCase();
        switch(lowercaseMake){
          case "holden", "porsche", "tesla" -> this.make = make;
          default -> this.make = "Unsupported";
        }
    }
    //why not static ? as it will have to access instance field on the class
    //static method can only access static variable.
    //instance memebers can access both static and instance variables
    public void describeCar(){
        System.out.println(doors + "- Door "+
                color + " " + make + " " + (convertible ? "Covertible": " Not a Convertible"));
    }
} // car template

