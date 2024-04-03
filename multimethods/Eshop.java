package multimethods;
import java.util.Scanner;
public class Eshop {
    String name;
    double price;
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and price: ");
        name = sc.nextLine();
        price = sc.nextDouble();
    }
    public void calculate()
    {
        double d=0;
        if(price>=1000 && price<=25000)
        {
            d=5.0;
        }
        else if(price>25000 && price<=57000)
        {
            d=7.5;
        }
        else if(price>57000 && price<=100000)
        {
            d=10.0;
        }
        else if(price>100000)
        {
            d=15.0;
        }
        price=price-(price*(d/100));
    }
    public void display()
    {
        System.out.println("Item name: "+name);
        System.out.println("Final price:"+price);
    }
    public static void main(String[] args) {
        Eshop ob = new Eshop();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}
