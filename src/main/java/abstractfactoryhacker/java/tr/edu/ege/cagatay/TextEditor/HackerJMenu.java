/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryhacker.java.tr.edu.ege.cagatay.TextEditor;

import java.awt.Color;
import javax.swing.JMenu;

/**
 *
 * @author cagatay
 */

public class HackerJMenu extends JMenu{
    public HackerJMenu(String text){
        super(text);
        this.setForeground(Color.red);
    }
}
