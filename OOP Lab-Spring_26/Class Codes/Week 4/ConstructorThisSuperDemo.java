class Person
{
    String name;
    int age;

    int x=10;

    Person(){
        this("", 0);
    }
    Person(String name)
    {
        this(name, 0);
    }
    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
}

class Student extends Person{
    int id;

    int x=7;

    Student()
    {

    }
    Student(String name, int age)
    {
        super(name, age);
    }
    Student(String name, int age, int id)
    {
        super(name, age);
        this.id=id;
    }

    void display()
    {
        System.out.println(this.x);
        System.out.println(x);
        System.out.println(super.x);
    }
}


public class ConstructorThisSuperDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}