/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.java.tr.edu.ege.cagatay.TextEditor;

import javax.swing.text.StyleConstants;

/**
 *
 * @author cagatay
 */

public class AlignTextToLeft implements AlignText{

    @Override
    public int align() {
        return StyleConstants.ALIGN_LEFT;
    }
    
}
