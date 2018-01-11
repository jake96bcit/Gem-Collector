package Telephone;

import javax.swing.*;

/**
 * Telephone.
 * @author Jake
 * @version 1.0
 */
public class Telephone {
    
    /**
     * Main method.
     * @param args
     * program arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Telephone");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TelephonePanel());
        frame.pack();
        frame.setVisible(true);
    }
}
