class CircleExample {
    int radius;

    CircleExample() {}

    CircleExample(int radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircleCalculationsDemo {
    public static void main(String[] args) {
        CircleExample c1 = new CircleExample(7);

        System.out.println("Circle calculations demo:");
        System.out.printf("Radius: %d%n", c1.radius);
        System.out.printf("Area: %.2f%n", c1.area());
        System.out.printf("Circumference: %.2f%n", c1.circumference());
    }
}
