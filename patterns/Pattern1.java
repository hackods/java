package patterns;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter number of columns:");
        int m = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= m; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
