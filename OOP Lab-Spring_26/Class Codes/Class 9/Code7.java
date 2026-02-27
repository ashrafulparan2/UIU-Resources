import java.io.IOException;

public class Code7 {

    public static void main(String[] args) {

        //  throw new ArithmeticException(); // Unchecked Exception
        //   throw new IOException(); // Checked Exception

        try
        {
            throw new IOException(); // Checked Exception - must be handled by try-catch, compile-time error (red mark)
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        throw new ArithmeticException(); // Unchecked Exception - no need to handle by try-catch, run-time error

    }

}
