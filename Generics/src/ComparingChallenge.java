import java.util.Arrays;
import java.util.Comparator;

public class ComparingChallenge {
    public static void main(String[] args) {
        Employee[] employees = {new Employee("Zach", 6000.00), new Employee("Tim", 7502.00), new Employee("Ann", 5267.22)};
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));
    }
}

//Comparable
class Employee implements Comparable<Employee>{
    public int id;
    public String name;
    protected double Salary;
    private static int ID=100;

    public Employee(String name, double Salary){
        id = ID++;
        this.name = name;
        this.Salary = Salary;
    }
    @Override
    public int compareTo(Employee o) {
        //Employee E = (Employee) o;
        //return Integer.valueOf(id).compareTo(Integer.valueOf(E.id));
        //comparing by the id
        //you can compare by the name as well.
        return name.compareTo(o.name);
    }

    @Override
    public String toString(){
        return "Name: "+ name +"["+ Salary +"]";
    }
}

//Comparator
class EmployeeComparator implements Comparator<Employee>{

    @Override
    //can compare with multiple criterias
    //let's compare with id and name
    public int compare(Employee o1, Employee o2) {
        return (o1.Salary+o1.name).compareTo(o2.Salary+o2.name);
    }
}