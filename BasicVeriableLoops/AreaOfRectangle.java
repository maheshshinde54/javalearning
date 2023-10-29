package BasicVeriableLoops;

import java.util.Scanner;

class AreaOfRectangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        int length = sc.nextInt();
        System.out.println("Enter breath of rectangle");
        int breath =  sc.nextInt();
        int area = length*breath;
        System.out.println("Area of the rectangle : "+area);
        sc.close();
    }

}