public enum ToppingEnum {
    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

    //underneath enum is really just a class, hence you are able to create methods/constructors
    //unlike regular constructors, enum classes are always private.
    public double getPrice(){
        //return 0.5;
        //we can also use a switch
        return switch(this){
            //this refers to the current instance of the enum constant.
            case BACON -> 1.5;
            case CHEDDAR -> 1.0;
            default -> 0.0;
        };
    }
}
