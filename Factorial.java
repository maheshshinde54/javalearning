import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int factorial=1;
        System.out.println("Enter a number");
        int number = reader.nextInt();
        for(int i= 1 ;i <=number;i++)
        {
            factorial = factorial*i;
        }
        System.out.println("factorial : "+factorial);
        reader.close();
        
    }
}
