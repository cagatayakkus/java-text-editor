/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.tr.edu.ege.cagatay.TextEditor;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Stack;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import command.java.tr.edu.ege.cagatay.TextEditor.ProcessControl;
import command.java.tr.edu.ege.cagatay.TextEditor.FileReceiver;
import command.java.tr.edu.ege.cagatay.TextEditor.NewFileCommand;
import command.java.tr.edu.ege.cagatay.TextEditor.OpenWithAbsolutePathCommand;
import command.java.tr.edu.ege.cagatay.TextEditor.OpenWithFileExplorerCommand;
import command.java.tr.edu.ege.cagatay.TextEditor.SaveFileCommand;
import command.java.tr.edu.ege.cagatay.TextEditor.AlignCenterCommand;
import command.java.tr.edu.ege.cagatay.TextEditor.AlignLeftCommand;
import command.java.tr.edu.ege.cagatay.TextEditor.AlignRightCommand;
import command.java.tr.edu.ege.cagatay.TextEditor.AlignReceiver;
import command.java.tr.edu.ege.cagatay.TextEditor.CopyCommand;
import command.java.tr.edu.ege.cagatay.TextEditor.CutCommand;
import command.java.tr.edu.ege.cagatay.TextEditor.EditReceiver;
import command.java.tr.edu.ege.cagatay.TextEditor.PasteCommand;
import command.java.tr.edu.ege.cagatay.TextEditor.FindAndReplaceCommand;
import command.java.tr.edu.ege.cagatay.TextEditor.FindCommand;
import command.java.tr.edu.ege.cagatay.TextEditor.ExtrasReceiver;
import command.java.tr.edu.ege.cagatay.TextEditor.UndoCommand;
import strategy.java.tr.edu.ege.cagatay.TextEditor.ContextAlign;

/**
 *
 * @author cagatay
 */


public class TextEditorAbstractFactory {
        
    /**
     *
     */
    private static JFrame frame;
    private static JTextPane textPane;
    private static Stack textStack;
    private static ContextAlign ca;
    
    private static JRadioButtonMenuItem openOptionRBItem;
    
    public static JFrame createTextEditor(TextEditorFactory factory){
         frame = factory.makeJFrame("Text Editor"); 
         frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

         textStack = new Stack();
         textPane = factory.makeJTextPane(); 
         textPane.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void removeUpdate(DocumentEvent e) {
                
                textStack.push(textPane.getText());
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                
                textStack.push(textPane.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent arg0) {
            }
        });
        

        JMenuBar menuBar = factory.makeMenuBar();
        JMenu fileMenu = factory.makeMenu("File");
        JMenuItem newMenuItem = factory.makeJMenuItem("New");
        JMenuItem openMenuItem = factory.makeJMenuItem("Open");
        JMenuItem saveMenuItem = factory.makeJMenuItem("Save");
        ButtonGroup openOptions = new ButtonGroup();
        openOptionRBItem = factory.makeJRadioButtonMenuItem("Open with file explorer");
        openOptionRBItem.setSelected(true);
        openOptionRBItem.setMnemonic(KeyEvent.VK_R);
        openOptions.add(openOptionRBItem);
        
        
        
        
        
        newMenuItem.addActionListener((ActionEvent aActionEvent) -> {
             actionPerformed(aActionEvent);
         }); 
        openMenuItem.addActionListener((ActionEvent aActionEvent) -> {
             actionPerformed(aActionEvent);
         }); 
        saveMenuItem.addActionListener((ActionEvent aActionEvent) -> {
             actionPerformed(aActionEvent);
         });
  
        fileMenu.add(newMenuItem); 
        fileMenu.addSeparator();
        fileMenu.add(openOptionRBItem);
        
        openOptionRBItem = factory.makeJRadioButtonMenuItem("Open with path");
        openOptionRBItem.setMnemonic(KeyEvent.VK_O);
        openOptions.add(openOptionRBItem);
        
        fileMenu.add(openOptionRBItem);
        fileMenu.add(openMenuItem); 
        fileMenu.addSeparator();
        fileMenu.add(saveMenuItem); 

        JMenu editMenu = factory.makeMenu("Edit"); 
        JMenuItem cutMenuItem = factory.makeJMenuItem("Cut"); 
        JMenuItem copyMenuItem = factory.makeJMenuItem("Copy"); 
        JMenuItem pasteMenuItem = factory.makeJMenuItem("Paste"); 
        cutMenuItem.addActionListener((ActionEvent aActionEvent) -> {
             actionPerformed(aActionEvent);
         }); 
        copyMenuItem.addActionListener((ActionEvent aActionEvent) -> {
             actionPerformed(aActionEvent);
         }); 
        pasteMenuItem.addActionListener((ActionEvent aActionEvent) -> {
             actionPerformed(aActionEvent);
         }); 
  
        editMenu.add(cutMenuItem); 
        editMenu.add(copyMenuItem); 
        editMenu.add(pasteMenuItem); 
        
        JMenu alignMenu = factory.makeMenu("Align"); 
        
        JMenuItem rightMenuItem = factory.makeJMenuItem("Right");
        JMenuItem leftMenuItem = factory.makeJMenuItem("Left");
        JMenuItem centerMenuItem = factory.makeJMenuItem("Center");
        
        JMenu extrasMenu = factory.makeMenu("Extras"); 
        JMenuItem undoMenuItem = factory.makeJMenuItem("Undo");
        JMenuItem findMenuItem = factory.makeJMenuItem("Find");
        JMenuItem findAndReplaceMenuItem = factory.makeJMenuItem("Find & Replace");
        
