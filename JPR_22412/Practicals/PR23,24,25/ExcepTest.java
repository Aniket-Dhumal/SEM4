public class ExcepTest 
{
    public static void main(String[] args)
    {
        int a[] = new int[12];
        try
		{
            System.out.println("Access elements three :"+a[3]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception thrown"+e);
        }
        finally
        {
            System.out.println("First elements value:"+a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
