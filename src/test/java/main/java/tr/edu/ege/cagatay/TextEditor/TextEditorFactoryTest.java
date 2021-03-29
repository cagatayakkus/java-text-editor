/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.tr.edu.ege.cagatay.TextEditor;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mikap
 */

//TextEditorFactory sınıfının geliştirildiği JUnit birim test sınıfı
public class TextEditorFactoryTest {   
    TextEditorFactory instance = new TextEditorFactory();
    //JMenuBar nesnesi istenirse null olarak oluşturulabilmeli
    @Test
    public void testJMenuBarCanBeNull() {
        JMenuBar result = null;
        assertNull(result);
    }
    //JMenu nesnesi istenirse null olarak oluşturulabilmeli
    @Test
    public void testJMenuCanBeNull() {
        JMenu result = null;
        assertNull(result);
    }
    //JMenuItem nesnesi istenirse null olarak oluşturulabilmeli
    @Test
    public void testJMenuItemCanBeNull() {
        JMenuItem result = null;
        assertNull(result);
    }
    //JFrame nesnesi istenirse null olarak oluşturulabilmeli
    @Test
    public void testJFrameCanBeNull() {
        JFrame result = null;
        assertNull(result);
    }
    //JTextPane nesnesi istenirse null olarak oluşturulabilmeli
    @Test
    public void testJTextPaneCanBeNull() {
        JTextPane result = null;
        assertNull(result);
    }
    //JRadioButtonMenuItem nesnesi istenirse null olarak oluşturulabilmeli
    @Test
    public void testJRadioButtonMenuItemCanBeNull() {
        JRadioButtonMenuItem result = null;
        assertNull(result);
    }
    
    //makeMenuBar metodunun null değer döndürmemeli
    @Test
    public void testMakeMenuBarisNull() {
        JMenuBar result = instance.makeMenuBar();
        assertNotNull(result);
    }
    //makeMenu metodunun null değer döndürmemeli
    @Test
    public void testMakeMenuisNull() {
        JMenu result = instance.makeMenu("Test Title");
        assertNotNull(result);
    }
    //makeJMenuItem metodunun null değer döndürmemeli
    @Test
    public void testMakeJMenuItemisNull() {
        JMenuItem result = instance.makeJMenuItem("Test Title");
        assertNotNull(result);
    }
    //makeJFrame metodunun null değer döndürmemeli
    @Test
    public void testMakeJFrameisNull() {
        JFrame result = instance.makeJFrame("Test Title");
        assertNotNull(result);
    }
    //makeJTextPane metodunun null değer döndürmemeli
    @Test
    public void testMakeJTextPaneisNull() {
        JTextPane result = instance.makeJTextPane();
        assertNotNull(result);
    }
    //makeJRadioButtonMenuItem metodunun null değer döndürmemeli
    @Test
    public void testMakeJRadioButtonMenuItemisNull() {
        JRadioButtonMenuItem result = instance.makeJRadioButtonMenuItem("Test Title");
        assertNotNull(result);
    }
    
    /**
     * makeMenuBar metodu JMenuBar tipinde bir nesne üretmeli.
     */
    @Test
    public void isInstanceOfMenuBar() {
        JMenuBar result = instance.makeMenuBar();
        boolean isJMenuBar = result instanceof JMenuBar;
        assertTrue(isJMenuBar);
    }

    /**
     * makeMenu metodu JMenu tipinde bir nesne üretmeli.
     */
    @Test
    public void isInstanceOfMenu() {
        JMenu result = instance.makeMenu("Test Title");
        boolean isJMenu = result instanceof JMenu;
        assertTrue(isJMenu);
    }

    /**
     * makeJMenuItem metodu JMenuItem tipinde bir nesne üretmeli.
     */
    @Test
    public void isInstanceOfJMenuItem() {
        JMenuItem result = instance.makeJMenuItem("Test Title");
        boolean isJMenuItem = result instanceof JMenuItem;
        assertTrue(isJMenuItem);
    }

    /**
     * makeJFrame metodu JFrame tipinde bir nesne üretmeli.
     */
    @Test
    public void isInstanceOfJFrame() {
        JFrame result = instance.makeJFrame("Test Title");
        boolean isJFrame = result instanceof JFrame;
        assertTrue(isJFrame);
    }
    /**
     * makeJTextPane metodu JTextPane tipinde bir nesne üretmeli.
     */
    @Test
    public void isInstanceOfJTextPane() {
        JTextPane result = instance.makeJTextPane();
        boolean isJTextPane = result instanceof JTextPane;
        assertTrue(isJTextPane);
    }

