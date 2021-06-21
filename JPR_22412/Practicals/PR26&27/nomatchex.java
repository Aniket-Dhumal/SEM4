public class nomatchexception 
{
    String s;
    nomatchexception(String s) 
	{
        this.s = s;
        if (s.equals("India")) 
		{
            System.out.println("Matched!\n");
        } else 
		{
            throw new NoMatchException("Not Matched!\n");
        }
    }
}
class nomatchex 
{
    public static void main(String[] args) 
	{
        nomatchexception v = new nomatchexception("America");
    }
}