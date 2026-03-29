class PointExample {
    int x;
    int y;

    PointExample() {}

    PointExample(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class PointArrayDemo {
    public static void main(String[] args) {
        PointExample p1 = new PointExample(2, 4);
        System.out.println("Single object:");
        p1.display();

        PointExample[] points = new PointExample[5];
        for (int i = 0; i < points.length; i++) {
            points[i] = new PointExample(i, i + 1);
        }

        System.out.println("Array of objects:");
        for (PointExample point : points) {
            point.display();
        }
    }
}
