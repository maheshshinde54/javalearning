import java.util.Scanner;

public class ArmstrongNumber 
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Input a 3 digit number rang : ");
        int range = reader.nextInt();
        for( int i = 0 ; i < range ; i++)
        {
            int decimal,tenth,hundredth=0;
            hundredth=i/100;
            tenth=(i-hundredth*100)/10;
            decimal = i-hundredth*100-tenth*10;
            int multiplication= (hundredth*hundredth*hundredth)+(tenth*tenth*tenth)+(decimal*decimal*decimal);
            if( i == multiplication)
            {
                System.out.println(i);
            }

        }
        reader.close();

    }
}
