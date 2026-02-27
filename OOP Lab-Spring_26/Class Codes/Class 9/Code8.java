class A
{
    public static void f1()
    {
        System.out.println(10/0); //Unchecked Exception
    }

    // Exception can be handled in 2 ways
    // 1. try - catch
    // 2. throws - forwards the exception to the caller of the function, must be handled by the caller
    public static void f2() throws Exception
    {
        throw new Exception(); //Checked Exception
    }
}


public class Code8 {

    public static void main(String[] args){

        try
        {
            A.f1();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        //A.f2(); //Checked exception, must be handled, thrown by the function

        try
        {
            A.f2();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

}
