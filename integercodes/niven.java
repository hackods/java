package integercodes;
import java.util.Scanner;
public class niven {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int m=n;
        int s=0, p;
        while (n>0)
        {
            p = n%10;
            s = s+p;
            n = n/10;
        }
        if (m%s==0)
        {
            System.out.println("Niven Number.");
        }
        else
        {
            System.out.println("Not Niven Number.");
        }
    }
}
