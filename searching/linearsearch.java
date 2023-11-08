package searching;
import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i=0; i<10; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
}
