class Shape2D{
    int length;
    int width;

    public Shape2D(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

class Rectangle extends Shape2D{

    public Rectangle(int length, int width) {
        super(length, width);
    }

    double Area(){
        return length * width;
    }

    double Perimeter(){
        return 2 * (length + width);
    }
}

class Circle extends Shape2D{

    int radius;

    Circle(int radius){
        super(radius, radius);
        this.radius = radius;
    }

    double Area(){
        return Math.PI * radius * radius;
    }

    double Perimeter(){
        return 2 * Math.PI * radius;
    }
}

public class PracticeMain {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10,50);
        System.out.println("R1 Area: " + r1.Area());
        System.out.println("R1 Perimeter: " + r1.Perimeter());

        Circle c1 = new Circle(10);
        System.out.println("C1 Area: " + c1.Area());
        System.out.println("C1 Perimeter: " + c1.Perimeter());

    }

}
