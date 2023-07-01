/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

/**
 *
 * @author Admin
 */
import java.awt.Component;
public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public boolean outOfTime() {
        return (hours == 0 && minutes == 0 && seconds == 0);
    }
    
    public void decr() {
        while (hours > 0 || minutes > 0 || seconds > 0) {
            if (seconds > 0) {
                seconds--;
            } else {
                if (minutes > 0) {
                    minutes--;
                    seconds = 59;
                } else {
                    if (hours > 0) {
                        hours--;
                        minutes = 59;
                        seconds = 59;
                    }
                }
            }
           
            
            
    }}

    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
