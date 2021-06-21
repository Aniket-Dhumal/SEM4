import java.awt.*;
import java.applet.*;
public class Squar_Circle extends Applet
{
	public void paint(Graphics g)
	{	
		/*Squar Inside A Circle*/
			g.drawString("(a).Squar Inside A Circle",150,110);
			g.drawOval(180,10,80,80);
			g.drawRect(192,22,55,55);
		/*Circle Inside a Squar*/
			g.drawString("(b).Circle Inside a Squar",290,110);
			g.drawRect(290,10,80,80);
			g.drawOval(290,10,80,80);
	}
}
/* 
<applet code="Squar_Circle" width=200 height=200>
</applet>
*/