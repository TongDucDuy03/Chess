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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
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
        if (this.minutes == 0 && this.seconds == 0) {
            this.seconds = 59;
            this.minutes = 59;
            this.hours--;
        } else if (this.seconds == 0) {
            this.seconds = 59;
            this.minutes--;
        } else this.seconds--;
    }
    
    
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
