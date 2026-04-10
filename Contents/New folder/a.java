import java.util.Scanner;

public class a{
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t-- > 0){
            int a, b, c, d;
            a = sc.nextInt();
            b = sc.nextInt(); 
            c = sc.nextInt();
            d = sc.nextInt();
           if(a==b && c==d&& a==c && b==d && a==d && b==c && c==a && d==b && c==b && d==a){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}