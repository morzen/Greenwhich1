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
// import java.util.ArrayList;
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



/// This is a new class and does NOT go in Coursework.
// public class Note
// {
//     public int noteID = 0;
//     public String course = "";
//     public String dayte = "";
//     public String note = "";
//
//     public Note()
//     {
//           storeThisNote();
//     }
//     private void storeThisNote()
//     {
//         System.out.println("storeThisNote not coded yet.");
//     }
// }

public class Note {

    private String course = "";
    private String dayte = "";
    private String note = "";
    private int noteID = 0;

    public Note()
    {

    }

    public void setCourse(String c)
    {
        String crse = c;
        // Any validation goes here.
        course = crse;
    }

    public String getCourse()
    {
        // Any checking goes here.
        return course;
    }

    public void setDayte(String d)
    {
        String dt = d;
        // Any validation goes here.
        dayte = d;
    }

    public String getDayte()
    {
        // Any checking goes here.
        return dayte;
    }

    public void setNote(String n)
    {
        String nt = n;
        // Any validation goes here.
        note = nt;
    }

    public String getNote()
    {
        // Any checking goes here.
        return note;
    }

    public void setNoteID(int i)
    {
        int id = i;
        // Any validation goes here.
        noteID = id;
    }

    public int getNoteID()
    {
        // Any checking goes here.
        return noteID;
    }
}
