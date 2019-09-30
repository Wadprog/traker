/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




package tracker;


import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Vaval
 */
public class ScreenSnapper {
     SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd hh mm ss a");

    public File snap() throws Exception
    {
         String current = null;
       
         try {
            current = new java.io.File( "." ).getCanonicalPath();
            current+="\\snaps\\";
        } catch (IOException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        Calendar now = Calendar.getInstance();
        Robot robot = new Robot();
        BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        
        File shot=new File(current+formatter.format(now.getTime())+".jpg");
        ImageIO.write(screenShot, "JPG", shot);
        System.out.println(formatter.format(now.getTime()));
        return shot;
    }

}