    /**
     * makeJRadioButtonMenuItem metodu JRadioButtonMenuItem tipinde bir nesne üretmeli.
     */
    @Test
    public void isInstanceOfJRadioButtonMenuItem() {
        JRadioButtonMenuItem result = instance.makeJRadioButtonMenuItem("Test Title");
        boolean isJRadioButtonMenuItem = result instanceof JRadioButtonMenuItem;
        assertTrue(isJRadioButtonMenuItem);
    }     
    /**
     * makeJRadioButtonMenuItem metodunun aldığı isim parametresi, geri döndürülen JFrame nesnesinin
     * başlığıyla aynı olmalı.
     */
    @Test
    public void testMakeJRadioButtonMenuItemText() {
        String expText = "Test Title";
        JRadioButtonMenuItem result = instance.makeJRadioButtonMenuItem(expText);
        String menuText = result.getText();
        assertEquals(menuText, expText);
    }        
    /**
     * makeJMenuItem metodunun aldığı isim parametresi, geri döndürülen JFrame nesnesinin
     * başlığıyla aynı olmalı.
     */
    @Test
    public void testMakeJMenuItemText() {
        String expText = "Test Title";
        JMenuItem result = instance.makeJMenuItem(expText);
        String menuText = result.getText();
        assertEquals(menuText, expText);
    }
    /**
     * makeMenu metodunun aldığı isim parametresi, geri döndürülen JFrame nesnesinin
     * başlığıyla aynı olmalı.
     */
    @Test
    public void testMakeMenuText() {
        String expText = "Test Title";
        JMenu result = instance.makeMenu(expText);
        String menuText = result.getText();
        assertEquals(menuText, expText);
    }
     /**
     * makeJFrame metodu singleton pattern olduğundan oluşturulan iki değer de aynı olmalı
     */
    @Test
    public void testMakeJFrameisSingleton() {
        String expTitle = "Test Title";
        JFrame result = instance.makeJFrame(expTitle);
        JFrame anotherResult = instance.makeJFrame(expTitle);
        assertEquals(result, anotherResult);
    }
     /**
     * makeJTextPane metodu singleton pattern olduğundan oluşturulan iki değer de aynı olmalı
     */
    @Test
    public void testMakeJTextPaneisSingleton() {
        JTextPane result = instance.makeJTextPane();
        JTextPane anotherResult = instance.makeJTextPane();
        assertEquals(result, anotherResult);
    }
     /**
     * makeMenuBar metodu singleton pattern yapısında olmadığından oluşturulan iki nesne de 
     * birbirinden farklı olmalı
     */
    @Test
    public void testMakeMenuBarObjectsAreDifferent() {
        JMenuBar result = instance.makeMenuBar();
        JMenuBar anotherResult = instance.makeMenuBar();
        assertNotEquals(result, anotherResult);
    }
     /**
     * makeJMenuItem metodu singleton pattern yapısında olmadığından oluşturulan iki nesne de 
     * birbirinden farklı olmalı
     */
    @Test
    public void testMakeJMenuItemObjectsAreDifferent() {
        JMenuItem result = instance.makeJMenuItem("Test Text");
        JMenuItem anotherResult = instance.makeJMenuItem("Test Text");
        assertNotEquals(result, anotherResult);
    }
     /**
     * makeMenu metodu singleton pattern yapısında olmadığından oluşturulan iki nesne de 
     * birbirinden farklı olmalı
     */
    @Test
    public void testMakeMenuObjectsAreDifferent() {
        JMenu result = instance.makeMenu("Test Title");
        JMenu anotherResult = instance.makeMenu("Test Title");
        assertNotEquals(result, anotherResult);
    }
     /**
     * makeJRadioButtonMenuItem metodu singleton pattern yapısında olmadığından oluşturulan 
     * iki nesne de birbirinden farklı olmalı
     */
    @Test
    public void testMakeJRadioButtonMenuItemObjectsAreDifferent() {
        JRadioButtonMenuItem result = instance.makeJRadioButtonMenuItem("Test Text");
        JRadioButtonMenuItem anotherResult = instance.makeJRadioButtonMenuItem("Test Text");
        assertNotEquals(result, anotherResult);
    }
    
}
