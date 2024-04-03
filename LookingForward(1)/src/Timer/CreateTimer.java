package Timer;

import MainWindow.LookingForwardMainGui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreateTimer extends JFrame {
    private JTextField hoursField;
    private JTextField minutesField;
    private JTextField secondsField;
    private JButton startButton;
    private Timer timing;
    private JLabel timingLabel;
    private int secondsLeft;
    private LookingForwardMainGui mainGui;

    public CreateTimer() {
        super("Create Timer");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
        //CountDownTimer(Integer.parseInt(secondsField.getText()));
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

    CreateTimer(LookingForwardMainGui mainGui) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void CountDownTimer(int seconds){
        secondsLeft = Integer.parseInt(secondsField.getText());
        timingLabel = new JLabel(formatTime(secondsLeft));
        timingLabel.setFont(new Font("Arial", Font.BOLD, 24));
        timingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(timingLabel, BorderLayout.CENTER);
        
        timing = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                secondsLeft--;
                timingLabel.setText(formatTime(secondsLeft));
                        if (secondsLeft <= 0){
                            timing.stop();
                            dispose();
                        }
            }
        });
        timing.start();
    }

    private void startTimer() {
        int hours = Integer.parseInt(hoursField.getText());
        int minutes = Integer.parseInt(minutesField.getText());
        int seconds = Integer.parseInt(secondsField.getText());
        
        // You can create and start the timer with the specified values here
        // For simplicity, let's just print the values for now
        System.out.println("Timer started with " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
        CountDownTimer(seconds);
        dispose();
    }
    
    private String formatTime(int s){
        int minutes = s/60;
        int remainingSeconds = s%60;
        return String.format("%02d:%02d", minutes, remainingSeconds);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CreateTimer().setVisible(true);
            }
        });
    }
}
