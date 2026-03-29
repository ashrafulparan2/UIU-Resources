
class Point{
    int x;
    int y;
    Point(){}
    Point(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    void display()
    {
        System.out.println("("+x+","+y+")");
    }

}

class Circle{
    int radius;
    Circle(){}
    Circle(int radius)
    {
        this.radius=radius;
    }
    double area()
    {
        return Math.PI*radius*radius;
    }

    double circumference()
    {
        return 2*Math.PI*radius;
    }


}


public class Main{
    public static void main(String[] args)
    {
        Point p1=new Point(2,4);
        p1.display();

//        int[] arr= new int[10];

        Point[] p = new Point[10];

        for(int i=0;i<p.length;i++)
        {
            p[i]=new Point(i,i+1);
        }
        for(int i=0;i<p.length;i++)
        {
            p[i].display();
        }

    }
}
