/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.java.tr.edu.ege.cagatay.TextEditor;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import main.java.tr.edu.ege.cagatay.TextEditor.TextEditorAbstractFactory;
import strategy.java.tr.edu.ege.cagatay.TextEditor.AlignTextToCenter;
import strategy.java.tr.edu.ege.cagatay.TextEditor.AlignTextToLeft;
import strategy.java.tr.edu.ege.cagatay.TextEditor.AlignTextToRight;
import strategy.java.tr.edu.ege.cagatay.TextEditor.ContextAlign;

/**
 *
 * @author cagatay
 */

public class AlignReceiver {

    public void alignRight() {
        JTextPane textPane = TextEditorAbstractFactory.getTextPane();
        ContextAlign ca = new ContextAlign();
        ca.setAlignText(new AlignTextToRight());
        SimpleAttributeSet attribs = new SimpleAttributeSet();
        StyleConstants.setAlignment(attribs, ca.alignText());
        textPane.setParagraphAttributes(attribs, false);
    }

    public void alignLeft() {
        JTextPane textPane = TextEditorAbstractFactory.getTextPane();
        ContextAlign ca = new ContextAlign();
        ca.setAlignText(new AlignTextToLeft());
        SimpleAttributeSet attribs = new SimpleAttributeSet();
        StyleConstants.setAlignment(attribs, ca.alignText());
        textPane.setParagraphAttributes(attribs, false);
    }

    public void alignCenter() {
        JTextPane textPane = TextEditorAbstractFactory.getTextPane();
        ContextAlign ca = new ContextAlign();
        ca.setAlignText(new AlignTextToCenter());
        SimpleAttributeSet attribs = new SimpleAttributeSet();
        StyleConstants.setAlignment(attribs, ca.alignText());
        textPane.setParagraphAttributes(attribs, false);
    }
    
}
