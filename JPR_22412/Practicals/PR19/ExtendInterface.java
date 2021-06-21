interface NewShape
{
	void draw();
}
interface Circle extends NewShape
{
	void getRadius();
	int radius = 10;
}
class NewCircle implements Circle
{
	public void draw()
	{
		System.out.println("Draw a circle of radious 10cm.");
	}
	public void getRadius()
	{
		System.out.println(radius);
	}
}
class ExtendInterface extends NewCircle
{
	public static void main(String agrs[])
	{
		Circle nc = new NewCircle();
		nc.getRadius();
	}
}
