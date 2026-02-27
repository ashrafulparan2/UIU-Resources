interface Enrollable
{
    void enroll(String courseName);
    void drop(String courseName);
}

abstract class User
{
    String username;
    String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public abstract void showProfile();
}

class Student extends User implements Enrollable
{
    int completedCourses;

    public Student(String username, String email, int completedCourses) {
        super(username, email);
        this.completedCourses = completedCourses;
    }

    public void enroll(String courseName)
    {
        System.out.println("Enrolled in course: " + courseName);
    }

    public void drop(String courseName)
    {
        System.out.println("Dropped from course: " + courseName);
    }

    public void showProfile()
    {
        System.out.println("Name: " + username);
        System.out.println("Email: " + email);
        System.out.println("Completed Courses: " + completedCourses);
    }

    public void completeCourse()
    {
        completedCourses++;
    }
}

public class LearningApp {

    public static void main(String[] args) {

        Student s1 = new Student("Amy", "amy@gmail.com", 5);
        Student s2 = new Student("Bob", "bob@gmail.com", 3);

        s1.enroll("SPL");
        s2.drop("OOP");

        s1.showProfile();
        s1.completeCourse();
        s1.showProfile();

    }

}
