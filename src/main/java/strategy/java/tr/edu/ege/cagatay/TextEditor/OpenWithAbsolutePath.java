/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.java.tr.edu.ege.cagatay.TextEditor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.java.tr.edu.ege.cagatay.TextEditor.TextEditorAbstractFactory;

/**
 *
 * @author cagatay
 */

public class OpenWithAbsolutePath implements OpenFile{

    @Override
    public String open() {
            JFrame frame = TextEditorAbstractFactory.getFrame();
        String name;
            name = JOptionPane.showInputDialog("Path of the file", null);
        if (name != null) {
        File fi = new File(name); 
  
                try { 
                    String s1 = "", s2 = ""; 
                    FileReader fr = new FileReader(fi); 
                    BufferedReader br = new BufferedReader(fr); 
                    s2 = br.readLine(); 
                    while ((s1 = br.readLine()) != null) { 
                        s2 = s2 + "\n" + s1; 
                    } 
                    br.close();
                    return(s2);
                } 
                catch (IOException evt) { 
                    JOptionPane.showMessageDialog(frame, evt.getMessage()); 
                } 
        } else {
            System.out.println("İşlem iptal edildi");
        }

 
        return null;
    }
    
}
