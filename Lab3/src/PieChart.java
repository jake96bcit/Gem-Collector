import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.*;

public class PieChart extends JApplet {

    public void paint (Graphics page) {
        int x, y;
        int width;
        int height;
        
        x= 60;
        y= 30;
        width= 200;
        height= 200;
               
        page.drawOval(x,y,width,height);
        
        page.setColor (Color.blue);
        page.fillArc(x,y,width,height,0,126);
        
        page.setColor (Color.pink);
        page.fillArc(x,y,width,height,126,54);
        
        page.setColor (Color.red);
        page.fillArc(x,y,width,height,180,54);
        
        page.setColor (Color.yellow);
        page.fillArc(x,y,width,height,234,90);
        
        page.setColor (Color.green);
        page.fillArc(x,y,width,height,324,36);
        
        page.setColor (Color.black);
        page.drawString("Rent and Utilities",175,20);
        page.drawLine(175,20,160,35);
        
        page.setColor (Color.black);
        page.drawString("Transportation",30,20);
        page.drawLine(30,20,100,70);
        
        page.setColor (Color.black);
        page.drawString("Food",10,150);
        page.drawLine(50,150,70,160);
        
        page.setColor (Color.black);
        page.drawString("Education",135,280);
        page.drawLine(135,280,135,200);
        
        page.setColor (Color.black);
        page.drawString("Miscellaneous",280,200);
        page.drawLine(280,200,230,165);
        
    }

}
