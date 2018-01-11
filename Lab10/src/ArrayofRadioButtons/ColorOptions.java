package ArrayofRadioButtons;

import javax.swing.JFrame;

/**
 * ColorOptions 
 * @author Jake
 * @version 1.0
 */
public class ColorOptions {
    public static void main(String[] args) {
        JFrame colorFrame = new JFrame("Color Optrions");
        colorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ColorOptionsPanel panel = new ColorOptionsPanel();
        colorFrame.getContentPane().add(panel);
        colorFrame.pack();
        colorFrame.setVisible(true);
    }
}
