package Java_David_J_Eck.chapter3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This file can be used to create very simple animations. Just fill in
 * the definition of drawFrame with the code to draw one frame of the
 * animation, and possibly change a few of the values in the rest of
 * the program as noted below.
 */
public class SimpleAnimationStarter extends JPanel implements ActionListener {

    public void drawFrame(Graphics g, int frameNumber, double elapsedSeconds, int width, int height) {
        // Clear the drawing area with a white background
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        // Calculate the x and y coordinates for the center of the circle
        int x = width / 2;
        int y = height / 2;

        // Calculate the radius of the circle based on the frame number
        int radius = frameNumber % 100;

        // Draw the circle at the calculated position with a random color
        g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Simple Animation");
        SimpleAnimationStarter drawingArea = new SimpleAnimationStarter();
        drawingArea.setBackground(Color.WHITE);
        window.setContentPane(drawingArea);
        drawingArea.setPreferredSize(new Dimension(600, 450));
        window.pack();
        window.setLocation(100, 50);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);

        Timer frameTimer = new Timer(16, drawingArea); // Adjusted delay for smoother animation
        frameTimer.setInitialDelay(500);

        window.setVisible(true);
        frameTimer.start();
    }

    private int frameNum;
    private long elapsedTime;
    private long startTime = -1;

    public void actionPerformed(ActionEvent evt) {
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        frameNum++;
        if (startTime == -1) {
            elapsedTime = 0;
            startTime = System.currentTimeMillis();
        } else {
            elapsedTime = System.currentTimeMillis() - startTime;
        }
        drawFrame(g, frameNum, elapsedTime / 1000.0, getWidth(), getHeight());
    }

}
