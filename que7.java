//fibonacci series
import java.util.Scanner;

public class que7 {

    public static void main(String[ ] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number:-");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci series of " + n + " numbers:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(a + ", ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        } 
    } 
}