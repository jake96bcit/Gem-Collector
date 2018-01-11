package DrawingCircleswithMouseClicks;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

/**
 * CirclePanel
 * @author Jake
 * @version 1.0
 */
@SuppressWarnings("serial")
public class CirclePanel extends JPanel {
    private final int WIDTH = 600;
    private final int HEIGHT = 400;
    private Circle circle;

    public CirclePanel() {
        addMouseListener(new CirclesListener());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        if (circle != null) {
            circle.draw(page);
        }
    }

    private class CirclesListener implements MouseListener {
        public void mousePressed(MouseEvent event) {
            if (circle == null) {
                circle = new Circle(event.getPoint());
            } else if (circle.isInside(event.getPoint())) {
                circle = new Circle(event.getPoint());
            } else {
                circle.move(event.getPoint());
            }
            repaint();

        }

        public void mouseClicked(MouseEvent event) {

        }

        public void mouseReleased(MouseEvent event) {

        }

        public void mouseEntered(MouseEvent event) {
            setBackground(Color.WHITE);
        }

        public void mouseExited(MouseEvent event) {
            setBackground(Color.BLUE);
        }
    }
}
