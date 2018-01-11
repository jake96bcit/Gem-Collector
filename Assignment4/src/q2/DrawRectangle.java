package q2;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>
 * DrawRectangle.java is a program that allow users to draw a rectangle. By
 * clicking and dragging the mouse to create the rectangle at the size that they
 * want.
 * </p>
 * 
 * @author Vinh Le
 * @version 1.0
 * 
 */
@SuppressWarnings("serial")
public class DrawRectangle extends JFrame {

    /**
     * Width of the drawing window.
     */
    static final int WIDTH = 400;

    /**
     * Height of the drawing window.
     */
    static final int HEIGHT = 400;

    /**
     * Creating the draw window.
     */
    public DrawRectangle() {
        super("Vinh Le");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new DrawRectanglePanel());
        setSize(WIDTH, HEIGHT);
        setVisible(true);
    }

    /**
     * <p>
     * Creating and setting up the draw funtions.
     * </p>
     */
    private class DrawRectanglePanel extends JPanel 
        implements MouseListener, MouseMotionListener {

        /**
         * <p>
         * Constant to mark the x, y point before users press.
         * </p>
         */
        static final int INITIAL = -1;

        /**
         * x1.
         */
        private int x1;

        /**
         * y1.
         */
        private int y1;

        /**
         * Width.
         */
        private int width;

        /**
         * Height.
         */
        private int height;

        /**
         * Start X.
         */
        private int startX;

        /**
         * Start Y.
         */
        private int startY;

        /**
         * Drawing panel.
         */
        DrawRectanglePanel() {
            x1 = INITIAL;
            width = 0;
            y1 = INITIAL;
            height = 0;
            startX = INITIAL;
            startY = INITIAL;
            addMouseListener(this);
            addMouseMotionListener(this);
        }

        /**
         * Setting up the clicked point to be the corner
         * and draw the rectangle. 
         * @param g graphics
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (startX != INITIAL && startY != INITIAL) {
                g.drawRect(startX, startY, width, height);
            }
        }

        /**
         * Get x and y at the click point.
         * @param e event
         */
        public void mousePressed(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();
        }

        /**
         * Setting up the function when the users
         * release the mouse.
         * @param e event
         */
        public void mouseReleased(MouseEvent e) {
            int newX = e.getX();
            int newY = e.getY();

            if (newX > x1) {
                startX = x1;
                width = newX - x1;
            } else {
                startX = newX;
                width = x1 - newX;
            }
            if (newY > y1) {
                startY = y1;
                height = newY - y1;
            } else {
                startY = newY;
                height = y1 - newY;
            }
            repaint();
        }

        /**
         * Setting up the function when the users
         * dragging the mouse.
         * @param e event
         */
        public void mouseDragged(MouseEvent e) {
            int newX = e.getX();
            int newY = e.getY();

            if (newX > x1) {
                startX = x1;
                width = newX - x1;
            } else {
                startX = newX;
                width = x1 - newX;
            }
            if (newY > y1) {
                startY = y1;
                height = newY - y1;
            } else {
                startY = newY;
                height = y1 - newY;
            }
            repaint();
        }

        /**
         * Mouse entered event.
         * @param e event
         */
        public void mouseEntered(MouseEvent e) {
        }

        /**
         * Mouse exited event.
         * @param e event
         */
        public void mouseExited(MouseEvent e) {
        }

        /**
         * Mouse clicked event.
         * @param e event
         */
        public void mouseClicked(MouseEvent e) {
        }

        /**
         * Mouse moved event.
         * @param e event
         */
        public void mouseMoved(MouseEvent e) {
        }

    }

    /**
     * <p>Main method that use to display rectangle drawing panel.</p>
     * @param args program arguments
     * 
     */
    public static void main(String[] args) {
        new DrawRectangle();
    }

};
