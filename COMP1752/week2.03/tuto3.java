
package tuto3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author bm4904f
 */



public class Tuto3 extends JFrame implements ActionListener, KeyListener {






public static void main(String[] args) {
  Tuto3 prg = new Tuto3();

}

public Tuto3() {
  view();
}


JPanel pnl = new JPanel(new BorderLayout());
JTextField txtShowText = new JTextField(20);


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





private void view() {
         Font fnt = new Font("Georgia", Font.PLAIN, 24);
         JPanel pnlTop = new JPanel();
         JMenuBar menuBar = new JMenuBar();
         JMenu note = new JMenu();

         note = new JMenu("Note");

         note.setToolTipText("Note tasks");
         note.setFont(fnt);
         note.add(makeMenuItem("New", "NewNote", "Create a new note.", fnt));
         note.addSeparator();
         note.add(makeMenuItem("Close", "Close", "Clear the current note.", fnt));

         menuBar.add(note);


         pnlTop.add(menuBar);
         add(pnlTop, BorderLayout.NORTH);

         JMenu course = new JMenu();

         course = new JMenu("courses");

         course.setToolTipText("different courses");
         course.setFont(fnt);
         course.add(makeMenuItem("COMP1752", "NewFrame", "andy wicks", fnt));
         course.addSeparator();
         course.add(makeMenuItem("COMP1771", "NewFrame", "peter smith", fnt));
         course.addSeparator();
         course.add(makeMenuItem("COMP1713", "NewFrame", "simon scola", fnt));
         course.addSeparator();
         course.add(makeMenuItem("MATH1111", "", "yvonne fryer", fnt));
         menuBar.add(course);



         menuBar.add(makeMenuItem("Exit", "Exit", "Close this program", fnt));

         JPanel pnlWest = new JPanel(new FlowLayout());
         JButton btnShowText = new JButton("Show note");

         btnShowText.setActionCommand("NewNote");
         btnShowText.addActionListener(this);

         pnlWest.add(btnShowText);
         pnlWest.add(txtShowText);

         add(pnlWest, BorderLayout.WEST);

         setExtendedState(JFrame.MAXIMIZED_BOTH);
         setTitle("Coursework - barnabe for COMP1752 week2.03");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         JPanel cen = new JPanel();
         cen.setLayout(new FlowLayout());
         String html = "<html><body> Hello  barnabe </body></html>";
         JLabel cenLbl = new JLabel(html);
         cenLbl.setFont(fnt);
         cen.add(cenLbl);
         add(BorderLayout.CENTER, cen);



         setVisible(true);  // Needed to ensure that the items can be seen.

     }










     @Override
     public void actionPerformed(ActionEvent ae) {
         if ("NewNote".equals(ae.getActionCommand())) {
             txtShowText.setText("This is a note.");
         }
         if ("Close".equals(ae.getActionCommand())) {
             txtShowText.setText("");
         }
         if ("Exit".equals(ae.getActionCommand())) {
             System.exit(0);
         }
         if ("NewPage".equals(ae.getActionCommand())) {

         }
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


}
