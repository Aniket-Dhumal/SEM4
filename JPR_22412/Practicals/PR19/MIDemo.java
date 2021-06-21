interface A
{
	void Student();
	String ns = "Dhumal Aniket Harishchandra"; 
}
interface B
{
	void Class();
	String nc = "Java Programming";
}
interface C 
{
	void Teacher();
	String nt = "Alinka Shinde";
}
class MIDemo implements A, B, C
{
	public void Student()
	{
		System.out.println("Student name is : " + ns);
	}
	public void Class()
	{
		System.out.println("Class name is : " + nc);
	}
	public void Teacher()
	{
		System.out.println("Teacher name is : " + nt);
	}
	public static void main(String[] agrs)
	{
		E Info = new E();
		Info.Student();
		Info.Class();
		Info.Teacher();
	}
}