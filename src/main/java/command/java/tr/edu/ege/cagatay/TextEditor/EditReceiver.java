/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.java.tr.edu.ege.cagatay.TextEditor;

import javax.swing.JTextPane;
import main.java.tr.edu.ege.cagatay.TextEditor.TextEditorAbstractFactory;

/**
 *
 * @author cagatay
 */

public class EditReceiver {

    public void cut() {
        JTextPane textPane = TextEditorAbstractFactory.getTextPane();
        textPane.cut();
    }

    public void copy() {
        JTextPane textPane = TextEditorAbstractFactory.getTextPane();
        textPane.copy();
    }

    public void paste() {
        JTextPane textPane = TextEditorAbstractFactory.getTextPane();
        textPane.paste();
    }
    
}
