/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.java.tr.edu.ege.cagatay.TextEditor;

/**
 *
 * @author cagatay
 */

public class AlignCenterCommand implements Command{
    AlignReceiver align;
    public AlignCenterCommand(AlignReceiver align) {
        this.align = align;
    }
    public void execute(){
        align.alignCenter();
    }
}
