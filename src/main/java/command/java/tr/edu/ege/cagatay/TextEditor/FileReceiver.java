/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.java.tr.edu.ege.cagatay.TextEditor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Stack;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import main.java.tr.edu.ege.cagatay.TextEditor.TextEditorAbstractFactory;
import strategy.java.tr.edu.ege.cagatay.TextEditor.ContextFile;
import strategy.java.tr.edu.ege.cagatay.TextEditor.OpenWithAbsolutePath;
import strategy.java.tr.edu.ege.cagatay.TextEditor.OpenWithFileExplorer;

/**
 *
 * @author cagatay
 */

public class FileReceiver {
    Stack textStack = TextEditorAbstractFactory.getTextStack();
    JTextPane textPane = TextEditorAbstractFactory.getTextPane();
    File fi;
    ContextFile context = new ContextFile();
    String content;
    public void newFile() {
        textPane.setText("");
        textStack.clear();
    }

    public void openWithFileExplorer() {
        context.setOpenFile(new OpenWithFileExplorer());
        content = context.openFile();
        textPane.setText(content);
    }
    
    public void openWithAbsolutePath() {
         context.setOpenFile(new OpenWithAbsolutePath());
         content = context.openFile();
         textPane.setText(content);
    }

    public void saveFile() {
            JFrame frame = TextEditorAbstractFactory.getFrame();
            JFileChooser j = new JFileChooser("f:"); 
            int r = j.showSaveDialog(null); 
  
            if (r == JFileChooser.APPROVE_OPTION) {
                File fi = new File(j.getSelectedFile().getAbsolutePath()); 
  
                try {
                    FileWriter wr = new FileWriter(fi, false); 
  
                    BufferedWriter w = new BufferedWriter(wr); 
  
                    w.write(textPane.getText());
                    w.flush(); 
                    w.close(); 
                } 
                catch (Exception evt) { 
                    JOptionPane.showMessageDialog(frame, evt.getMessage()); 
                } 
            } 
            else
                System.out.println("İşlem iptal edildi");
    }
}
