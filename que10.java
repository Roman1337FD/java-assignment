import java.util.Scanner;

public class que10 {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter a number:-");
        int n = sc.nextInt();
        int originalNumber = n;
        int sum = 0;
        while (n > 0) {
            int factorial = 1;
            int rem =  n %10;
            for (int i=1; i<=rem; i++){
                factorial *= i;
            }
            sum += factorial;
            n /= 10;
        }
        if(originalNumber == sum){
            System.out.println("Strong Number");
        } else {
            System.out.println(" Not a Strong Number");
        }
    }
}
//Strong Number