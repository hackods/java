package integercodes;
import java.util.Scanner;
public class neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int m = (int) Math.pow(n, 2);
        int p, s=0;
        while (m>0)
        {
            p = m%10;
            s = s+p;
            m = m/10;
        }
        if (s==n)
        {
            System.out.println("Neon Number.");
        }
        else
        {
            System.out.println("Not Neon Number.");
        }
    }
}
