package Java_David_J_Eck.chapter3;

import javax.swing.*;
import java.awt.*;

/**
 * This GUI program generates a window that displays a picture consisting of a
 * large number of colored disks.
 * The picture is randomly generated each time the program is run.

 * Functionality:
 * - The program creates a window using the JFrame class, which represents
 * the main window of a Swing application.
 * - The window is displayed on the screen and has a size of 500x500 pixels.
 * - The window includes a JPanel, a lightweight container used for organizing
 * components.
 * - The JPanel is responsible for rendering the picture and is added to the JFrame.
 * - Within the JPanel, the drawPicture method is called, which generates and
 * draws a large number of colored disks.
 * - Each disk is represented by a filled oval shape with a randomly chosen color.
 * - The color of each disk is randomly selected from a set of four colors:
 * red, green, blue, and yellow.
 * - The position of each disk is randomly determined within the dimensions of the JPanel.
 * - The size of each disk is fixed at 100x100 pixels.
 * - The outline of each disk is drawn in black color.
 * - The picture consists of 500 randomly generated disks.

 * Usage:
 * - Execute the program to launch the GUI window and display the picture.
 * - Each time the program is run, a new random picture with colored disks will
 * be generated.

 * Note: To modify the picture, the drawPicture method can be customized or
 * replaced with different drawing logic.
 */

public class DrawPictureGUI {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setSize(500, 500);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

                JPanel panel = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        drawPicture(g, getWidth(), getHeight());
                    }
                };
                frame.add(panel);
            }
        });
    }   // end main()

    public static void drawPicture(Graphics g, int width, int height) {
        int centerX;    // The x-coord of the center of a disk.
        int centerY;    // The y-coord of the center of a disk.
        int colorChoice;    // Used to select a random color.
        int count;  // Loop control variable for counting disks.

        for (count = 0; count < 500 ; count++) {
            centerX = (int)(Math.random()*width);
            centerY = (int)(Math.random()*height);
            colorChoice = (int)(Math.random()*4);
            switch (colorChoice) {
                case 0 -> g.setColor(Color.RED);
                case 1 -> g.setColor(Color.GREEN);
                case 2 -> g.setColor(Color.BLUE);
                case 3 -> g.setColor(Color.YELLOW);
            }
            g.fillOval(centerX - 50, centerY - 50, 100, 100);
            g.setColor(Color.BLACK); // To draw the oval:
            g.drawOval(centerX - 50, centerY - 50, 100, 100);
        }
    }   // end drawPicture()

    /*
    * In this code, the drawPicture method is called from within the
    * paintComponent method of a custom JPanel. The JPanel is added to a JFrame,
    * which is then displayed on the screen.
    *
    * The paintComponent method is responsible for rendering the graphics on
    * the panel. By overriding this method and calling drawPicture within it,
    * we can draw the desired picture on the panel.
    *
    * The SwingUtilities.invokeLater method ensures that the code is executed on
    * the Event Dispatch Thread (EDT), which is necessary for Swing applications.
    *
    * By running this code, you should see a window with 500 randomly colored
    * disks drawn on it.
    *
    * A JPanel is a container used for grouping and organizing components,
    * while JFrame represents a window with title bar and window management
    * functionality. Once you have a JPanel object, we can add components to it
    * using methods like add(Component) or set a layout manager using methods
    * like setLayout(LayoutManager).
    */

}   // end class DrawPictureGUI
