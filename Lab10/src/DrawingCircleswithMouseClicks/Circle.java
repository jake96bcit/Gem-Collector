package DrawingCircleswithMouseClicks;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

/**
 * Circle
 * 
 * @author Jake
 * @vesion 1.0
 */
public class Circle {
    private int centerX;
    private int centerY;
    private int radius;
    private Color color;
    static Random ram = new Random();

    public Circle(Point point) {
        radius = Math.abs(ram.nextInt()) % 50 + 25;
        color = new Color(Math.abs(ram.nextInt()) % 16777216);
        centerX = point.x;
        centerY = point.y;
    }

    public void draw(Graphics page) {
        page.setColor(color);
        page.fillOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
    }

    public void move(Point p) {
        centerX = p.x;
        centerY = p.y;
    }

    public boolean isInside(Point p) {
        int currentX = p.x;
        int currentY = p.y;
        if (Math.pow((centerX - currentX), 2) + Math.pow((centerY - currentY), 2) < radius) {
            return true;
        }
        return false;
    }
}
