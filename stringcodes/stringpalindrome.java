package stringcodes;
import java.util.Scanner;
public class stringpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        sc.close();
        int l = s.length();
        char ch;
        String sf="";
        for (int i=0; i<l; i++)
        {
            ch = s.charAt(i);
            sf = ch + sf;
        }
        if (s.equalsIgnoreCase(sf))
        {
            System.out.println("The given string is palindrome.");
        }
        else
        {
            System.out.println("The given string is not palindrome.");
        }
    }
}
