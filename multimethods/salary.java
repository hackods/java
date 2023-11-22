package multimethods;
import java.util.Scanner;
public class salary {
    int codeNo, basicpay;
    double spalw, conalw, gross, pf, netsalary, annualsalary;
    public void givevalues()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Code Number and Basic pay: ");
        codeNo = sc.nextInt();
        basicpay = sc.nextInt();
        sc.close();
    }
    public void salarycal()
    {
        spalw = (25.0/100.0)*basicpay;
        conalw = 1000;
        pf = (8.33/100.0)*basicpay;
        gross = basicpay+spalw+conalw;
        netsalary = gross-pf;
        annualsalary = 12*netsalary;
    }
    public void display()
    {
        System.out.println("Code Number: "+codeNo);
        System.out.println("Basic Pay: "+basicpay);
        System.out.println("Special Allowance: "+spalw);
        System.out.println("Conveyance Allowance: "+conalw);
        System.out.println("Provident Fund: "+pf);
        System.out.println("Gross pay: "+gross);
        System.out.println("Net Salary: "+netsalary);
        System.out.println("Annual Salary: "+annualsalary);
    }
    public static void main(String[] args) {
        salary ob = new salary();
        ob.givevalues();
        ob.salarycal();
        ob.display();
    }
}
