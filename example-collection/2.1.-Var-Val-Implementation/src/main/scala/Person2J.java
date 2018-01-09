

public class Person2J
{
    private int     age         =   1;

    public                  Person2J()
    {
        /* EMPTY */
    }

    // accessor
    public  int     age     ()
    {
        return this.age;
    }

    // mutator, '$' special Scala compiler character
    public  voic    age_$eq (int age)
    {
        this.age                =   age
    }
}