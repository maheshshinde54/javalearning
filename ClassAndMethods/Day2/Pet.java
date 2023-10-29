package ClassAndMethods.Day2;
class Animal
{
    public void makesound()
    {
        System.out.println("All Animal makes sound");

    }
}
class Dog extends Animal
{
    @Override
    public void makesound()
    {
        System.out.println("The dog barks ");
    }
    public void makesounds()
    {
        super.makesound();
    }
}
public class Pet extends Dog
{
    public static void main(String [] agrs )
    {
        Dog c = new Dog();
        c.makesound();
        c.makesounds();
    }
}