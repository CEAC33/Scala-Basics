

// import Reflector

public class Person1DemoJ
{
    public static void main(String[] args)
    {
        Reflector.reflect(Person1.class);

        Person1     person      = new Person1();

        // Scala bean style:    accessor / mutator
        person.age_$eq(     person.age()    + 1     );

        // Java  bean style:    getter   / setter   (@BeanProperty needed)
        person.setAge (     person.getAge() + 1     );
    }
}