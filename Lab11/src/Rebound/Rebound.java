package Rebound;

import javax.swing.JFrame;

/**
 * Rebound
 * 
 * @author Jake
 * @version 1.0
 */
public class Rebound {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rebound");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new ReboundPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
