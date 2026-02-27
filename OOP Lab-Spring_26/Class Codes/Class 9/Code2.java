public class Code2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        int arr[] = new int[5];

        String s = null;

        try
        {
            System.out.println("a/b = " + a/b); // ArithmeticException
            arr[100] = 10; // ArrayIndexOutOfBoundException
            s.toLowerCase(); // NullPointerException
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
