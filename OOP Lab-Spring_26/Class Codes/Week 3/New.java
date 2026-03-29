//Static
//belongs to class, not object
class Student{
    String name; //direct assignment
    int id;
    static String dept="CSE";
    static String uni="UIU";
    static int cnt = 0;
    int cnt2=0;
    Student()
    {
        cnt++;
        cnt2++;
    }

    void display()
    {
        System.out.println(name);
    }

    static void info()
    {
        System.out.println("hi");
    }


}

public class New{
    public static void main(String[] args)
    {
        System.out.println(Student.cnt);
        Student s1= new Student();
        System.out.println(Student.cnt);
        Student s2= new Student();
        System.out.println(Student.cnt);
        System.out.println(s2.cnt2);
        s2.display();
        Student.info();
        s2.info();

    }
}