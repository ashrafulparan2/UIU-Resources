import java.util.Scanner;

public class DoubleDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // double data type - stores decimal numbers
        System.out.print("Enter a decimal number: ");
        double decimal = sc.nextDouble();
        
        System.out.println("Double value: " + decimal);
        System.out.println("Rounded value: " + Math.round(decimal));
        
        sc.close();
    }
}
