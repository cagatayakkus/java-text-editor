/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.java.tr.edu.ege.cagatay.TextEditor;

/**
 *
 * @author cagatay
 */

public class ContextAlign {
    private AlignText alignText;
    
    public void setAlignText(AlignText alignText) {
        this.alignText = alignText;
    }
    public int alignText() {
        return alignText.align();
    }
}
