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

public class OpenWithAbsolutePathCommand implements Command{
    FileReceiver file;
    public OpenWithAbsolutePathCommand(FileReceiver file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.openWithAbsolutePath();
    }
}
