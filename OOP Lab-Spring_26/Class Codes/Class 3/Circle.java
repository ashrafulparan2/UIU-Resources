public class Circle {

    Point center;
    double radius;

    Circle(Point center, double radius)
    {
        this.center = center;
        this.radius = radius;
    }

    double Area()
    {
        return Math.PI * radius * radius;
    }

    double Circumference()
    {
        return 2 * Math.PI * radius;
    }

    boolean pointInsideCircle(Point p)
    {
        double dist = center.distance(p);

        if(dist < radius)
        {
            return true;
        }
        else return false;
    }

}
