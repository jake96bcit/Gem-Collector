package ArrayofRadioButtons;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ColorOPtionPanel
 * 
 * @author Jake
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ColorOptionsPanel extends JPanel {
    private final int WIDTH = 300;
    private final int HEIGHT = 200;
    private final int LABEL_FONT_SIZE = 20;
    private final int RADIO_FONT_SIZE = 15;
    private final int NUM_COLORS = 5;
    private Color[] color = new Color[NUM_COLORS];
    private JRadioButton[] option = new JRadioButton[NUM_COLORS];
    private JLabel heading;
    private ButtonGroup list = new ButtonGroup();

    public ColorOptionsPanel() {
        heading = new JLabel("Choose the background color!");
        heading.setFont(new Font("Helvetica", Font.BOLD, LABEL_FONT_SIZE));
        color[0] = Color.yellow;
        color[1] = Color.cyan;
        color[2] = Color.red;
        color[3] = Color.green;
        color[4] = Color.magenta;
        add(heading);
        setBackground(Color.white);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        for (int n = 0; n < option.length; n++) {
            String radioName = "";
            switch (n) {
            case 0:
                radioName = "Yellow";
                break;
            case 1:
                radioName = "Cyan";
                break;
            case 2:
                radioName = "Red";
                break;
            case 3:
                radioName = "Green";
                break;
            case 4:
                radioName = "Magenta";
                break;
            default:
                radioName = "White";
                break;
            }
            option[n] = new JRadioButton(radioName);
            option[n].setFont(new Font("Helvetica", Font.BOLD, RADIO_FONT_SIZE));
            option[n].setBackground(color[n]);
            option[n].addActionListener(new ColorListener());
            list.add(option[n]);
            add(option[n]);
        }
    }

    private class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            for (int n = 0; n < option.length; n++) {
                if (option[n].isSelected()) {
                    setBackground(color[n]);
                }
            }
        }
    }

}
