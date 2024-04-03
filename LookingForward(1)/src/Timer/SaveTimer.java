/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Timer;

/**
 *
 * @author aly35
 */
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

/**
 *
 * @author aly35
 */
public class SaveTimer {

   private TimeAndDate startTime;
   private TimeAndDate endTime;
   private final File outputFile = new File("outputFile.txt");
  
   
   public SaveTimer()
   {
    
    try {
      if (outputFile.createNewFile()) 
        {
        System.out.println("File created: " + outputFile.getName());
        } 
      else 
        {
        System.out.println("File already exists.");
        }
        } 
    catch (IOException e) 
      {
      System.out.println("An error occurred.");
      }
    

   }

   



public void SaveToFile(TimeAndDate start, TimeAndDate end)
    {
        
    startTime = start;
    endTime = end;
    boolean append = true;
    try (FileWriter writer = new FileWriter("outputFile.txt" , append))
        {
        writer.write(startTime.getEndTime());
        writer.write("\n");
        writer.write(endTime.getEndTime());
        writer.write("\n");
        writer.close();
        System.out.println("Successfully wrote to the file.");
        }
    catch(IOException error)
        {
        System.out.println("An error occured while writing to file");
        }
    }
}