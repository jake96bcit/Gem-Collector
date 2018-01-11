package q4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Traffic Light. Drawing the traffic light and make it works by using loops.
 *
 * @author Vinh Le
 * @version 1.0
 */
@SuppressWarnings("serial")
public class TrafficLightPanel extends JPanel {

    /**
     * Declare the color when red light turn on.
     */
    public static final Color LIGHT_RED = Color.RED;

    /**
     * Declare the color when red light turn off.
     */
    public static final Color DARK_RED = new Color(128, 0, 0);

    /**
     * Declare the color when amber light turn on.
     */
    public static final Color LIGHT_AMBER = Color.YELLOW;

    /**
     * Declare the color when amber light turn off.
     */
    public static final Color DARK_AMBER = new Color(128, 128, 0);

    /**
     * Declare the color when green light turn on.
     */
    public static final Color LIGHT_GREEN = Color.GREEN;

    /**
     * Declare the color when green light turn off.
     */
    public static final Color DARK_GREEN = new Color(0, 128, 0);

    /**
     * Declare the value make green light turn on.
     */
    public static final int GREEN_LIGHT = 0;

    /**
     * Declare the value make amber light turn on.
     */
    public static final int AMBER_LIGHT = 1;

    /**
     * Declare the value make red light turn on.
     */
    public static final int RED_LIGHT = 2;

    /**
     * Constant position x of the three light.
     */
    static final int X = 30;

    /**
     * Constant position y of the green light.
     */
    static final int Y1 = 50;

    /**
     * Constant position y of the amber light.
     */
    static final int Y2 = 160;

    /**
     * Constant position y of the red light.
     */
    static final int Y3 = 270;

    /**
     * Constant lights height.
     */
    static final int HEIGHT = 90;

    /**
     * Constant lights width.
     */
    static final int WIDTH = 90;

    /**
     * Constant panel width.
     */
    static final int PANEL_WIDTH = 150;

    /**
     * Constant panel height.
     */
    static final int PANEL_HEIGHT = 390;

    /**
     * Constatn of traffic box width.
     */
    static final int OHF = 150;

    /**
     * Constatn of traffic box height.
     */
    static final int THF = 340;

    /**
     * Constant of heximal color code.
     */
    static final int THFF = 255;

    /**
     * Constant of traffic light width.
     */
    static final int OHT = 130;

    /**
     * Constant of traffic light height.
     */
    static final int THN = 290;

    /**
     * Constant maximum amount of lights status.
     */
    static final int T = 3;
    /**
     * Declare button.
     */
    private JButton button;


    /**
     * Declare the status of the lights.
     */
    private int status;

    static final int INNER_PANEL_WIDTH = 150;
    static final int INNER_PANEL_HEIGHT = 390;

    /**
     * Draw the traffic light panel.
     */
    public TrafficLightPanel() {

        button = new JButton("Change");

        button.addActionListener(new ChangeButtonListener());
        add(button);

        add(new DrawingPanel());

        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));

        setVisible(true);

        status = -1;

    }

    /**
     * Create a method to change the lights when click ont he button.
     * 
     * @author Jake
     *
     */
    private class ChangeButtonListener implements ActionListener {

        /**
         * Updates the counter and label when Vote for Joe button is pushed.
         * 
         * @param event
         *            Joe's event
         */
        public void actionPerformed(ActionEvent event) {
            status = status + 1;
            repaint();
        }
    }

    public class DrawingPanel extends JPanel {
        
        public DrawingPanel() {
            setBackground(Color.WHITE);
            setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));

            setVisible(true);
        }

        /**
         * Create the condition of the traffic lights.
         * 
         * @param g
         *            Graphic
         * @param lightToTurnOn
         *            Status of the light when it turn on.
         */
        public void paintLight(Graphics g, int lightToTurnOn) {
            Color greenColor = DARK_GREEN;
            Color amberColor = DARK_AMBER;
            Color redColor = DARK_RED;

            if (lightToTurnOn == GREEN_LIGHT) {
                greenColor = LIGHT_GREEN;
            } else if (lightToTurnOn == AMBER_LIGHT) {
                amberColor = LIGHT_AMBER;
            } else if (lightToTurnOn == RED_LIGHT) {
                redColor = LIGHT_RED;
        }

        doPaintLight(g, greenColor, amberColor, redColor);
    }

    /**
     * Drawing the traffic lights.
     * 
     * @param g
     *            Graphic
     * @param green
     *            Color green
     * @param amber
     *            Color amber
     * @param red
     *            Color red
     */
    public void doPaintLight(Graphics g, Color green, Color amber, Color red) {

        g.setColor(green);
        g.fillOval(X, Y1, HEIGHT, WIDTH);
        g.setColor(Color.BLACK);
        g.drawOval(X, Y1, HEIGHT, WIDTH);

        g.setColor(amber);
        g.fillOval(X, Y2, HEIGHT, WIDTH);
        g.setColor(Color.BLACK);
        g.drawOval(X, Y2, HEIGHT, WIDTH);

        g.setColor(red);
        g.fillOval(X, Y3, HEIGHT, WIDTH);
        g.setColor(Color.BLACK);
        g.drawOval(X, Y3, HEIGHT, WIDTH);
    }

    /**
     * Setting the loop for the lights change.
     * 
     * @param g
     */
        public void paintComponent(Graphics g) {
            if (status == -1) {
               paintLight(g, -1);
            } else {
                int lightToTurnOn = status % T;
                paintLight(g, lightToTurnOn);
            }
        }
    }
}