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

public class ContextFile {
    private OpenFile openFile;
    
    public void setOpenFile(OpenFile openFile) {
        this.openFile = openFile;
    }
    public String openFile() {
        return openFile.open();
    }
}
