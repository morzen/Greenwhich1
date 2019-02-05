package tuto4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
///
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
///
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.JTextField;




/**
 *
 * @author bm4904f
 */



public class Tuto4 extends JFrame implements ActionListener, KeyListener {

ArrayList A = new ArrayList();




public static void main(String[] args) {
  Tuto4 prg = new Tuto4();

  }

public Tuto4() {
  model();
  view();
  controller();
}


JPanel pnl = new JPanel(new BorderLayout());
JTextArea txtNewNote = new JTextArea();
JTextArea txtDisplayNotes = new JTextArea();
ArrayList<String> note = new ArrayList<>();



protected JMenuItem makeMenuItem(
    String txt,
    String actionCommand,
    String toolTipText,
    Font fnt) {
JMenuItem mnuItem = new JMenuItem();
mnuItem.setText(txt);
mnuItem.setActionCommand(actionCommand);
mnuItem.setToolTipText(toolTipText);
mnuItem.setFont(fnt);
mnuItem.addActionListener(this);
return mnuItem;
}





    protected JButton makeButton(
            String imageName,
            String actionCommand,
            String toolTipText,
            String altText) {

        //Create and initialize the button.
        JButton button = new JButton();
        button.setToolTipText(toolTipText);
        button.setActionCommand(actionCommand);
        button.addActionListener(this);
        String fs = System.getProperty("file.seperator");

        //Look for the image.
        String imgLocation = System.getProperty("user.dir")
                //+ fs + "icons" + fs
                + "/icons/"
                + imageName
                + ".png";

        File fyle = new File(imgLocation);
        if (fyle.exists() && !fyle.isDirectory()) {
            // image found
            Icon img;
            img = new ImageIcon(imgLocation);
            button.setIcon(img);
            // image NOT found
            button.setText(altText);
            // System.err.println("Resource not found: " + imgLocation);
        }

        return button;
      }






    private void view() {
        Font fnt = new Font("Georgia", Font.PLAIN, 24);

        JMenuBar menuBar = new JMenuBar();
        JMenu note = new JMenu();

        note = new JMenu("File");
        note.setToolTipText("Note tasks");
        note.setFont(fnt);

        note.add(makeMenuItem("New", "NewNote", "Create a new note.", fnt));
        note.addSeparator();

        note.add(makeMenuItem("Close", "Close", "Clear the current note.", fnt));

        menuBar.add(note);
        menuBar.add(makeMenuItem("Exit", "Exit", "Close this program", fnt));

        this.setJMenuBar(menuBar);

        JToolBar toolBar = new JToolBar("HORIZONTAL");
        // Setting up the ButtonBar

        JButton button = null;
        button = makeButton("Create", "NewNote",
                "Create a new note.",
                "New");
        toolBar.add(button);

        toolBar.addSeparator();

        button = makeButton("closed door", "Close",
                "Close this note.",
                "Close");
        toolBar.add(button);

        toolBar.addSeparator();

        button = makeButton("exit", "Exit",
                "Exit from this program.",
                "Exit");
        toolBar.add(button);



        add(toolBar, BorderLayout.NORTH);

        JPanel pnlWest = new JPanel();
        pnlWest.setLayout(new BoxLayout(pnlWest, BoxLayout.Y_AXIS));
        pnlWest.setBorder(BorderFactory.createLineBorder(Color.black));

        txtNewNote.setFont(fnt);
        pnlWest.add(txtNewNote);

        //Icon icn = new ImageIcon("\\icons\\exit.png");
        // JButton btnAddNote = new JButton(icn);
        JButton btnAddNote = new JButton("Add note");
        //btnAddNote.setActionCommand(icn);
        btnAddNote.setActionCommand("NewNote");
        btnAddNote.addActionListener(this);
        pnlWest.add(btnAddNote);

        add(pnlWest, BorderLayout.WEST);

        JPanel cen = new JPanel();
        cen.setLayout(new BoxLayout(cen, BoxLayout.Y_AXIS));
        cen.setBorder(BorderFactory.createLineBorder(Color.black));
        txtDisplayNotes.setFont(fnt);
        cen.add(txtDisplayNotes);

        add(cen, BorderLayout.CENTER);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Coursework - Barnabe Malandain");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);  // Needed to ensure that the items can be seen.
    }








 private void model() {
     note.add("Arrays are of fixed length and are inflexible.");
     note.add("ArraysList can be added to and items can be deleted.");
 }



 private void controller() {
     addAllNotes();
 }




 private void addNote(String text) {
     note.add(txtNewNote.getText());
     addAllNotes();
 }



 private void addAllNotes() {
     String allNotes = "";

     for(String n: note) {
         allNotes += n + "\n";
     }

     txtDisplayNotes.setText(allNotes);
 }










      @Override
      public void actionPerformed(ActionEvent ae) {
          // if ("NewNote".equals(ae.getActionCommand())) {
          //     txtShowText.setText("this is a note");
          // }
          // if ("Close".equals(ae.getActionCommand())) {
          //     txtShowText.setText("");
          // }
          if ("Exit".equals(ae.getActionCommand())) {
              System.exit(0);
          }
          if ("NewPage".equals(ae.getActionCommand())) {

          }
          //
          // if ("java".equals(ae.getActionCommand())) {
          //     txtShowText.setText("praise andy");
          // }
          //
          // if ("SmartSystem".equals(ae.getActionCommand())) {
          //     txtShowText.setText("peter is great ");
          // }
          //
          // if ("database".equals(ae.getActionCommand())) {
          //     txtShowText.setText("haven't learn anything so far");
          // }
          //
          // if ("math".equals(ae.getActionCommand())) {
          //     txtShowText.setText("sleeping ");
          // }
    }

       @Override
       public void keyTyped(KeyEvent e){
         throw new UnsupportedOperationException("not supported yet.");
       }
      //
      @Override
      public void keyPressed(KeyEvent e){
        throw new UnsupportedOperationException("not supported yet.");
      }
      //
      @Override
      public void keyReleased(KeyEvent e){
        throw new UnsupportedOperationException("not supported yet.");
       }



      //
       // @Override
       // public void model(){
       //   throw new UnsupportedOperationException("not supported yet.");
       // }
       //
       // @Override
       // public void controller(){
       //   throw new UnsupportedOperationException("not supported yet.");
       // }








 } ///THE END
