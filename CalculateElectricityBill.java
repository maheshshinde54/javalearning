import java.util.Scanner;
public class CalculateElectricityBill 
{
    public static void main(String[] args) 
    {
        
    
    /*a consumer consumes 500 watts per hour daily for one month.  Calculate the total energy bill of that consumer if per unit rate is 7.
        1 Unit = 1kWh
        So total kWh = 500 watts x 24 hours x 30 days= 360000
        So, we want to convert into units: Where 1 unit = 1kWh
        Total consumed units are as 360000/1000 = 360
        
    */
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter consumer per hour electicity comsumption in watts : ");
        int dailywatt = reader.nextInt();
        int totalwatt = dailywatt*24*30;
        int Kwatt = totalwatt/1000;
        double bill = 10;
        if(Kwatt<100)
        {
            bill=Kwatt*12;
        }
        else if( Kwatt<300)
        {
            bill=100*12+(Kwatt-100)*15;
        }
        else if( Kwatt > 300)
        {
            bill=100*12+200*15+ (Kwatt-300)*20;
        }
        System.out.println("Electricity Bill for the month : "+bill);
        reader.close();
    }
}