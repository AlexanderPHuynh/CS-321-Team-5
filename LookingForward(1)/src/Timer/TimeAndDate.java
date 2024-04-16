/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Timer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.LocalTime;
/**
 *
 * @author aly35
 */
public class TimeAndDate {
DateTimeFormatter date_and_time = DateTimeFormatter.ofPattern("mm/dd/yyyy HH:mm:ss");
LocalDateTime currentTime = LocalDateTime.now();
LocalDateTime Time;

private int year;
private int month;
private int day;
private int hour;
private int minute;
private int second;

public TimeAndDate()
    {
    year = 0;
    month = 0;
    day = 0;
    hour = 0;
    minute = 0;
    second = 0;
    }


public void SetDate(int y, int m, int d, int h, int min, int sec)
    {
    if (y >0 && y < 10000)
       year = y;
    else 
     System.out.println("Value for year must be four digits");
 
    if ( m <= 12 && m > 0)
      month = m;
    else 
     System.out.println("Value for month must be between 1 and 12");
      
    if (d <= 31 && d > 0)
        day = d;
    else 
       System.out.println("Value for month must be between 1 and 31");
    
    if (h < 24 && h >= 0)
        hour = h; 
    else 
        System.out.println("Value for hours must be between 1 and 24");

    if (min < 60 && min >= 0)
        minute = min; 
    else 
       System.out.println("Value for minutes must be between 1 and 60");
    if (sec < 60 && sec >= 0)
        second = sec;
    else 
        System.out.println("Value for seconds must be between 1 and 60");
    
    }
public void setCurrentTime()
{
  year = currentTime.getYear();
  day = currentTime.getDayOfMonth();
  hour = currentTime.getHour();
  minute = currentTime.getMinute();
  second = currentTime.getSecond(); 
  month = (currentTime.getMonth().getValue());
}

public String getCurrentTime()
    {
    return (date_and_time.format(currentTime));
    }


public String getEndTime()
    {
    Time = LocalDateTime.of(year, month, day, hour, minute, second);
    return (date_and_time.format(Time));
    }

public int GetYears()
    {
    return (year);
    }
public int GetMonths()
    {
    return (month);
    }

public int GetDays()
    {
    return (day);
    }

public int GetHours()
    {
    return (hour);
    }
public int GetMinutes()
    {
    return (minute);
    }
public int GetSeconds()
    {
    return (second);
    }

}