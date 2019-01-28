/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author bm4904f
 */

public class Lab2 extends JFrame implements ActionListener, KeyListener {

    JPanel pnl = new JPanel(new BorderLayout());
    JLabel cenLbl = new JLabel("<html><body>Hello <b> barnabe </b></body></html>");

    public static void main(String[] args) {
        // This is required for the coursework.
        System.out.println("reach 1");
        JOptionPane.showMessageDialog(null, "barnabe ");
        Lab2 prg = new Lab2();

      }

 // Using MVC
 public Lab2() {
   System.out.println("reach 2");
    ///model();
    view();
    // controller();
    System.out.println("reach 5");
    }

    ///String textMessage = "<html><body>Bruce <b> Wayne </b></body></html>";
    ///public JLabel(String textMessage,int CENTER)
    public void addTextTry(){
        JLabel l1 = new JLabel("Bruce Wayne");
        pnl.add(l1);
      }


 private void view() {
   System.out.println("reach 3");
    Font fnt = new Font("Georgia", Font.PLAIN, 24);
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    setTitle("Coursework - barnabe");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel cen = new JPanel();
    cen.setLayout(new FlowLayout());

    String html = "<html><body>Hello <b> barnabe </b></body></html>";
    cenLbl.setFont(fnt);
    cen.add(cenLbl);
    add(BorderLayout.CENTER, cen);
    System.out.println("reach 4");

    String htmlButton = "batman true identity";
    JButton wstButton = new JButton(htmlButton);
    wstButton.setFont(fnt);
    wstButton.setActionCommand("wstBtn");
    wstButton.addActionListener(this);
    JPanel wst = new JPanel();
    wst.setLayout(new FlowLayout());
    wst.add(wstButton);
    add(BorderLayout.WEST, wst);
    // wstButton.addActionListener(new ActionListener()){
    //   // public void actionPerformed(ActionEvent ae){
    //   //
    //   // addTextTry();
    //   // pnl.revalidate();
    //   // pnl.repaint();
    //   // System.out.println("Test");
    //
    //
    // }
    setVisible(true); // Needed to ensure that the items can be seen.

    }





    /// private void controller() {
    ///    JButton Button1 = new JButton("batman secret identity");
    ///    Button1.setVerticalTextPosition(AbstractButton.CENTER);
    ///    Button1.setHorizontalTextPosition(AbstractButton.LEADING);
    ///    Button1.setMnemonic(KeyEvent.VK_D);
    ///    Button1.setActionCommand("disable");
    ///    Button1.addActionListener(this);

        ///}


    @Override
    public void actionPerformed(ActionEvent e) {
      if ("wstBtn".equals(e.getActionCommand())) {
          cenLbl.setText("Bruce Wayne");
      }
    }

    @Override
    public void keyTyped(KeyEvent e){
      // throw new UnsupportedOperationException("not supported yet.");
    }

    @Override
    public void keyPressed(KeyEvent e){
      // throw new UnsupportedOperationException("not supported yet.");
    }

    @Override
    public void keyReleased(KeyEvent e){
      // throw new UnsupportedOperationException("not supported yet.");
    }

    ///@Override
    public void model(){
      // throw new UnsupportedOperationException("not supported yet.");
    }

    ///@Override
    public void controller(){
      // throw new UnsupportedOperationException("not supported yet.");
    }



}
