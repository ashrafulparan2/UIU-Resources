import java.util.Scanner;

public class StringDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // String data type - stores text
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        
        System.out.println("String value: " + text);
        System.out.println("Length: " + text.length());
        
        sc.close();
    }
}
