public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(3,2);
        Point p2 = new Point(4,5);

       // System.out.println("Distance = " + p1.distance(p2));
       // System.out.println("Distance = " + p2.distance(p1));

      //  System.out.println("Distance = " + p2.distance(p2));

     /*   Circle c1 = new Circle(p1, 10);
        System.out.println("c1 area = " + c1.Area());
        System.out.println("c1 circumference = " + c1.Circumference()); */

        Point pt1 = new Point(0,0);
        Circle cir1 = new Circle(pt1, 10);

        Point pt2 = new Point(4,5);
        System.out.println(cir1.pointInsideCircle(pt2));

        Point pt3 = new Point(15,15);
        System.out.println(cir1.pointInsideCircle(pt3));

        Point pt4 = new Point(0,10);
        System.out.println(cir1.pointInsideCircle(pt4));


    }

}
