package integercodes;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int m = n, k = n;
        int c=0;
        while (n>0)
        {
            c++;
            n = n/10;
        }
        int p, s=0;
        while (m>0)
        {
            p = m%10;
            s = (int) (Math.pow(p, c)) + s;
            m = m/10;
        }
        if (s==k)
        {
            System.out.println("Armstrong Number.");
        }
        else
        {
            System.out.println("Not Armstrong Number.");
        }
    }
}
