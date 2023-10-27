import java.util.Scanner;

public class AreaOfSquare 
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter side of Square");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("Area of the Square : "+area);
        sc.close();
    }
}
