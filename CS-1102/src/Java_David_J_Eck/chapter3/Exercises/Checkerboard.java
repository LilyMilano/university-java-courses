package Java_David_J_Eck.chapter3.Exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Write a GUI program that draws a checkerboard. */

public class Checkerboard extends JPanel implements ActionListener {

    public void drawFrame(Graphics g, int frameNum, int width, int height ) {

        int row;    // Row number, from 0 to 7
        int col;    // Column number, from 0 to 7
        int x, y;   // Top-left corner of square

        for (row = 0; row < 8; row++) {

            for (col = 0; col < 8 ; col++) {
                x = col*50;
                y = row*50;
                if ((row%2) == (col%2)){
                    g.setColor(Color.RED);
                }
                else {
                    g.setColor(Color.BLACK);
                }
                g.fillRect(x, y, 50, 50);
            }
        } // end outer for
    }   // end drawFrame()

    //__________________IMPLEMENTATION________________________________________

    public static void main(String[] args) {

        JFrame window = new JFrame("Checkerboard");
        Checkerboard drawingArea = new Checkerboard();
        drawingArea.setBackground(Color.WHITE);
        window.setContentPane(drawingArea);
        drawingArea.setPreferredSize(new Dimension(400, 400));
        window.pack();
        window.setLocation(100, 50);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false); // The user can't change the size.
        Timer frameTimer = new Timer(20, drawingArea);
        window.setVisible(true);
        // frameTimer.start(); // commented out so we don't get an animation.

    }   // end main()

    private int frameNum;

    public void actionPerformed(ActionEvent evt) {
        frameNum++;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawFrame(g, frameNum, getWidth(), getHeight());
    }
}   // end class
