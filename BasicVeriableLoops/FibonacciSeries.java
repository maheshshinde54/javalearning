package BasicVeriableLoops;

import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int prevnum;
        int nextnum = 1;
        System.out.println("Input a number to find Fibonacci Series");
        int limit =  sc.nextInt();
        for( int i = 0; i<limit;i++)
        {
            prevnum=nextnum;
            nextnum = sum;
            sum = prevnum + nextnum;
            System.out.println(sum);
        }
        sc.close();
    }
    
}