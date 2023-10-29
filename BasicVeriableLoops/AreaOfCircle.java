package BasicVeriableLoops;

import java.util.Scanner;
class AreaOfCircle
{
    public static void main(String agrs [])
    {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.println("Enter redice of Circle");
        r=sc.nextInt();
        int area = (22*r*r)/7;
        System.out.println("Area of Circle is : "+area);
        sc.close();

    }
}