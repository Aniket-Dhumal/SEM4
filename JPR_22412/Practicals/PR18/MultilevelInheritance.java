class Student
{
	public void Info1()
	{
		System.out.println("JAVA Students");
	}
}
class Course extends Student
{
	public void Info2()
	{
		System.out.println("Students are learning java programming.");
	}
}
class Teacher extends Course
{
	public void Info3()
	{
		System.out.println("Teacher Teaching Java.");
	}
}
class MultilevelInheritance
{
	public static void main(String args[])
	{
		Teacher t = new Teacher();
		t.Info1();
		t.Info2();
		t.Info3();
	}
}