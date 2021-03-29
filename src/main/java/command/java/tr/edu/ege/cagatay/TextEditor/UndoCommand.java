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

public class UndoCommand implements Command{
        ExtrasReceiver extras;
    public UndoCommand(ExtrasReceiver extras) {
        this.extras = extras;
    }
    @Override
    public void execute() {
        extras.undo();
    }
    
}
