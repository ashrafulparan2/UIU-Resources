class Parent{
    int x=5;
    void print()
    {
        System.out.println("Parent");
    }
}

class Child extends Parent{
    int x=10;
    void print()
    {
        System.out.println("Child");
    }
}

class Child2 extends Parent{
    int x=12;
    void print()
    {
        System.out.println("Child2");
    }
    
    void Child2Only()
    {
        System.out.println("Inside Child2");
    }
}





public class UpcastingDemo {
    public static void main(String[] args) {
       Parent p = new Child();
       System.out.println(p.x);
       System.out.println(((Child)p).x);
       p.print();
       Parent p2 = new Child2();
       System.out.println(p2.x);
       p2.print();
       ((Child2)p2).Child2Only();
       System.out.println(((Child2)p2).x);
    }
}













