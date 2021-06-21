import java.awt.*;
import java.applet.*;
public class Applet_All_Methods extends Applet
{
	public void init()
	{
		System.out.println("Applet is Initialized");
	}
	public void start()
	{
		System.out.println("Applet is being Excecuted");
	}
	public void stop()
	{
		System.out.println("Applet executed has stopped");
	}
	public void paint(Graphics g)
	{
		System.out.println("Painting the applet");
	}
	public void destroy()
	{
		System.out.println("Applet has been destroyed");
	}
}
/*
<html>
<head>
</head>
<body>
<applet code = "Applet_All_Methods.class" width = "540" height = "360"></applet>
</body>
</html>
*/