package week2_05;
//
// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;
// ///
// import java.awt.BorderLayout;
// import java.awt.Container;
//
// import javax.swing.JButton;
// import javax.swing.JComboBox;
// import javax.swing.JFrame;
// import javax.swing.JScrollPane;
// import javax.swing.JTextArea;
// import javax.swing.JToolBar;
// ///
// import java.awt.BorderLayout;
// import java.awt.Color;
// import java.awt.FlowLayout;
// import java.awt.Font;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.awt.event.KeyEvent;
// import java.awt.event.KeyListener;
// import java.io.File;
import java.util.ArrayList;
// import javax.swing.BorderFactory;
// import javax.swing.BoxLayout;
// import javax.swing.Icon;
// import javax.swing.ImageIcon;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JMenu;
// import javax.swing.JMenuBar;
// import javax.swing.JMenuItem;
// import javax.swing.JPanel;
// import javax.swing.JTextArea;
// import javax.swing.JToolBar;
// import javax.swing.JTextField;

//import week2_05.*;















public class AllNotes {

    //private ArrayList<Note> allNotes = new ArrayList<>();
    //public int max = 0;
    private CommonCode cc = new CommonCode();
    private String crse = "";

    AllNotes()
    {
        readAllNotes();
    }

    private void readAllNotes()
    {
        crse = "COMP1752 - Object Oriented Programming";
        addNote("The four principles of object oriented programming are A PIE.");
        addNote("This stands for Abstraction, Polymorphism, Inheritance and Encapsulation.");
    }

    // private void readAllNotes()
    // {
    //     System.out.println("readAllNotes has not been coded yet.");
    // }

    // public void addNote(String text)
    // {
    //     Note myNote = new Note();
    //     myNote.setCourse(crse);
    //     myNote.setDayte(cc.ukDateAndTime);
    //     myNote.setNote(text);
    //     allNotes.add(myNote);
    // }
    //
    // public void addNote(Note nt)
    // {
    //     allNotes.add(nt);
    //
    //     // Note that the call to the method addAllNotes() has gone.
    //     // This will now appear in the main program.
    // }
    //
    // public ArrayList<Note> getAllNotes()
    // {
    //     return allNotes;
    // }
}
