// PRIME NUMBER
import java.util.Scanner;
public class que8{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number n");
        int n=sc.nextInt();
        int count=0;
        if(n<2){
            System.out.println("not prime");
        }
        else{
            for(int i=1;i<=Math.sqrt(n);i++){
                if(n%i==0){
                count=count+1;}
                
            }if(count==1){
                    System.out.println("prime");
                }
                else{
                    System.out.println("not prime");
                }
            
        }
        
    }
}