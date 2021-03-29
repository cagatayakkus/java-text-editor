/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.tr.edu.ege.cagatay.TextEditor;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;

/**
 *
 * @author cagatay
 */


public class TextEditorFactory {
    
    

    public JMenuBar makeMenuBar() {
        return new DefaultTextEditorJMenuBar();
    }

    public JMenu makeMenu(String name) {
        return new DefaultTextEditorJMenu(name);
    }

    public JMenuItem makeJMenuItem(String name) {
        return new DefaultTextEditorJMenuItem(name);
    }

    public JFrame makeJFrame(String name) {
        return DefaultTextEditorJFrame.getInstance(name);
    }
    
    public JTextPane makeJTextPane() {
        return DefaultTextEditorJTextPane.getInstance();
    }
    
    public JRadioButtonMenuItem makeJRadioButtonMenuItem(String name){
        return new DefaultJRadioButtonMenuItem(name);
    }  
}
