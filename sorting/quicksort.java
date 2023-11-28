package sorting;
import java.util.Scanner;
public class quicksort {
    public int part(int[] arr, int l, int h) {
        int p = arr[h];
        int i = l - 1;
        for(int j = l; j <= h; j++) {
            if(arr[j] < p) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = t;

        return i + 1;
    }
    public void sort(int arr[], int l, int h) {
        if(l < h) {
            int x = part(arr, l, h);
            sort(arr, l, x - 1);
            sort(arr, x + 1, h);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        quicksort ob = new quicksort();
        System.out.println("Enter 5 numbers: ");
        for (int i=0; i<5; i++)
        {
            a[i] = sc.nextInt();
        }
        ob.sort(a, 0, 5);

        for(int x: a) System.out.println(x);
        sc.close();
    } 
}
