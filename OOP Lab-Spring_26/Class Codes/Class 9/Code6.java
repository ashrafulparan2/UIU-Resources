public class Code6 {

    public static void main(String[] args) {

        // System.out.println(10/0);
        System.out.println("Main starts");

        try
        {
            throw new ArrayIndexOutOfBoundsException();
            // throw can be used to manually throw an exception
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
}
