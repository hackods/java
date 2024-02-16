package stringcodes;
import java.util.Scanner;
public class charCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        sc.close();
        int l = s.length();
        int nV=0, nC=0;
        for (int i =0; i<l; i++)
        {
            char ch = s.charAt(i);
            char c = Character.toUpperCase(ch);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'O')
            {
                nV++;
            }
            else{
                nC++;
            }
        }
        System.out.println("Number of Vowels: "+nV);
        System.out.println("Number of COnsonants: "+nC);
    }
}
