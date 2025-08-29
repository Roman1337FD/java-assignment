// sum of natural number
import java.util.Scanner;
public class que1{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a no. : ");
        int n = sc.nextInt() , sum=0;
        if(n<1){
            System.out.println("Not a natural number.");
        }
        else{

        for(int i=1 ; i<=n;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
    }
}
