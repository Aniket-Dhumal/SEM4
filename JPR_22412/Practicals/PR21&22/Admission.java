class AdmissionCounter extends Thread
{
	public int available_seats = 10;
	synchronized void bookAdmission(String name, int number_of_Admission)
	{
		if(available_seats >= number_of_Admission && number_of_Admission > 0)
		{
			available_seats = available_seats - number_of_Admission;
			System.out.println("Hello " + name + "  seats are available : " + number_of_Admission);
		}
		else
		{
			System.out.println("Admission is closed because seats are not available.");
		}
	}
}
class Admission
{
	public static void main(String[] args)
	{
		AdmissionCounter a = new AdmissionCounter();
		a.bookAdmission("Aniket", 1);
	}
}