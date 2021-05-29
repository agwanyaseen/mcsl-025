import java.applet.*;
import java.awt.*;

 
public class CircleInsideTriangle extends Applet {
 
 public void paint(Graphics g) {
  
  // Draws a triangle 
  int xPoints[] = {120, 220, 30};
  int yPoints[] = {30, 220, 220};
  
  g.setColor(Color.YELLOW);
  g.fillPolygon(xPoints, yPoints, 3);
  
  // Draws a circle
  g.setColor(Color.BLUE);
  g.fillOval(90, 120, 70, 70);
  
 }
}
 
/* <applet code="CircleInsideTriangle.class" width=250 height=250>
   </applet>
*/