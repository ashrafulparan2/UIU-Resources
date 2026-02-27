public class Code1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try
        {
            System.out.println("TRY");
            System.out.println("a/b = " + a/b); // Risky / Exception throwing code
            System.out.println("TRY 2"); //this line will not be executed if exception is thrown in the line before
        }
        catch(Exception e)
        {
            System.out.println("CATCH");
            System.out.println(e); // print Exception Name : Message
            System.out.println(e.getMessage()); // print Message
        }

        System.out.println("After Error");

    }

}
