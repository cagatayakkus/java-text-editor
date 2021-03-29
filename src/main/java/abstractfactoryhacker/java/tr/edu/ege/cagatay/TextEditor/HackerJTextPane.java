/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryhacker.java.tr.edu.ege.cagatay.TextEditor;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;

/**
 *
 * @author cagatay
 */

public class HackerJTextPane extends JTextPane{
    
    private static HackerJTextPane textPane = null; 
    private HackerJTextPane(){
        Font font = new Font("Serif", Font.PLAIN, 16);
        this.setFont(font);
        this.setBackground(Color.BLACK);
        this.setForeground(Color.GREEN);
        this.setCaretColor(Color.GREEN);
    }
        public static HackerJTextPane getInstance() 
    { 
        if (textPane == null) 
            textPane = new HackerJTextPane(); 
  
        return textPane; 
    } 
}
