import java.applet.Applet;  
import java.awt.Graphics;  
public class Applet_Example extends Applet
{  
	public void paint(Graphics g)
	{  
		g.drawString("Welcome to the World of Applet",150,150);  
	}  
}  
/* 
<html>  
<body>  
<applet code="Applet_Example.class" width="300" height="300">  
</applet>  
</body>  
</html> 
*/  