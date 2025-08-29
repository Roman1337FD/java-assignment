// factorial number
import java.util.Scanner;
public class que3{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a no. : ");
        int n = sc.nextInt() , product=1;
        for(int i=1 ; i<=n;i++){
            product = product*i;
        }
        System.out.println(product);
    }
}