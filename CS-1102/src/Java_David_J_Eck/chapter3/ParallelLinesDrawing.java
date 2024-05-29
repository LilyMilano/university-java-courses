package Java_David_J_Eck.chapter3;

import javax.swing.*;
import java.awt.*;

/**
 * To start with something simple, let’s say that we want to draw a set of
 * ten parallel lines, something like this:
 * Let’s say that the lines are 200 pixels long and that the distance from
 * each line to the next is 10 pixels, and let’s put the start of the first
 * line at the pixel with coordinates (100,50). To draw one line, we just
 * have to call g.drawLine(x1,y1,x2,y2) with appropriate values for the
 * parameters. Now, all the lines start at x-coordinate 100, so we can use
 * the constant 100 as the value for x1. Since the lines are 200 pixels long,
 * we can use the constant 300 as the value for x2. The y-coordinates of the
 * lines are different, but we can see that both endpoints of a line have the
 * same y-coordinates, so we can use a single variable as the value for
 * y1 and for y2. Using y as the name of that variable, the command for
 * drawing one of the lines becomes g.drawLine(100,y,300,y). The value of y
 * is 50 for the top line and increases by 10 each time we move down from one
 * line to the next. We just need to make sure that y takes on the correct
 * sequence of values. We can use a for loop that counts from 1 to 10.
 */

public class ParallelLinesDrawing extends JFrame {

    public ParallelLinesDrawing() {
        setSize(500, 500);  // Set the size of the JFrame window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the close
                                                        // operation
        setLocationRelativeTo(null);    // Center the window on the screen
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int y = 50; // Starting y-coordinate for the lines
        for (int i = 1; i <= 10 ; i++) {    // Loop to draw 10 lines
            g.drawLine(100, y, 300, y); // Draw a line from (100, y) to (300,y)

            y += 10;    // Increment y by 10 for the next line
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { // Run the program on the
            // Event Dispatch Thread
            @Override
            public void run() {
                new ParallelLinesDrawing();  // Create an instance of
                // ParallelLinesDrawing class
            }
        });
    }   // end main()

    /*
    * This program creates a ParallelLinesDrawing class that extends JFrame
    * to create a window. It overrides the paint method to draw the parallel
    * lines using the drawLine method of the Graphics class. In the paint
    * method, the variable y is initially set to 50, and a loop is used to
    * draw ten lines. After each line is drawn, the value of y is incremented
    * by 10. The main method creates an instance of the ParallelLinesDrawing
    * class and runs it on the event dispatch thread using
    * SwingUtilities.invokeLater.
    *
    * In Java Swing programming, there are multiple threads involved.
    * One important thread is called the Event Dispatch Thread (EDT), which is
    * responsible for handling Swing components and ensuring thread safety.
    * The EDT is where all GUI-related tasks, such as updating the user
    * interface, should be performed.
    *
    * The SwingUtilities.invokeLater(new Runnable()) method is used to schedule
    * the execution of a task on the EDT. It ensures that the task is executed
    * on the EDT at its next convenience. The task is defined using an anonymous
    * inner class that implements the Runnable interface.
    *
    * By using SwingUtilities.invokeLater, we can safely update Swing components
    * from any thread, even if it's not the EDT. This is important because Swing
    * data structures are not thread-safe, meaning they are not designed to be
    * accessed by multiple threads simultaneously. To prevent concurrent access
    * issues and ensure the integrity of Swing components, all code that accesses
    * Swing components should run on the same thread, which is the EDT.
    *
    * In simpler terms, SwingUtilities.invokeLater(new Runnable()) allows us to
    * post a task to the EDT, which will then execute the task at its next
    * available opportunity. This ensures that GUI updates and interactions with
    * Swing components are performed safely and smoothly.
    *
    * The paint(Graphics g) method is automatically called by the system when
    * it's time to render the graphical user interface (GUI) of a Swing application.
    * You don't need to explicitly call this method yourself. In the provided
    *  code, the paint(Graphics g) method is overridden in the ParallelLinesDrawing
    * class to customize the drawing behavior. When the JFrame is displayed,
    * the system automatically invokes the paint(Graphics g) method to draw the
    * GUI components on the screen.
    *
    * The Graphics g parameter represents the graphics context that allows you
    * to draw on the screen. You can use various methods of the Graphics class,
    * such as drawLine(), drawRect(), and drawString(), to perform the desired
    * drawing operations.
    *
    * By overriding the paint(Graphics g) method and providing your own
    * implementation, you can define what should be drawn on the screen.
    * In the given code, the paint(Graphics g) method is used to draw a set of
    * ten parallel lines.
    *
    * Remember, you should not call the paint(Graphics g) method directly.
    * Instead, the system handles the invocation of this method when necessary,
    * such as when the GUI needs to be updated or refreshed.
    */

}   // end class ParallelLinesDrawing
