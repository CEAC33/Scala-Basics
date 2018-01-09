

// import Reflector;

public class Person0DemoJ
{
    public static void main(String[] args)
    {
        Reflector.reflect(Person0.class);

        Person0 person = new Person0();

        //Java bean style: getter / setter
        person.setAge(  person.getAge() + 1 );
    }
}