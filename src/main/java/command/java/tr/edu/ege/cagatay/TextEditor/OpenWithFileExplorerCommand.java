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

public class OpenWithFileExplorerCommand implements Command{
    FileReceiver file;
    public OpenWithFileExplorerCommand(FileReceiver file){
        this.file = file;
    }
    
    @Override
    public void execute() {
        file.openWithFileExplorer();
    }
    
}
