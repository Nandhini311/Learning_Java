public class ObjectMain extends java.lang.Object {
    //every class in java extends a special class called Object (java.lang.Object)
    //Go to -> declaration > will show the source of the class
    public static void main(String[] args) {
        Student max;
        max = new Student("Max", 21);
        System.out.println(max.toString());
        //toString by default returns - object type and hashcode - an unique integer value that represents an object.
        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Alex");
        jimmy.toString();

    }
}

class Student{
    private String name;
    private int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class PrimarySchoolStudent extends Student{
    private String parentName;
    PrimarySchoolStudent(String name, int age, String parentName){
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString(){
        System.out.println(super.toString());
        System.out.println("Parent name is " + parentName);
        return null;
    }
}
