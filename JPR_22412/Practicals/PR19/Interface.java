public interface FamousLine
{
	void ShowLine()
	{
		System.out.println("Show Line");
	}
}
class Interface implements FamousLine
{
	public static void main(String agrs[])
	{
		Interface i = new Interface();
		i.ShowLine();
	}
}