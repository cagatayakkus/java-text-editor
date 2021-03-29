/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities.java.tr.edu.ege.cagatay.TextEditor;

import java.awt.Color;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import main.java.tr.edu.ege.cagatay.TextEditor.TextEditorAbstractFactory;

/**
 *
 * @author cagatay
 */

public class Utilities {
    
    public static void rePaintFontColor(){
        JTextPane textPane = TextEditorAbstractFactory.getTextPane();
        StyledDocument doc = (StyledDocument) textPane.getDocument();
        SimpleAttributeSet sas2 = new SimpleAttributeSet();
        Color foreground = textPane.getForeground();
        StyleConstants.setForeground(sas2, foreground);
        doc.setCharacterAttributes(0, (int)doc.getLength(), sas2, false);
    }
    
    public static JPanel twoInputDialog(String first, String second, JTextField firstTextField, JTextField secondTextField){
      
      JPanel myPanel = new JPanel();
      myPanel.add(new JLabel(first));
      myPanel.add(firstTextField);
      myPanel.add(Box.createHorizontalStrut(15));
      myPanel.add(new JLabel(second));
      myPanel.add(secondTextField);
      return myPanel;
    }
}
