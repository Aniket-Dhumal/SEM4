class bank
{
	int getroi() 
	{ 
		return 0; 
	}
}
class SBI extends bank
{
	int getroi() 
	{ 
		return 8; 
	}
}
class ICICI extends bank
{
	int getroi() 
	{ 
		return 7; 
	}
}
class AXIS extends bank
{
	int getroi() 
	{ 
		return 9; 
	}
}
class RateInterest
{
	public static void main(String args[])
	{
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println("SBI rate of interest: "+s.getroi());
		System.out.println("ICICI rate of interest: "+i.getroi());
		System.out.println("AXIS rate of interest: "+a.getroi());
	}
}
