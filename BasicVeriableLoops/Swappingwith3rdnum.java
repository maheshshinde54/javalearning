package BasicVeriableLoops;

import java.util.Scanner;

public class Swappingwith3rdnum 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = reader.nextInt();
        System.out.println("Enter second number");
        int num2 = reader.nextInt();
        int num3;
        num3=num1+num2;
        num2=num3-num2;
        num1=num3-num1;
        System.out.println("After swapping number are");
        System.out.println("First Number : "+num1);
        System.out.println("Second Number : "+num2);
        reader.close();

    }
}
