import java.util.Scanner;

public class Average
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        int mean,sum=0;
        System.out.println("Enter how many to number to calculate avarage : ");
        int number = reader.nextInt();
        int allnumber[] = new int[number];
        for(int i = 0; i<number; i++)
        {
            allnumber[i]=reader.nextInt();
        }
        for(int i = 0; i<number; i++)
        {
            sum=sum+allnumber[i];
        }
        mean = sum/number;
        System.out.println("Mean of number "+number +" is "+mean);
        reader.close();
    }
}

