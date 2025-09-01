import java.util.Scanner;
public class que6{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:-");
        int n = sc.nextInt(); 
        int original=n;
        int reverse=0;

        while (n>0){
            int digit = n%10;
            reverse = reverse * 10 +digit;
            n /=10;
        }
        if(original==reverse){
            System.out.println("palindrome number");
        }
        else{
            System.out.println("not palindrome");
        } 

}    
}
