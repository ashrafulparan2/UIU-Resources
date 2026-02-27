abstract class Shape
{
    String name;
    double area;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public void printArea()
    {
        System.out.println("Name: " + name + ", Area: " + getArea());
    }
}

class Circle extends Shape
{
    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * Math.pow(radius,2);
    }
}

class Rectangle extends Shape
{
    double length, width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double getArea()
    {
        return length * width;
    }
}

public class Practice1 {

    public static void main(String[] args) {

        Shape [] shapeArr = new Shape[2];
        shapeArr[0] = new Circle("Circle 1", 10);
        System.out.println("Circle area = " + shapeArr[0].getArea());
        shapeArr[0].printArea();

        shapeArr[1] = new Rectangle("Rect 1", 10, 20);
        System.out.println("Rectangle area = " + shapeArr[1].getArea());
        shapeArr[1].printArea();




    }

}
