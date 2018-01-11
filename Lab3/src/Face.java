import javax.swing.JApplet;
import java.awt.*;

public class Face extends JApplet {
  public void paint (Graphics page) {
    final int MAX_SIZE = 300;
    final int PAGE_WIDTH = 600;
    final int PAGE_HEIGHT = 400;
    
    int x, y;
    int width, height;
    
    setBackground (Color.yellow);
    page.setColor (Color.decode("#eebb99"));
    
    x = 30;
    y = 10;
    width = 100;
    height = 130;
    
    page.fillOval(x, y, width, height);
    
    page.setColor(Color.black);
    page.drawLine(50,30,70,30);
    page.drawLine(80,30,100,30);
    
    page.setColor(Color.decode("#eebb99"));
    page.fillOval(20,50,20,40);
    page.fillOval(120,50,20,40);
    
    page.setColor (Color.black);
    page.fillOval(55,40,10,10);
    page.fillOval(85,40,10,10);
    
    page.setColor(Color.black);
    page.drawArc(45,100,70,30,200,120);
    
    page.setColor(Color.black);
    page.fillOval(65,70,10,40);
    }

    
}

