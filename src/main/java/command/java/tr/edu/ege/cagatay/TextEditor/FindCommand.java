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

public class FindCommand implements Command{
    ExtrasReceiver extras;
    public FindCommand(ExtrasReceiver extras){
        this.extras = extras;
    }
    @Override
    public void execute() {
        extras.find();
    }
    
}
