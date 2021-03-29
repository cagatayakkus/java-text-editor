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

public class CopyCommand implements Command{
    EditReceiver edit;
    public CopyCommand(EditReceiver edit) {
        this.edit = edit;
    }

    @Override
    public void execute() {
        edit.copy();
    }
    
    
}
