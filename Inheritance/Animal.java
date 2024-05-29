//This is example of single level inheritance 
public class Animal 
{
    protected String name;
    public Animal(String name)
    {
        this.name = name;
    }
    public void eat()
    {
        System.out.println("Eating");
    }
    public void sleep()
    {
        System.out.println("Sleeping");
    }
}
