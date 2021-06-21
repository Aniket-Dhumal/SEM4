class MyOwnException extends Exception 
{
    public MyOwnException(String msg) 
	{
        super (msg);
    }
}
class ThrowException2
{
    static void employeeAge (int age) throws MyOwnException
    {
        if(age<18)
            throw new MyOwnException("Not eligible for voting");
        else
            System.out.println("Eligible for voting");
    }
    public static void main (String[] args)
    {
        try
        {
            employeeAge(19);
        }
        catch (MyOwnException e)
        {
            System.out.println(e);
        }
    }
}