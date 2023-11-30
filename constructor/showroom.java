package constructor;
import java.util.Scanner;
public class showroom {
    String name;
    double cost, dis, amount;
    public showroom()
    {
        name = "";
        cost = 00.00;
        dis = 00.00;
        amount = 00.00;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr Name and cost: ");
        name = sc.nextLine();
        cost = sc.nextDouble();
        sc.close();
    }
    public void calculate()
    {
        if(cost<=10000)
        {
            dis = 5.0;
        }
        else if(cost>10000 && cost<=20000)
        {
            dis = 10.0;
        }
        else if(cost>20000 && cost<=35000)
        {
            dis = 15.0;
        }
        else
        {
            dis = 20.0;
        }
        amount = cost - (cost*(dis)/100);
    }
    public void display()
    {
        System.out.println("Name: "+name
                            +"\nAmount: "+amount);
    }
    public static void main(String[] args) {
        showroom ob = new showroom();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
