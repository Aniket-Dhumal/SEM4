class A
{
    public void disA()
    {
        System.out.println("ClassA");
    }
}

class B extends A
{
    public void disB()
    {
        System.out.println("ClassB");
    }
}

class C extends B
{
    public void disC()
    {
        System.out.println("ClassC");
    }
}

public class Multilevel extends C
{
    public static void main(String args[])
    {
        C c = new C();
        c.disA();
        c.disB();
        c.disC();
    }
}