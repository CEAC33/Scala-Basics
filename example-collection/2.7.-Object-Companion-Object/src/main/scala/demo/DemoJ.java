package demo;

public class DemoJ
{
    public int              f()     {   return 0;   }
    public final    int     k   =   0;

    //public static   int     f()     {   return 0;   }
    //public static final int k   =   0;
}

class DemoJTest
{
    public static void main(String[] args)
    {
        System.out.println(     new DemoJ().k       );
        System.out.println(     new DemoJ().f()     );
    }
}