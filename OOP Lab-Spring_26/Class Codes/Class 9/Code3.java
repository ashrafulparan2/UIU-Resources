public class Code3 {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        int arr[] = new int[5];

        String s = null;

        try
        {
            System.out.println("a/b = " + a/b);
            arr[100] = 10;
            s.toLowerCase();
        }
        catch(ArithmeticException e) //Catches ArithmeticException
        {
            System.out.println("ARITHMETIC");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e) //Catches ArrayIndexOutOfBoundsException
        {
            System.out.println("ARRAY INDEX OUT OF BOUNDS");
            System.out.println(e);
        }
        catch(NullPointerException e) //Catches NullPointerException
        {
            System.out.println("NULL POINTER");
            System.out.println(e);
        }

    }
}
