/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainWindow;

import Timer.CreateTimer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author apoul
 */
public class MainGui extends javax.swing.JPanel {

    /**
     * Creates new form MainGui
     */
    public MainGui() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TimerDisplay = new javax.swing.JLabel();
        NewTimerButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setBackground(java.awt.Color.pink);

        TimerDisplay.setText("Timer: ");

        NewTimerButton.setText("New Timer");
        NewTimerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewTimerButtonButtonActionPermformed(evt);
            }
        });

        ExitButton.setText("Exit ");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TimerDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(NewTimerButton)
                        .addGap(138, 138, 138)
                        .addComponent(ExitButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(TimerDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewTimerButton)
                    .addComponent(ExitButton))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NewTimerButtonButtonActionPermformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewTimerButtonButtonActionPermformed
        CreateTimer newWindow = new CreateTimer(this);
        newWindow.setVisible(true);
    }//GEN-LAST:event_NewTimerButtonButtonActionPermformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainGui();
        });
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton NewTimerButton;
    private javax.swing.JLabel TimerDisplay;
    // End of variables declaration//GEN-END:variables
}