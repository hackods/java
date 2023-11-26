package constructor;
import java.util.Scanner;
public class taximeter
{
    int taxino, km, amt;
    String name;
    public taximeter()
    {
        taxino = 0;
        name = " ";
        km = 0;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter taxi number, name and distance: ");
        taxino = sc.nextInt();
        name = sc.nextLine();
        km = sc.nextInt();
        sc.close();
    }
    public void calculate()
    {
        if(km<=1)
        {
            amt = 25;
        }
        else if(km>1 && km <=6)
        {
            amt = 25+((km-1)*10);
        }
        else if(km>6 && km<=12)
        {
            amt = 25+(5*10)+((km-6)*15);
        }
        else if (km>12 && km<=18) {
            amt = 25+(5*10)+(5*15)+((km-12)*20);
        }
        else{
            amt = 25+(5*10)+(5*15)+(5*20)+((km-18)*25);
        }
    }
    public void display()
    {
        System.out.println("Taxi Number: "+taxino
                            +"\nName: "+name
                            +"\nDistance: "+km
                            +"\nAmount: "+amt);
    }
    public static void main(String[] args) {
        taximeter ob = new taximeter();
        ob.input();
        ob.calculate();
        ob.display();
    }
}