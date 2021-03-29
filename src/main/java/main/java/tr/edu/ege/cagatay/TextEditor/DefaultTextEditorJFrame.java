package main.java.tr.edu.ege.cagatay.TextEditor;

import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cagatay
 */

public class DefaultTextEditorJFrame extends JFrame{
    private static DefaultTextEditorJFrame frame = null; 
    private DefaultTextEditorJFrame(String name) {
        super(name);
    }
    public static DefaultTextEditorJFrame getInstance(String name) 
    { 
        if (frame == null) 
            frame = new DefaultTextEditorJFrame(name); 
  
        return frame; 
    }
}
