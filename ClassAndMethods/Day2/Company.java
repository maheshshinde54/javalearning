package ClassAndMethods.Day2;
class Employee
{
    int id;
    String name,division,role;
    double Salary;
    Employee()
    {
        System.out.println("in Employee constructor");
    }
    public void employeeDetails(int id)
    {
        System.out.println("Employee : " + id + name);
        System.out.println("Role : "+role);
    }
}

class Manager extends Employee
{

    Manager()
    {
        System.out.println("in Manager constructor");
    }
    public void employeeDetails(int id)
    {
        System.out.println("Employee : " + id);
        System.out.println("Role : Manager");
    }
}

public class Company extends Manager
{
    public static void main(String agrs [])
    {
        Company E1 = new Company();
        E1.employeeDetails(1);
    }


}
