/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MainWindow;
import Timer.CreateTimer;
import Timer.EndTimer;
import progressBars.ProgressBarGraphics;
import model.Quit;
import Timer.SaveTimer;
import Timer.TimeAndDate;

/**
 *
 * @author aly35
 */
public class LookingForward{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    LookingForwardMainGui gui = new LookingForwardMainGui();
    
    TimeAndDate startTime = new TimeAndDate();
    TimeAndDate endTime = new TimeAndDate();
    
    startTime.setCurrentTime();
    endTime.SetDate(2024, 10, 21, 10, 10, 0);
    
    System.out.println(startTime.getCurrentTime());
    System.out.println(endTime.getEndTime());
    SaveTimer save = new SaveTimer();
    save.SaveToFile(startTime, endTime);
    startTime.SetDate(2024, 11, 23, 0, 0,0);
    endTime.SetDate(2024, 9, 30, 0, 0, 0);
    save.SaveToFile(startTime, endTime);
    }
    
}