

//import

public class    Person2DemoJ
{
    public static void main(String[] args)
    {
        Reflector.reflect(Person2.class);

        Person2 person1  = new Person2();
        // accessor ==  getter
        int     age     = person.age();
        // mutator  ==  setter
        person1.age_$eq(45);
    }
}