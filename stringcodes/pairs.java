package stringcodes;
import java.util.Scanner;
public class pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        sc.close();
        int l = s.length();
        int c=0;
        char f1, f2;
        for (int i = 0; i<l-1; i++)
        {
            f1 = s.charAt(i);
            f2 = s.charAt(i+1);
            if (f1==f2)
            {
                System.out.println("Consecutive letters: "+f1+f2);
                c++;
            }
            else
            {
                continue;
            }
        }
        if (c>0)
        {
            System.out.println("Total number of consecutive letters: "+c);
        }
        else
        {
            System.out.println("No consecutive letters found in string.");
        }
    }
}
