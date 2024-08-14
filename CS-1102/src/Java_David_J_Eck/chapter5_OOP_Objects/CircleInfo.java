package Java_David_J_Eck.chapter5_OOP_Objects;

import java.awt.*;

/**
 * A simple class that holds the size, color, and location of a colored disk,
 * with a method for drawing the circle in a graphic context. The circle is
 * drawn as a filled oval, with a black outline.
 */
public class CircleInfo {

    // Instance variables:
    public int radius;  // The radius of the circle.
    public int x, y;    // The location of the center of the circle.
    public Color color; // The color of the circle.

    /**
     * Create a CircleInfo with a given location and radius and with a
     * randomly selected, semi-transparent color.
     * @param centerX   The x coordinate of the center.
     * @param centerY   The y coordinate of the center.
     * @param rad       The radius of the circle.
     */

    // Constructor:
    public CircleInfo(int centerX, int centerY, int rad) {
        x = centerX;
        y = centerY;
        radius = rad;
        int red = (int)(256 * Math.random());
        int green = (int)(256 * Math.random());
        int blue = (int)(256 * Math.random());
        color = new Color(red, green, blue, 100);
    }   // end of CircleInfo() constructor

    // Instance Method:
    /**
     * Draw the disk in graphics context g, with a black outline.
     */
    public void draw( Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, 2*radius, 2*radius);
        g.setColor(Color.BLACK);
        g.drawOval(x - radius, y - radius, 2*radius, 2*radius);
    }   // end of draw()

}   // end of class CircleInfo
