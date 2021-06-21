interface Pet
{
	public void test();
}
class Dog1 implements Pet
{
	public void test()
	{
		System.out.println("Interface Method Implemented");
	}
	public static void main(String args[])
	{
		Pet p = new Dog1();
		p.test();
	}
}