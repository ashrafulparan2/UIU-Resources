class Student{
    String name;
    int id;
    static String dept="CSE";
    static int cnt=0;
    int cnt2=0;
    
    static {
        cnt+=2;
    }
    
    {
        cnt+=2;
    }
    
    
    Student()
    {
        cnt++;
        cnt2++;
        id=cnt;
    }
}

public class StudentStaticCounterDemo {
    public static void main(String[] args) {
      Student s = new Student();
      Student s2 = new Student();
       Student s3 = new Student();
      
      System.out.println(s.id);
      System.out.println(s2.id);
      System.out.println(s3.id);

    }
}