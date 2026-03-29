import java.util.Scanner;

public class IntegerDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // int data type - stores whole numbers
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        System.out.println("Integer value: " + number);
        System.out.println("Double the value: " + (number * 2));
        
        sc.close();
    }
}
