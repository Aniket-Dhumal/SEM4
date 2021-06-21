class Furniture
{
	void color()
	{
		System.out.println("Furniture Color...");
	}
}
class Chair extends Furniture
{
	void color()
	{
		System.out.println("Chair Color...");
	}
	void heigth()
	{
		System.out.println("5ft..");
	}
	void work()
	{
		super.color();
		heigth();
	}
}
class SuperSub
{
	public static void main(String[] args)
	{
		Chair obj = new Chair();
		obj.work();
		obj.color();
	}
}