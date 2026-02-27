// Problem Set 03 - Q1

public class Student {

    String rollNo;
    String name;
    double [] marks;
    final String universityName = "UIU";

    Student(String rollNo, String name, double [] marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    {
        System.out.println("Student Record Created");
    }

    double calculateAverage(){
        double sum = 0;
        for(double x: marks)
        {
            sum += x;
        }
        return sum/marks.length;
    }

    void displayInfo(){
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", University: " + universityName);
        System.out.print("Marks: ");
        for(double x: marks)
        {
            System.out.print(x + " ");
        }
        System.out.println("\nAverage Marks: " + calculateAverage());
    }

    static void findTopper(Student [] s){

        double maxMark = s[0].calculateAverage();
        int index = 0; ///position

        for(int i=1; i<s.length; i++)
        {
            if(s[i].calculateAverage() > maxMark){
                maxMark = s[i].calculateAverage();
                index =  i;
            }
        }

        System.out.println("Topper: " + s[index].name);

    }



}
