package stringcodes;
import java.util.Scanner;
public class sumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        sc.close();
        int l = s.length();
        char c;
        int sum=0;
        for (int i = 0; i<l; i++)
        {
            c = s.charAt(i);
            if (c>='0' && c<='9')
            {
                sum = sum + (int)c-48;
            }
            else
            {
                continue;
            }   
        }
        System.out.println("Sum of digits: "+sum);
    }
}
