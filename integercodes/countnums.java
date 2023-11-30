package integercodes;
import java.util.Scanner;
public class countnums
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for array: ");
        int r = sc.nextInt();
        int arr[] = new int[r];
        System.out.print("Enter "+r+" numbers:");
        int p=0, n=0, z=0;
        for (int i = 0; i<r; i++)
        {
            arr [i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i<r; i++)
        {
            if (arr[i]>0)
            {
                p++;
            }
            else if(arr[i]<0)
            {
                n++;
            }
            else
            {
                z++;
            }
        }
        System.out.println("Positive: "+p
                            +"\nNegative: "+n
                            +"Zeroes: "+z);
    }
}