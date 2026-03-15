class StudentExample {
    String name;
    int id;

    static String dept = "CSE";
    static String uni = "UIU";
    static int totalStudents = 0;

    int perObjectCounter = 0;

    StudentExample() {
        totalStudents++;
        perObjectCounter++;
    }

    void displayName() {
        System.out.println("Name: " + name);
    }

    static void showStaticInfo() {
        System.out.println("Department: " + dept + ", University: " + uni);
    }
}

public class StaticMembersDemo {
    public static void main(String[] args) {
        System.out.println("Initial total students: " + StudentExample.totalStudents);

        StudentExample s1 = new StudentExample();
        s1.name = "Alice";

        StudentExample s2 = new StudentExample();
        s2.name = "Bob";

        System.out.println("After creating objects, total students: " + StudentExample.totalStudents);
        System.out.println("s1 per-object counter: " + s1.perObjectCounter);
        System.out.println("s2 per-object counter: " + s2.perObjectCounter);

        s1.displayName();
        s2.displayName();

        StudentExample.showStaticInfo();
    }
}
