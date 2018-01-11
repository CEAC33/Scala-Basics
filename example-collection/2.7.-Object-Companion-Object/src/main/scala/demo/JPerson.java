package demo;

import static  demo.JPerson.JPerson;

public class JPerson
{
    public final int    age;
    public final String name;

    public JPerson                  (String name, int age)
    {
        this.name   = name;
        this.age    = age;
    }

    public static JPerson JPerson   (String name, int age)
    {
        return new JPerson(name, age);
    }
}

class JDemo
{
    public static void main(String[] args)
    {
        JPerson person0 = new JPerson       ("Mike", 45);
        JPerson person1 = JPerson.JPerson   ("Mike", 45);
        JPerson person2 = JPerson           ("Mike", 45);
    }
}