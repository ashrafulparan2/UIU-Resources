class Student
{
    void read()
    {
        System.out.println("Student reads study material");
    }

    void eat()
    {
        System.out.println("Student eats food");
    }
}

class SPLStudent extends Student
{
    void read() //Method Overriding
    {
        System.out.println("Student reads C Programming");
    }

    void code()
    {
        System.out.println("Coding in Codeblocks");
    }
}

public class Code3 {

    public static void main(String[] args) {

        // Parent ref Parent obj
        Student s1 = new Student();
        s1.eat(); //Parent method
        s1.read(); //Parent method

        System.out.println("********************************");

        // Child ref Child obj
        SPLStudent s2 = new SPLStudent();
        s2.eat(); //Only parent method
        s2.read(); //Overridden method - Child
        s2.code(); //Only child method

        System.out.println("********************************");

        //Subclass Polymorphism
        // Parent ref - Child Obj
        Student s3 = new SPLStudent();
        s3.eat(); //Only Parent method
        s3.read(); //Overridden method - Child
       // s3.code(); //Only Child method - cannot access

        System.out.println("********************************");
        System.out.println("Typecasting");

        // Typecasting - only for subclass polymorphism
        ((SPLStudent) s3).code();

    }

}
