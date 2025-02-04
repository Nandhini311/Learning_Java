public record Employee(int id, String firstName, String lastName ) {
/*for each component in the header, java generates
1. field with the same name and declared type as record component.
2. field is private and final - cannot be modified.
3. sometimes refered to as component field.

Java generates a toString() Method to print out each attribute in a formatted String.
In addition to creating a prival final field, it also generates a public accessor method for each component.
    */
}


