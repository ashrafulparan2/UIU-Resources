class Person
{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0 && age<120)
            this.age = age;
    }

    public String getDetails()
    {
        return "Person: " + name + ", " + age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person
{
    String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getDetails()
    {
        return "Student: " + getName() + ", " + getAge() + ", " + major;
    }
}

class Professor extends Person
{
    String department;
    Student [] thesisStudents = new Student[5];
    int studentCount = 0;

    public Professor(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDetails()
    {
        return "Professor: " + getName() + ", " + getAge() + ", " + department;
    }

    public void addThesisStudent(Student s)
    {
        if(studentCount < 5)
        {
            thesisStudents[studentCount] = s;
            studentCount++;
        }
    }

    public void thesisStudentInfo()
    {
        for(int i=0; i<studentCount; i++)
            System.out.println(thesisStudents[i].getDetails());
    }

}

class Course
{
    private String code;
    private String title;

    public String getTitle() {
        return title;
    }

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public Course(String code) {
        this.code = code;
        title = "TBD";
    }

    public String courseInfo()
    {
        return "Course: " + code + " - " + title;
    }
}

class Enrollment
{
    Student student;
    Course course;
    Professor professor;
    double grade = -1;

    public Enrollment(Student student, Course course, Professor professor) {
        this.student = student;
        this.course = course;
        this.professor = professor;
    }

    public void assignGrade(double grade)
    {
        if(grade>0 && grade<100) this.grade = grade;
    }

    public String getReport()
    {
        if(grade != -1) return student.getName() + " enrolled in " + course.getTitle() + " under " + professor.getName() + ": " + grade;
        else return student.getName() + " enrolled in " + course.getTitle() + " under " + professor.getName() + ": Pending";
    }
}

public class UniversityMain {

    public static void main(String[] args) {

        Person [] arr = new Person[6];
        arr[0] = new Student("Alice", 10, "CSE");
        arr[1] = new Student("Bob", 11, "BBA");
        arr[2] = new Student("Charles", 12, "EEE");
        arr[3] = new Student("Dan", 13, "Banking");
        arr[4] = new Professor("Dr. Einstein", 50, "Engineering");
        arr[5] = new Professor("Dr. Gates", 50, "Business");

        for(Person p: arr)
            System.out.println(p.getDetails());

        ((Professor)arr[4]).addThesisStudent((Student)arr[0]);
        ((Professor)arr[4]).addThesisStudent((Student)arr[2]);
        ((Professor)arr[5]).addThesisStudent((Student)arr[1]);
        ((Professor)arr[5]).addThesisStudent((Student)arr[3]);

        Course c1 = new Course("CSE1110", "ICS");
        Course c2 = new Course("CSE1111");

        System.out.println(c1.courseInfo());
        System.out.println(c2.courseInfo());

        Enrollment e1 = new Enrollment((Student)arr[0], c1, (Professor)arr[4]);
        Enrollment e2 = new Enrollment((Student)arr[2], c2, (Professor)arr[4]);

        e1.assignGrade(90);
        e2.assignGrade(-10);

        System.out.println(e1.getReport());
        System.out.println(e2.getReport());

        ((Professor)arr[4]).thesisStudentInfo();
        ((Professor)arr[5]).thesisStudentInfo();
    }

}
