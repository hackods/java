package simplecodes;
import java.util.Scanner;
public class integerpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int s=0, p, m=n;
        while(n>0)
        {
            p = n%10;
            s = (s*10)+p;
            n = n/10;
        }
        if (s==m)
        {
            System.out.println("The given number is palindrome.");
        }
        else
        {
            System.out.println("The given number is not palindrome.");
        }
        sc.close();
    }
}