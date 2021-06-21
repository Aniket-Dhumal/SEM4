import java.applet.*;
import java.awt.*;
public class Cone extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(80,280,320,100);
		g.drawLine(240,50,82,320);
		g.drawLine(240,50,398,320);
		g.drawLine(240,330,398,330);
		g.drawLine(240,50,240,330);
		g.drawString("Radius",260,360);
		g.drawString("Height",246,255);
		g.drawString("Slant Height",340,210);
		g.drawString("Cone",220,420);
	}
}
/*
<applet code="Cone.class" height=500 width=700>
</applet>
*/