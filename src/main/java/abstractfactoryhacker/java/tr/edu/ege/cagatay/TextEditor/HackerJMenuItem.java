/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryhacker.java.tr.edu.ege.cagatay.TextEditor;

import java.awt.Color;
import javax.swing.JMenuItem;

/**
 *
 * @author cagatay
 */

public class HackerJMenuItem extends JMenuItem {

    public HackerJMenuItem(String text){
        super(text);
        this.setForeground(Color.RED);
        this.setBackground(Color.GREEN);
    }

}
