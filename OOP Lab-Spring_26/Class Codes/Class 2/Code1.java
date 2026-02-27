class Student
{
    int id;
    float cgpa;
    static String uni = "UIU"; //static variable, only 1 variable for all objects of the class

    void f1()
    {
        System.out.println("Normal Function");
    }

    static void f2()
    {
        System.out.println("Static Function");
        System.out.println("University: " + uni);
       // System.out.println("ID: " + id); //cannot use non-static variable in static function
    }

    void Print()
    {
        System.out.println("ID: " + id + ", CGPA: " + cgpa + ", UNI: " + uni);
    }
}


public class Code1 {

    public static void main(String[] args) {

        System.out.println("University: " + Student.uni);
        Student.f2(); //can use static variable/function using class name, no objects needed
      //  Student.f1(); // need objects for non-static variable/function
      //  System.out.println("ID: " + Student.id); 

        Student s1 = new Student();
        s1.cgpa = 3.5f;
        s1.id = 10;
        s1.uni = "BUET";

        s1.f1();
        s1.f2();
        s1.Print();

        Student s2 = new Student();
        s2.Print();
        s2.f2();

    }
}
