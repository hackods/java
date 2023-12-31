package overloading;
import java.util.Scanner;
public class shapesarea
{
    double area (double a, double b, double c)
    {
        double s = (a+b+c)/2;
        double v = s*(s-a)*(s-b)*(s-c);
        double ar = Math.sqrt(v);
        return ar;
    }
    double area (int a, int b, int height)
    {
        double ar;
        ar = (0.5)*height*(a+b);
        return ar;
    }
    double area (double diagonal1, double diagonal2)
    {
        double ar;
        ar = (0.5)*diagonal1*diagonal2;
        return ar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        shapesarea ob = new shapesarea();
        System.out.println("1. Area of scalene triange."
                            +"\n2. Area of trapezium."
                            +"\n3. Area of rhombus.");
        System.out.print("Enter choice: ");
        int c = sc.nextInt();
        double c1;
        switch (c) {
            case 1:
                System.out.print("Enter length of 3 sides: ");
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                double z = sc.nextDouble();
                c1 = ob.area(x, y, z);
                System.out.println("Area: "+c1);
                break;
            case 2:
                System.out.print("Enter length of parallel sides and height:");
                int p = sc.nextInt();
                int q = sc.nextInt();
                int h = sc.nextInt();
                c1 = ob.area(p, q, h);
                System.out.println("Area: "+c1);
                break;
            case 3:
                System.out.println("Enter length of 2 diagonals: ");
                double d1 = sc.nextInt();
                double d2 = sc.nextInt();
                c1 = ob.area(d1, d2);
                System.out.println("Area: "+c1);
                break;
            default:
                System.out.println("Wrong Input!");
                break;
        }
        sc.close();
    }
}