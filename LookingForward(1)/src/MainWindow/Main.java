package MainWindow;

import javax.swing.JFrame;
import Timer.CreateTimer;
import Timer.EndTimer;
import progressBars.ProgressBarGraphics;
import model.Quit;
import Timer.SaveTimer;
import Timer.TimeAndDate;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Application Title"); // Set a title for your window
        MainGui mainGui = new MainGui(); // Initialize your MainGui

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application exits when the frame is closed
        frame.getContentPane().add(mainGui); // Add the MainGui panel to the frame
        frame.pack(); // Adjust the frame size to its content
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true); // Make the frame visible
    }
}