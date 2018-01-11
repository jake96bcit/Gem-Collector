package Telephone;

import java.awt.*;
import javax.swing.*;

/**
 * Telephone Panel.
 * 
 * @author Jake
 * @version 1.0
 */
@SuppressWarnings("serial")
public class TelephonePanel extends JPanel {
    /**
     * Draw telephone.
     */
    public TelephonePanel() {

        /**
         * Set BorderLayout for this panel.
         */
        JPanel titlePanel = new JPanel();
        setLayout(new BorderLayout());

        /**
         * Create a JLabel with "Your Telephone" title.
         */
        JLabel titleLabel = new JLabel("Jake's Telephone");

        /**
         * Add title label to north of this panel.
         */
        titlePanel.add(titleLabel);
        add(titlePanel, BorderLayout.NORTH);

        /**
         * Create panel to hold keypad and give it a 4x3 GridLayout.
         */
        JPanel keypad = new JPanel();
        keypad.setLayout(new GridLayout(4, 3));

        /**
         * Add buttons representing keys to key panel.
         */
        keypad.add(new Button("1"));
        keypad.add(new Button("2"));
        keypad.add(new Button("3"));
        keypad.add(new Button("4"));
        keypad.add(new Button("5"));
        keypad.add(new Button("6"));
        keypad.add(new Button("7"));
        keypad.add(new Button("8"));
        keypad.add(new Button("9"));
        keypad.add(new Button("*"));
        keypad.add(new Button("0"));
        keypad.add(new Button("#"));

        /**
         * Add key panel to center of this panel
         */
        add(keypad, BorderLayout.CENTER);
    }
}