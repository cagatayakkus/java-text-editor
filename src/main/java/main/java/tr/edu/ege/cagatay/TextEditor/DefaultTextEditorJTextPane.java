/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.tr.edu.ege.cagatay.TextEditor;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;

/**
 *
 * @author cagatay
 */


public class DefaultTextEditorJTextPane extends JTextPane{
    private static DefaultTextEditorJTextPane textPane = null; 
    private DefaultTextEditorJTextPane() {
        Font font = new Font("Serif", Font.PLAIN, 16);
        this.setFont(font);
        this.setBackground(new Color(243,229,240));
        this.setForeground(new Color(62,56,61));
    }
    public static DefaultTextEditorJTextPane getInstance() 
    { 
        if (textPane == null) 
            textPane = new DefaultTextEditorJTextPane(); 
  
        return textPane; 
    } 
}
