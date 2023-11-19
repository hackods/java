package sorting;
import java.util.Scanner;
public class selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("Enter 10 numbers: ");
        for (int i=0; i<10; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int small, pos, t, j;
        for (int i=0; i<10-1; i++)
        {
            small = arr[i];
            pos = i;
            for(j=i+1; j<10; j++)
            {
                if(arr[j]<small)
                {
                    small = arr[j];
                    pos = j;
                }
            }
            t = arr[i];
            arr[i] = arr[pos];
            arr[pos] = t;
        }
        System.out.println("Sorted array in ascending order:");
        for (int i=0; i<10; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
