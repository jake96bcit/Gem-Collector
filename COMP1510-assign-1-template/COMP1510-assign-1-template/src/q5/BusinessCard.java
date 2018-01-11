package q5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class BusinessCard extends JFrame {
    /**
     * <p>The x position of the text.</p>
     */
    private static final int X_POSITION = 20;

    /**
     * <p>The y position of the text.</p>
     */
    private static final int Y_POSITION = 20;

    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public BusinessCard() {
        super("INSERT YOUR NAME HERE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new BusinessCardPanel());
        setSize(350, 220); // you can change this size but don't make it HUGE!
        setVisible(true);
    }

    /**
     * <p>A panel that acts as the Frame's content pane.</p>
     */
    class BusinessCardPanel extends JPanel {

        /**
         * <p>An image object that can be used to paint to the panel.</p>
         */
        Image img = null;

        /**
         * <p>The default contructor that retreives an image to draw.</p>
         */
        public BusinessCardPanel() {
            // NOTE: IF YOU ADD AN IMAGE YOU NEED TO LEAVE 'q5' IN THE STRING!
            img = new ImageIcon(BusinessCardPanel.class.getResource(
                "/q5/running-robot.gif")).getImage();
        }

        /**
         * <p>Called by the environment when the frame needs to be updated.</p>
         *
         * @param g the graphics context with which we paint into.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(new Color(60, 255, 140));
            g.setColor(new Color(140, 50, 200));
            g.drawString("Something interesting ...", X_POSITION, Y_POSITION);
            g.drawRect(50, 50, 40, 80);
            g.drawImage(img, 200, 0, this);
        }
    }

    /**
     * <p>The main method.</p>
     */
    public static void main(String[] args) {
        new BusinessCard();
    }

};
