interface Circle
{
	void CircleArea();
}
interface Rectangle
{
	void RectangleArea();
}
class Area implements Circle, Rectangle
{
	public void CircleArea()
	{
		int r = 17;
		double pi = 3.14, area;
		area = pi * r* r;
		System.out.println("Radius is : " + r);
		System.out.println("Area of circle is : " + area);
	}
	public void RectangleArea()
	{
		int l = 17, b = 24;
		double area;
		area = l * b;
		System.out.println("Length is : " + l);
		System.out.println("Breadth is : " + b);
		System.out.println("Area of rectangle is : " + area);
	}
	public static void main(String args[])
	{
		Area a = new Area();
		a.CircleArea();
		a.RectangleArea();
	}
}