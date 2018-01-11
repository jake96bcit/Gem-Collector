import javax.swing.JApplet;
import java.awt.*;

public class Colors extends JApplet {
 public void paint (Graphics page) {
   final int PAGE_WIDTH = 600;
   final int PAGE_HEIGHT = 400;
   
   int x, y;
   int width, height;
   
   Color myColor = new Color (200,100,255);
   
   setBackground (Color.white);
   page.setColor (Color.white);
   page.fillRect (0, 0, PAGE_WIDTH, PAGE_HEIGHT);
   
   page.setColor (myColor);
   
   x = 200;
   y = 125;
   width = 200;
   height = 150;
   
   page.fillRect (x, y, width, height);
   
   
   page.setColor (Color.red);
   page.fillRect (40, 40, 80, 30);
   
   
   page.setColor (Color.blue);
   page.fillRect (40, 70, 80, 30);
   
   
   page.setColor (Color.green);
   page.fillRect (40, 100, 80, 30);
   
   page.setColor (Color.black);
   int redCode = myColor.getRed();
   page.drawString ("Red: " + redCode, 50, 55);
   int greenCode = myColor.getGreen();
   page.drawString ("Green: " + greenCode, 50,115);
   int blueCode = myColor.getBlue();
   page.drawString ("Blue: " + blueCode, 50, 85);
 }
}