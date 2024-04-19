/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Timer;
import javax.swing.JProgressBar;
import javax.swing.Timer;

/**
 *
 *
 */
public class EndTimer {
    public void resetTimer(Timer timer, JProgressBar progressBar) {
        timer.stop(); // Stop the timer
        timer.setInitialDelay(0); // Reset the initial delay
        timer.setDelay(0); // Reset the delay
        timer.setRepeats(false); // Reset the repeat behavior
        // Reset the progress bar
        progressBar.setValue(0);
        progressBar.setVisible(false);
    }
}
