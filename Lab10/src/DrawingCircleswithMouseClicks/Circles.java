package DrawingCircleswithMouseClicks;

import javax.swing.JFrame;

/**
 * Circles
 * @author Jake
 * @version 1.0
 */
public class Circles {
    public static void main(String[] args) {
        JFrame circlesFrame = new JFrame("Circles");
        circlesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        circlesFrame.getContentPane().add(new CirclePanel());
        circlesFrame.pack();
        circlesFrame.setVisible(true);
    }
}
