package searching;
import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int i, c=0, n;
        for (i=0; i<10; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number to be searched: ");
        n = sc.nextInt();
        for (i=0; i<10; i++)
        {
            if (a[i]==n)
            {
                c=1;
            }
            else
            {
                continue;
            }
        }
        if (c==1)
        {
            System.out.println(n+ "is present in position " +i+ " of the array.");
        }
        else
        {
            System.out.println(n+ "is not present in the array.");
        }
        sc.close();
    }
}
