public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee(1001, "Nandhini", "Jeyanthi");
        //auto generated getter methods.
        System.out.println(e1.id() + " "+ e1.firstName() + " " + e1.lastName());
        System.out.println(e1.toString());//autogenerated toString() Method form the record class.
        //we are able to do this now without creating a whole class, declaring all variables seperately, creating getter, setter method, or override tostring() method
        //Record - to replace the boilerplate code of the POJO but more restrictive.
        for(int i = 2; i<=4; i++){
            Employee e = new Employee(1000+i,
                    switch(i){
                        case 2-> "Roopleen";
                        case 3-> "Shivam";
                        case 4-> "Sagar";
                        default -> "Anonymous";
                    }, switch (i){
                case 2-> "Kaur";
                case 3-> "Kumar";
                case 4-> "Sharma";
                default -> "Anonymous";
            });
            System.out.println(e);

        }
    }
}
