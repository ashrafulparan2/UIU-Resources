import java.util.Scanner;

public class Code2 {

    public static void main(String[] args) {

        //Remove the comments and run the code

        //For-Each Loop
        int [] arr = {10,20,30,40,50};

        for(int x : arr)
        {
         //   System.out.print(x + " ");
        }

        //Scanner - Input
        Scanner sc = new Scanner(System.in);

     //   int a = sc.nextInt();
     //   System.out.println("a = " + a);

     //   float b = sc.nextFloat();
     //   System.out.println("b = " + b);

        //String input
      //  String s1 = sc.next(); //take input until space/newline
      //  System.out.println("s1 = " + s1);

     //   String s2 = sc.nextLine(); //take input until newLine
     //   System.out.println("s2 = " + s2);

        // Character Input
      //  char ch = sc.next().charAt(0);
      //  System.out.println("ch = " + ch);

        while(sc.hasNextInt()) //Loops until no integer input is given
        {
            int x = sc.nextInt();
            System.out.print(x + " ");
        }

    }
}
