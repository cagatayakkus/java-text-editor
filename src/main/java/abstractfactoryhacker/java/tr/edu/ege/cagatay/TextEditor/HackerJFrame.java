/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryhacker.java.tr.edu.ege.cagatay.TextEditor;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author cagatay
 */

public class HackerJFrame extends JFrame{

    private static HackerJFrame frame = null; 
    private HackerJFrame(String text){
        super(text);
        Container c = this.getContentPane();
        c.setBackground(Color.GREEN);
    }
    public static HackerJFrame getInstance(String name) 
    { 
        if (frame == null) 
            frame = new HackerJFrame(name); 
        return frame; 
    } 
   
}
