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

public class PasteCommand implements Command{
    EditReceiver edit;
    public PasteCommand(EditReceiver edit) {
        this.edit = edit;
    }
    public void execute(){
        edit.paste();
    }
    
}
