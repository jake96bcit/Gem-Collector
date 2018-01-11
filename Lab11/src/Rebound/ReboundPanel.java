package Rebound;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * ReboundPanel
 * 
 * @author Jake
 * @version 1.0
 */
public class ReboundPanel extends JPanel {
    /**
     * Unique version of this panel.
     */
    private static final long serialVersionUID = 1L;
    private final int WIDTH = 300;
    private final int HEIGHT = 300;
    private final int DELAY = 10;
    private ImageIcon imageFirst = new ImageIcon("happyFace.gif");
    private ImageIcon imageSecond = new ImageIcon("happyFace.gif");
    private Timer timer;
    private int x;
    private int y;
    private int x2;
    private int y2;
    private int moveX;
    private int moveY;
    private int moveX2;
    private int moveY2;

    public ReboundPanel() {
        timer = new Timer(DELAY, new ReboundListener());
        x = 50;
        y = 50;
        x2 = 100;
        y2 = 100;
        moveX = 10;
        moveY = 5;
        moveX2 = 12;
        moveY2 = 8;

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
        timer.start();

    }

    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        imageFirst.paintIcon(this, page, x, y);
        imageSecond.paintIcon(this, page, x2, y2);
    }

    private class ReboundListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            double radius;
            radius = imageFirst.getIconWidth() / 2;
            radius *= radius;
            radius *= Math.PI;
            x += moveX;
            y += moveY;
            x2 += moveX2;
            y2 += moveY2;
            if (x <= 0 || x >= getWidth() - imageFirst.getIconWidth()) {
                moveX = moveX * -1;
            }

            if (y <= 0 || y >= getHeight() - imageFirst.getIconHeight()) {
                moveY = moveY * -1;
            }

            if (x2 <= 0 || x2 >= getWidth() - imageSecond.getIconWidth()) {
                moveX2 = moveX2 * -1;
            }

            if (y2 <= 0 || y2 >= getHeight() - imageSecond.getIconHeight()) {
                moveY2 = moveY2 * -1;
            }

            if ((Math.pow((x - x2), 2) + (Math.pow((y - y2), 2)) < radius)) {
                moveX = moveX * -1;
                moveX2 = moveX2 * -1;
                moveY = moveY * -1;
                moveY2 = moveY2 * -1;
            }
            repaint();
        }

    }
}
