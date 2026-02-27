class InvalidMarkException extends Exception //Checked exception
{
    //User defined exception can be of any type - checked or unchecked, depends on the parent class

    InvalidMarkException()
    {
        super("Mark not inside 0-100 range"); // send message using Parent constructor
    }

    InvalidMarkException(String msg)
    {
        super(msg);
    }
}

class School
{
    public static void validMarks(int marks) throws InvalidMarkException
    {
        if(marks < 0 || marks > 100) throw new InvalidMarkException(); // manually throw your exception
        else System.out.println("The marks is valid");
    }

    public static void getGrade(int marks) throws InvalidMarkException
    {
        if(marks>=50 && marks<=100) System.out.println("PASSED");
        else if(marks>=0 && marks<50) System.out.println("FAILED");
        else throw new InvalidMarkException("WRONG MARK, OUTSIDE RANGE");
    }
}

public class Code9 {

    public static void main(String[] args) {

        try
        {
            School.validMarks(100);
            School.getGrade(101);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

}
