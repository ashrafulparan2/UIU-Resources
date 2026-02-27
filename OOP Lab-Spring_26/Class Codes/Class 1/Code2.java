class Student
{
    //Attributes/Variables
    float cgpa;
    int id;

    //Functions/Methods
    void PrintDetails(int marks)
    {
        System.out.println("ID: " + id + " CGPA: " + cgpa + " Marks: " + marks); //Use + operator to concat/join text for printing
    }


}

public class Code2 {

    public static void main(String[] args) {

        Student s1; // s1 -> reference
        s1 = new Student();  // s1 points to new Student object

        s1.id = 10;
        s1.cgpa = 3.5f;  // Need f for float variables

        s1.PrintDetails(95);

        Student s2 = new Student();
        s2.id = 25;
        s2.cgpa = 3.78f;

        s2.PrintDetails(91);

        Student s3; // s3 points to null
        //s3.id = 10; // Error, No Object is present

        s1 = s2; // s1 point to the object s2 was pointing to
        //the object s1 was pointing to is now lost as garbage
        s1.PrintDetails(100);
        s2.PrintDetails(100); // Prints same information

        s1.id = 50;
        System.out.println(s2.id); //s2.id shows 50 as s1, s2 points to same object


        // Can use classes in other .java files
        Point p = new Point();
        p.x = 3;
        p.y = 5;
        p.PrintPt();

        // Default variables used (5,5)
        Point q = new Point();
        q.PrintPt();


    }

}
