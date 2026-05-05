
class Example{

    int x;
    int y;

    Example(){
        this(0,0);
    }
    Example(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    Example(int len)
    {
        this(len, len);
    }

    Example(Example e)
    {
        this(e.x, e.y); //this chaining
//        this.x=e.x;
//        this.y=e.y;
    }

    int add(int a, int b)
    {
        return a+b;
    }

    int add(int a, int b, int c)
    {
        return a+b+c;
    }

    double add(double a, double b)
    {
        return a+b;
    }

    double add(double a, double b, double c)
    {
        return a+b+c;
    }

    double add(double a, int b, double c)
    {
        return a+b+c;
    }

}


public class OverloadingDemo {
    public static void main(String[] args) {
        Example e = new Example();
        e.add(1,2);
        e.add(1,2,3);
        e.add(3.4, 5.4);
        e.add(1.2,3.4,1.1);
        e.add(1.1,2, 3.3);
    }
}