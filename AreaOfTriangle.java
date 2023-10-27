import java.util.Scanner;

class AreaOfTriangle
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int height,base;
        System.out.println("Enter Hight of triangle");
        height = sc.nextInt();
        System.out.println("Enter base of triangle");
        base = sc.nextInt();
        int area = (height*base)/2;
        System.out.println("Area of the triangle is : "+area);
        sc.close();

    }
}
