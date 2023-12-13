package searching;
import java.util.Scanner;
public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int c=0, l=0, u=9, n, m=0;
        System.out.println("Enter 10 numbers:");
        for(int i = 0; i<10; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a number to be searched: ");
        n = sc.nextInt();
        sc.close();
        while (l<=u)
        {
            m=(l+u)/2;
            if (arr[m]<n)
            {
                l=m+1;
            }
            else if(arr[m]>n)
            {
                u=m-1;
            }
            else
            {
                c=1;
                break;
            }
        }
        if (c==1) {
            System.out.println("Search successful at position "+(m+1)+".");
        }
        else{
            System.err.println("Search not successful.");
        }
    }
}