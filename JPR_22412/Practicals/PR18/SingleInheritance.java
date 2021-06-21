class Person
{
	String name = "Aniket";
	public void show()
	{
		System.out.println("My name is :");
	}
}
class Student extends Person
{
	String course = "Java Programming";
	public void show1()
	{
		System.out.println("I Love to learn :");
	}
}
public class SingleInheritance
{
	public static void main(String args[])
	{
		Student obj = new Student();
		obj.show();
		System.out.println(obj.name);
		obj.show1();
		System.out.println(obj.course);
	}
}