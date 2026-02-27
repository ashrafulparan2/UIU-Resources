public class Code5 {

    public static void main(String[] args) {

        /*
        try{}
        catch(Exception e){} //Cannot write the Exception block before the other blocks, redundant
        catch(ArithmeticException e){}
        catch(NullPointerException e){} */

        try
        {
            System.out.println("TRY");
            System.out.println(10/10);
        }
        catch(ArithmeticException e){
            System.out.println("CATCH");
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println("CATCH");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("CATCH");
            System.out.println(e);
        }
        finally //finally always runs, whether exception happens or not
        {
            System.out.println("FINALLY");
        }



    }

}
