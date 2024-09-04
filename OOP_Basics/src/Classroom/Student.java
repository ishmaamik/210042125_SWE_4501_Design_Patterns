package Classroom;

public class Student {

    String name;
    int age;

    public Student()    //Default constructor, need not be written, is automatically
    {

    }

    public Student(String s, int age) //Parameterized constructor
    {
        name= s;
        this.age= age;
    }

    public Student(String s)
    {
        this.name= s;
    }

    //During compile time, method overloading is done...
    //Say u wrote Classroom.Student("Ishu"), during compile time the last
    //constructor is automatically chosen.

}
