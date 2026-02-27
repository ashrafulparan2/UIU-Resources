class Point
{
    int x;
    int y;

    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    void Print()
    {
        System.out.println("(" + x + "," + y + ")");
    }
}


public class Code4 {

    public static void main(String[] args) {

        double x = Math.pow(2,3); //Math class has built in math function, just use Math.
        System.out.println("x = " + x);

        final int a = 10; // cannot change value of a final variable

        // Array

        int [] arr = new int[5]; // arr points to 5 int memory locations
        // int arr[] = new int[5]; //Alternate declaration
        // int arr[] = {10,20,30,40,50}; //Direct declaration

        for(int i=0; i<arr.length; i++) // can use arr.length to directly get length of array
        {
            arr[i] = 10 * i;
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();


        // Object class array

        Point [] pArr = new Point[5]; // pArr points to 5 Point references, not Point objects

        for(int i =0; i< pArr.length; i++)
        {
            pArr[i] = new Point(10,20); // need to create Point object at each index
        }

        for(int i =0; i< pArr.length; i++)
        {
            pArr[i].Print();
        }

    }

}
