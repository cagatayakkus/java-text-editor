/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryhacker.java.tr.edu.ege.cagatay.TextEditor;

import main.java.tr.edu.ege.cagatay.TextEditor.*;


/**
 *
 * @author cagatay
 */

public class HackerTextEditorFactory extends TextEditorFactory{


    @Override
    public HackerJMenuBar makeMenuBar() {
        return new HackerJMenuBar();
    }

    @Override
    public HackerJMenu makeMenu(String name) {
        return new HackerJMenu(name);
    }

    @Override
    public HackerJMenuItem makeJMenuItem(String name) {
        return new HackerJMenuItem(name);
    }

    @Override
    public HackerJFrame makeJFrame(String name) {
        return HackerJFrame.getInstance(name);
    }

    @Override
    public HackerJTextPane makeJTextPane() {
        return HackerJTextPane.getInstance();
    }
    
    @Override
    public HackerJRadioButtonMenuItem makeJRadioButtonMenuItem(String name){
        return new HackerJRadioButtonMenuItem(name);
    }
    
}
