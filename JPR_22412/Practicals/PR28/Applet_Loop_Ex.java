import java.awt.*;
import java.applet.*;
public class Applet_Loop_Ex extends Applet
{
	public void paint(Graphics g)
	{
		for(int i=0; i<=4; i++)
		{
			if((i%2)==0)
				g.drawOval(120, i*60+10, 50, 50);
			else
				g.fillOval(120, 1*60+10, 50, 50);
		}
	}
}
/*
<html>
<head>
</head>
<body>
<applet code = "Applet_Loop_Ex.class" width = "540" height = "360"></applet>
</body>
</html>
*/