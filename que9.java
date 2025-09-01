import java.util.Scanner;

public class que9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter a number:-");
    int n = sc.nextInt();
    int originalNumber = n;
    int sum = 0;
    int numDigits = String.valueOf(Math.abs(n)).length();
    int num = Math.abs(n);
    while (num > 0) {
        int digit = num % 10;
        sum += Math.pow(digit, numDigits);
        num /= 10;
    }
    if (sum == Math.abs(originalNumber)) {
        System.out.println(originalNumber + " is an Armstrong number");
    } else {
        System.out.println(originalNumber + " is not an Armstrong number");
    }
    }
}

// Armstrong number