        undoMenuItem.addActionListener((ActionEvent aActionEvent) -> {
             actionPerformed(aActionEvent);
         }); 
        findMenuItem.addActionListener((ActionEvent aActionEvent) -> {
             actionPerformed(aActionEvent);
         });
        findAndReplaceMenuItem.addActionListener((ActionEvent aActionEvent) -> {
             actionPerformed(aActionEvent);
         });
        rightMenuItem.addActionListener((ActionEvent aActionEvent) -> {
             actionPerformed(aActionEvent);
         }); 
        leftMenuItem.addActionListener((ActionEvent aActionEvent) -> {
             actionPerformed(aActionEvent);
         });
        centerMenuItem.addActionListener((ActionEvent aActionEvent) -> {
             actionPerformed(aActionEvent);
         });
       
  
        menuBar.add(fileMenu); 
        menuBar.add(editMenu); 
        menuBar.add(alignMenu);
        menuBar.add(extrasMenu);
        
        extrasMenu.add(undoMenuItem);
        extrasMenu.add(findMenuItem);
        extrasMenu.add(findAndReplaceMenuItem);
        
        
        alignMenu.add(rightMenuItem); 
        alignMenu.add(leftMenuItem); 
        alignMenu.add(centerMenuItem); 
  
        frame.setJMenuBar(menuBar); 
        frame.add(textPane); 
        frame.setSize(750, 775); 
        
        
        return frame;
    }

    public static void actionPerformed(ActionEvent e) 
    { 
        String s = e.getActionCommand(); 
        ProcessControl fileControl = new ProcessControl();
        FileReceiver file = new FileReceiver();
        EditReceiver edit = new EditReceiver();
        ExtrasReceiver extras = new ExtrasReceiver();
        AlignReceiver align = new AlignReceiver();
        switch (s) {
            case "Cut":
                CutCommand cut = new CutCommand(edit);
                fileControl.setCommand(cut);
                fileControl.fileProcess();
                break;
            case "Copy":
                CopyCommand copy = new CopyCommand(edit);
                fileControl.setCommand(copy);
                fileControl.fileProcess();
                break;
            case "Paste":
                PasteCommand paste = new PasteCommand(edit);
                fileControl.setCommand(paste);
                fileControl.fileProcess();
                break;
            case "Save":
                SaveFileCommand saveFile = new SaveFileCommand(file);
                fileControl.setCommand(saveFile);
                fileControl.fileProcess();
                break;
            case "Open":
                String content;
                if (!openOptionRBItem.isSelected()) {
                    OpenWithFileExplorerCommand openWithFileExplorer = new OpenWithFileExplorerCommand(file);
                    fileControl.setCommand(openWithFileExplorer);
                    fileControl.fileProcess();
                } else {
                    OpenWithAbsolutePathCommand openWithAbsolutePath = new OpenWithAbsolutePathCommand(file);
                    fileControl.setCommand(openWithAbsolutePath);
                    fileControl.fileProcess();
                }   break;
            case "New":
                NewFileCommand newFile = new NewFileCommand(file);
                fileControl.setCommand(newFile);
                fileControl.fileProcess();
                break;
            case "Right":
                AlignRightCommand alignRight = new AlignRightCommand(align);
                fileControl.setCommand(alignRight);
                fileControl.fileProcess();
                break;
            case "Left":
                AlignLeftCommand alignLeft = new AlignLeftCommand(align);
                fileControl.setCommand(alignLeft);
                fileControl.fileProcess();
                break;
            case "Center": 
                AlignCenterCommand alignCenter = new AlignCenterCommand(align);
                fileControl.setCommand(alignCenter);
                fileControl.fileProcess();
                break;
            case "Undo":
                UndoCommand undo = new UndoCommand(extras);
                fileControl.setCommand(undo);
                fileControl.fileProcess();
                break;
            case "Find":
                FindCommand find = new FindCommand(extras);
                fileControl.setCommand(find);
                fileControl.fileProcess();
                break;
            case "Find & Replace":
                FindAndReplaceCommand findAndReplace = new FindAndReplaceCommand(extras);
                fileControl.setCommand(findAndReplace);
                fileControl.fileProcess();
                break;
            default:
                break;
        }
    } 

    public static JFrame getFrame() {
        return frame;
    }
    public static JTextPane getTextPane() {
        return textPane;
    }
    public static Stack getTextStack() {
        return textStack;
    }

    public static ContextAlign getCa() {
        return ca;
    }
    public static JRadioButtonMenuItem getOpenOptionRBItem() {
        return openOptionRBItem;
    }
    

      
   public static void main(String[] args) { 
    String[] options = {"Default","Hacker"};
    String n = (String)JOptionPane.showInputDialog(null, "Please, select a theme to start.", 
                "Theme Selection", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    JFrame editor; 
    TextEditorFactory factory = null;
    if (n.length() > 0) { 
      if (n.equals("Default")) { 
	factory = new main.java.tr.edu.ege.cagatay.TextEditor.TextEditorFactory(); 
      } else if (n.equals("Hacker")) { 
	factory = new abstractfactoryhacker.java.tr.edu.ege.cagatay.TextEditor.HackerTextEditorFactory(); 
      }
    }
    if (factory == null) { 
      factory = new main.java.tr.edu.ege.cagatay.TextEditor.TextEditorFactory(); 
    }
    editor = createTextEditor(factory); 
    editor.show();
  }
    
}
