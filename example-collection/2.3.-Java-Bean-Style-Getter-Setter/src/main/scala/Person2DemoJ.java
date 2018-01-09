

// import Reflector

public class Person2DemoJ
{
    public static void main(String[] args)
    {
        Reflector.reflect(Person2.class);

        Person2     person      = new Person2(0);

        // Scala bean style:    accessor / mutator
        person.age_$eq(     person.age()    + 1     );

        // Java  bean style:    getter   / setter   (@BeanProperty needed)
        person.setAge (     person.getAge() + 1     );
    }
}