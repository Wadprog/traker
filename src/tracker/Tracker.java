/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracker;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vaval
 */
public class Tracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       /* ScreenSnapper screenShot = new ScreenSnapper();
        while(1==1)
        {
            try {
                screenShot.robo();
            } catch (Exception ex) {
                Logger.getLogger(Tracker.class.getName()).log(Level.SEVERE, null, ex);
            }
            //There we would send the foto to the server 
            Thread.sleep(10000);
        }*/
         new MainScreen(1).setVisible(true);
    }
     
    
}
