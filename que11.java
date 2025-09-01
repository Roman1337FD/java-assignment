import java.util.Scanner;

public class que11 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the three numbers:-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b){
            System.out.println("the numbers are pythagorean triplet");
        } else {
            System.out.println("the numbers are not pythagorean triplet");
        }
    }
}
// TRIPLETS