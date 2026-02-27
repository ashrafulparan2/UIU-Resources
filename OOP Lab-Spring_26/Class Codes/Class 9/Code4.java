import java.util.Scanner;

public class Code4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Converting string into int/double
        int x = Integer.parseInt("123");
        System.out.println("x = " + x + ", x++ = " + ++x);

        double d = Double.parseDouble("44.55");
        System.out.println("d = " + d);


        try
        {
            System.out.println(10/10);
            int y = Integer.parseInt("abc"); //NumberFormatException
            // int x = sc.nextInt(); //InputMismatchException
        }
        catch(ArithmeticException e)
        {
            System.out.println("ARITHMETIC");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ARRAY INDEX OUT OF BOUNDS");
            System.out.println(e);
        }
        catch(NullPointerException e)
        {
            System.out.println("NULL POINTER");
            System.out.println(e);
        }
        catch(Exception e) //Handles any other exception other than the above 3
        {
            System.out.println("SOME OTHER EXCEPTION");
            System.out.println(e);
        }

    }
}
