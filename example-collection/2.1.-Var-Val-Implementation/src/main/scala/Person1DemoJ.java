

//import Reflector

public class    Person1DemoJ
                extends Object
{
    public static void main(String[] args)
    {
        Reflector.reflect(Person1.class);

        Person1 person  = new Person1();
        // accessor == getter
        int     age     = person.age();
    }
}