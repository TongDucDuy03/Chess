/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author 84942
 */
public class Sound {
    public static void PlayMusic(String location,boolean stop){
        Clip clip = null;
        AudioInputStream audioInput;
        
        try{
            File musicPath = new File(location);
            if(stop = true){
                audioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            }
            if(stop = false){
                clip.stop();
            }
        }   
        catch(Exception e){
            
        }
    }

}
