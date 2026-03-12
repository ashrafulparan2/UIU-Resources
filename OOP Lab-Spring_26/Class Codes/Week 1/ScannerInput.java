import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        // Creating Scanner object to read input from console
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("You entered: " + name);
        
        sc.close();
    }
}
