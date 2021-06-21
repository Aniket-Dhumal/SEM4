import java.util.*;
public class WrapperClassMethod
{
	public static void main(String[] args)
	{
		int a = 17;
        Integer x = new Integer(a); 
		System.out.println("Value of x is :" + x);
		System.out.println("toString(a) = " + Integer.toString(a)); //toString
		System.out.println("valueOf(a) = " + x); //valueOf
		System.out.println("parseInt(a) = " + x); //parseInt
		byte b = x.byteValue(); //byteValue
		System.out.println("byte b = " + b); 
		double d = x.doubleValue(); //doubleValue
		System.out.println("double d = " + d);	
		float f = x.floatValue(); //floatValue
		System.out.println("float f = " + f);
		int i = x.intValue(); //intValue
		System.out.println("int i = " + i);
		short s = x.shortValue(); //shortValue
		System.out.println("short s = " + i);
		long l = x.longValue(); //longValue
		System.out.println("long l = " + l);
		Integer y = new Integer(17);
		System.out.println("Value of y is :" + y);
		Integer z = new Integer(24);
		System.out.println("Value of z is :" + z);
		System.out.println("y compareTo with z : "+ y.compareTo(z)); //compareTo
		System.out.println("y compareTo with x : "+ y.compareTo(x)); //compareTo
		Integer t = new Integer(6);
		System.out.println("Value of t is :" + t);
		Integer c = new Integer(3);
		System.out.println("Value of c is :" + c);
		Integer m = new Integer(6);
		System.out.println("Value of m is :" + m);
		System.out.println("t compare with c : "+ t.compareTo(c)); //compare
		System.out.println("t compareTo with m : "+ t.compareTo(m)); //compare
		System.out.println("Comparing using equals t and c: " + t.equals(c)); //equals
		System.out.println("Comparing using equals t and m: " + t.equals(m)); //equals
	}
}