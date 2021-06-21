import java.util.*;
public class IntegertoBSD
{
	public static void main(String[] args)
	{
		int a = 24;
        Integer x = new Integer(a); 
		System.out.println("Value of x is :" + x);
		byte b = x.byteValue(); //byteValue
		System.out.println("byte b = " + b);
		short s = x.shortValue(); //shortValue
		System.out.println("short s = " + s);
		double d = x.doubleValue(); //doubleValue
		System.out.println("double d = " + d);			
	}
}