package overloading;
import java.util.Scanner;
public class dudeneypattern{
    public void print(){
        int k=1;
        for (int i = 1; i<=4; i++)
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print(k +" ");
                k++;
            }
            System.out.println();
        }
    }
    public boolean print(int a){
        int p, s=0, n = a;
        while (n>0)
        {
            p = n%10;
            s = s+p;
            n = n/10;
        }
        int x = (int) Math.pow(s, 3);
        if (x==a)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dudeneypattern ob = new dudeneypattern();
        System.out.println("1. Pattern."
                            +"\n2. Dudeney Check.");
        System.out.print("Enter Choice: ");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                ob.print();
                break;
            case 2:
                System.out.print("Enter a number: ");
                int a = sc.nextInt();
                boolean x = ob.print(a);
                if(x)
                {
                    System.out.println("Dudeney Number.");
                }
                else
                {
                    System.out.println("Not Dudeney Number.");
                }
                break;
            default:
                System.out.println("Wrong Choice!");
                System.exit(0);
        }
        sc.close();
    }
}