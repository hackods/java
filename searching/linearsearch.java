package searching;
import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int c=0, n, p=0;
        for (int i=0; i<10; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number to be searched: ");
        n = sc.nextInt();
        sc.close();
        for (int i=0; i<10; i++)
        {
            if (arr[i]==n)
            {
                c=1;
                p=i;
                break;
            }
            else
            {
                continue;
            }
        }
        if (c==1)
        {
            System.out.println(n+ "is present in position " +p+ " of the array.");
        }
        else
        {
            System.out.println(n+ "is not present in the array.");
        }
    }
}
