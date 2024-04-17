package Timer;

import MainWindow.MainGui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreateTimer extends JFrame {
    private JTextField hoursField;
    private JTextField minutesField;
    private JTextField secondsField;
    private JButton startButton;
    private Timer countdownTimer;
    private JLabel timingLabel;
    private int hoursLeft;
    private int minutesLeft;
    private int secondsLeft;
    private MainGui mainGui;
    private JProgressBar ProgBar;

    public CreateTimer(MainGui mainGui, JProgressBar pbar) {
        super("Create Timer");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ProgBar = pbar;
        this.mainGui = mainGui;
        
        
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 2));

        JLabel hoursLabel = new JLabel("Hours:");
        hoursField = new JTextField();
        mainPanel.add(hoursLabel);
        mainPanel.add(hoursField);

        JLabel minutesLabel = new JLabel("Minutes:");
        minutesField = new JTextField();
        mainPanel.add(minutesLabel);
        mainPanel.add(minutesField);

        JLabel secondsLabel = new JLabel("Seconds:");
        secondsField = new JTextField();
        mainPanel.add(secondsLabel);
        mainPanel.add(secondsField);

        startButton = new JButton("Start Timer");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startTimer();
            }
        });
        mainPanel.add(startButton);

        add(mainPanel, BorderLayout.CENTER);
    }

private void startTimer() {
    int hours = Integer.parseInt(hoursField.getText());
    int minutes = Integer.parseInt(minutesField.getText());
    int seconds = Integer.parseInt(secondsField.getText());
    
    // Calculate the total number of seconds for the timer
    int totalSeconds = hours * 3600 + minutes * 60 + seconds;
    
    // Print the set time and initial percentage to the terminal
    System.out.println("Timer set to: " + formatTime(totalSeconds) + ". 100%");
    
    // Create and start the countdown timer
    countdownTimer = new Timer(1000, new ActionListener() {
        int remainingSeconds = totalSeconds;

        @Override
        public void actionPerformed(ActionEvent e) {
            remainingSeconds--;

            // Calculate the percentage completed
            int percentage = (int) ((totalSeconds - remainingSeconds) / (double) totalSeconds * 100);

            // Print the current time and percentage to the terminal
            System.out.println(formatTime(remainingSeconds) + ". " + percentage + "%");
        
            
            
            // Print the percentage whenever one of the 10s place percentages is reached
            if (percentage % 10 == 0 && percentage != 100 && percentage != 0) {
                System.out.println(formatTime(remainingSeconds) + ". " + percentage + "%");
            }

            // Check if the timer has finished
            if (remainingSeconds <= 0) {
                // Timer reached zero, stop the timer
                countdownTimer.stop();
                dispose(); // Close the timer window
            }
        updateTimerDisplay(remainingSeconds);    
        ProgBar.setValue(percentage);
        }
    });

    countdownTimer.start();
}

    private String formatTime(int totalSeconds) {
    int hours = totalSeconds / 3600;
    int minutes = (totalSeconds % 3600) / 60;
    int seconds = totalSeconds % 60;
    return String.format("%02d:%02d:%02d", hours, minutes, seconds);
}
     private void updateTimerDisplay(int remainingSeconds) {
        String formattedTime = formatTime(remainingSeconds);
        mainGui.updateTimerDisplay(formattedTime);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            MainGui mainGui1 = new MainGui();
            JProgressBar pbar = new JProgressBar();
            new CreateTimer(mainGui1, pbar).setVisible(true);
        });
    }
}
