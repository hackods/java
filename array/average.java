package array;
import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int phy[] = new int[40];
        int chem[] = new int[40];
        int maths[] = new int [40];
        for (int i = 0; i<40; i++)
        {
            System.out.println("Enter marks for Physics: ");
            phy[i] = sc.nextInt();
            System.out.println("Enter marks for Chemistry: ");
            chem[i] =  sc.nextInt();
            System.out.println("Enter marks for Mathematics: ");
            maths[i] = sc.nextInt();
        }
        sc.close();
        int a=0, b=0;
        for (int i = 0; i<40; i++)
        {
            if((phy[i]+chem[i]+maths[i])/3>=80)
            {
                a++;
            }
            else if ((phy[i]+chem[i]+maths[i])/3<=34) {
                b++;
            }
            else
            {
                continue;
            }
        }
        System.out.println("Number of students with 80% and above: "+a);
        System.out.println("Number of students with 34% and below: "+b);
    }
}
