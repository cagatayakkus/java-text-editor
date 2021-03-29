/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.java.tr.edu.ege.cagatay.TextEditor;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import main.java.tr.edu.ege.cagatay.TextEditor.TextEditorAbstractFactory;
import utilities.java.tr.edu.ege.cagatay.TextEditor.Utilities;

/**
 *
 * @author cagatay
 */


public class ExtrasReceiver {

    public void undo(){
        
        Stack textStack = TextEditorAbstractFactory.getTextStack();
        JTextPane textPane = TextEditorAbstractFactory.getTextPane();
            if(!textStack.empty()) {
                    textStack.pop();
                    if (textStack.empty()) {
                        textPane.setText("");
                    } else {
                        textPane.setText(textStack.lastElement().toString());
                        Utilities.rePaintFontColor();
                        textStack.pop();
                    }
                    textStack.pop();
            }
            System.out.println(textStack);
       
       
      

            
    }
    public void find(){
        JTextPane textPane = TextEditorAbstractFactory.getTextPane();
            Utilities.rePaintFontColor();
            String name;
            name = JOptionPane.showInputDialog(null,"Find:", "Find", JOptionPane.INFORMATION_MESSAGE);
            StyledDocument doc = (StyledDocument) textPane.getDocument();
                
        if (name != null) {
                try {
                    
                    int length = doc.getLength();
                    String text = doc.getText(0, length);
                    List<Character> chars = new ArrayList<>();
                    List<Character> findChars = new ArrayList<>();
                    
                     for (char ch : text.toCharArray()) {
                         chars.add(ch); 
                     } 
                     for (char ch : name.toCharArray()) {
                         findChars.add(ch); 
                     }
                     
                     ListIterator iterator = chars.listIterator();
                     char c1;
                     while (iterator.hasNext()) {
                      c1 = (char) iterator.next();   
                      
                      if(c1 == findChars.get(0)){
                          
                          int index = iterator.nextIndex() - 1;
                          if(index + (int)name.length() <= doc.getLength()){
                          String innerText = doc.getText(index, (int)name.length());
                            if(innerText.equals(name)) {
                                 SimpleAttributeSet sas = new SimpleAttributeSet();
                                 StyleConstants.setForeground(sas, Color.RED);
                                 doc.setCharacterAttributes(index, (int)name.length(), sas, false);
                            }
                          }
                      }
                     }
                } catch (BadLocationException ex) {
                    Logger.getLogger(TextEditorAbstractFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
    }
    
    public void findAndReplace(){
      JTextPane textPane = TextEditorAbstractFactory.getTextPane();
      Stack textStack = TextEditorAbstractFactory.getTextStack();
      StyledDocument doc = (StyledDocument) textPane.getDocument();
      
      Utilities.rePaintFontColor();
      JTextField findValue = new JTextField(5);
      JTextField replaceValue = new JTextField(5);
      JPanel myPanel = Utilities.twoInputDialog("Find:", "Replace:", findValue, replaceValue);
      List<Integer> offsetList = new ArrayList<Integer>();
      int result = JOptionPane.showConfirmDialog(null, myPanel, 
               "Find & Replace", JOptionPane.OK_CANCEL_OPTION);
      if (result == JOptionPane.OK_OPTION) {
           String findText = findValue.getText();
           String replaceText = replaceValue.getText();
            try {
                List<Character> chars = new ArrayList<>();
                List<Character> findChars = new ArrayList<>();
                int length = doc.getLength();
                String text = doc.getText(0, length);
                for (char ch : text.toCharArray()) {
                    chars.add(ch);
                }
                for (char ch : findText.toCharArray()) {
                    findChars.add(ch);
                }
                
                ListIterator iterator = chars.listIterator();
                
                
                char c1;
                
                while (iterator.hasNext()) {
                    c1 = (char) iterator.next();
                    if(c1 == findChars.get(0)){
                        int index = iterator.nextIndex() - 1;
                        if(index + (int)findText.length() <= doc.getLength()){
                            String innerText = doc.getText(index, (int)findText.length());
                            if(innerText.equals(findText)) {
                            offsetList.add(index);
                            }
                        }
                    }
                }
                for (int i = offsetList.size(); i > 0; i--) {
                   int offset = offsetList.get(i-1);
                   Style style = doc.addStyle("StyleName", null);
                   StyleConstants.setForeground(style, Color.red);
                   doc.remove(offset, (int)findText.length());
                   textStack.pop();
                   doc.insertString(offset, replaceText, style);
                    if (i > 1) {  
                    textStack.pop();
                    }
                }
            } catch (BadLocationException ex) {
                Logger.getLogger(ExtrasReceiver.class.getName()).log(Level.SEVERE, null, ex);
            } 
      }
   }
}
