import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);

        String name=sc.nextLine();
        int id=sc.nextInt();
        double cgpa=sc.nextDouble();

        System.out.println("Name : " +name);
        System.out.println("ID : " +id);
        System.out.println("CGPA : " +cgpa);


    }
}