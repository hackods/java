package integercodes;
import java.util.Scanner;
public class digitsum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int p, s = 0;
        while (n>0)
        {
            p = n%10;
            s = s+p;
            n = n/10;
        }
        System.out.println("Sum of the digits: "+s);
    }
}