package sorting;
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int j, t;
        
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < 10 - 1; i++) {
            for (j = 0; j < 10 - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }

        System.out.println("Sorted array in descending order:");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
