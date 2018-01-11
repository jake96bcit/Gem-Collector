package q5;
import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;
/**
 * This program is drawing a business card.
 * @author Vinh Le
 * @version 1.0
 */
@SuppressWarnings("serial")
public class BusinessCard extends JApplet {
  
  /**
   * The X location constant.
   */
  static final int X = 50;
  
  /**
   * The Y location of Name.
   */
  static final int Y1 = 40;
  
  /**
   * The Y location of company name.
   */
  static final int Y2 = 60;
  
  /**
   * The Y location of company address.
   */
  static final int Y3 = 80;
  
  /**
   * The Y location of phone number.
   */
  static final int Y4 = 100;
  
  /**
   * The Y location of email.
   */
  static final int Y5 = 120;
  
  /**
   * The height of card.
   */
  static final int HEIGHT = 120;
  
  /**
   * The width of card.
   */
  static final int WIDTH = 400;
  
  /**
   * The X location of card.
   */
  static final int X0 = 20;
  
  /**
   * The Y location of card.
   */
  static final int Y0 = 20;
  
  /**
   * The main application.
   * @param page Creating a graphic page.
   */
  public void paint(Graphics page) {
      setBackground(Color.black);
      page.setColor(Color.black);
      
      page.drawRect(X0, Y0, WIDTH, HEIGHT);
      page.drawString("Full name: Vinh Xuan Le", X, Y1);
      page.drawString("Company name: EA Canada", X, Y2);
      page.drawString("Address: 4330 Sanderson Way, Burnaby, BC "
                      + "V5G 4X1", X, Y3);
      page.drawString("Phone number: 778 707 2016", X, Y4);
      page.drawString("Email: lexuanvinhvn@gmail.com", X, Y5);
  }
}
