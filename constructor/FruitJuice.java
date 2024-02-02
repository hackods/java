package constructor;
import java.io.FileReader;
import java.util.Scanner;
public class FruitJuice {
    int product_code, pack_size;
    String flavour, pack_type;
    double product_price, discounted_price;
    public FruitJuice()
    {
        product_code=0;
        product_price=0;
        flavour="";
        pack_type="";
        product_price=0.0;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Code: ");
        product_code = sc.nextInt();
        System.out.print("Enter Flavour: ");
        flavour = sc.nextLine();
        System.out.print("Enter pack type: ");
        pack_type = sc.nextLine();
        System.out.print("Enter product price: ");
        product_price = sc.nextDouble();
    }
    public void discount()
    {
        discounted_price = product_price - (product_price)*(10.0/100.0);
    }
    public void display()
    {
        System.out.println("Product Code: "+product_code);
        System.out.println("Flavour: "+flavour);
        System.out.println("Pack Type: "+pack_type);
        System.out.println("Pack Size: "+pack_size);
        System.out.println("Amount: "+discounted_price);
    }
    public static void main(String[] args) {
        FruitJuice ob = new FruitJuice();
        ob.input();
        ob.discount();
        ob.display();
    }
}