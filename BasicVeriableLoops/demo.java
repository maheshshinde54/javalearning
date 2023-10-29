package BasicVeriableLoops;

import java.util.Scanner;

public class demo 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        int mean,sum=0;
        System.out.println("Enter how many to number to calculate avarage : ");
        int number = reader.nextInt();
        int[] allnumber = new int[number];
        for(int i : allnumber)
        {
            allnumber[i]=reader.nextInt();
        }
        for(int i : allnumber)
        {
            sum=sum+allnumber[i];
        }
        mean = sum/number;
        System.out.printf("Mean of number : %1d ",mean);
        reader.close();
    }
}
