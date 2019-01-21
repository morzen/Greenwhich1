/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

/**
 *
 * @author bm4904f
 */
public class Coursework extends JFrame implements ActionListener, KeyListener {

    JPanel pnl = new JPanel(new BorderLayout());

 public static void main(String[] args) {
    // This is required for the coursework.
    JOptionPane.showMessageDialog(null, "barnabe - wa02");
    Coursework prg = new Coursework();
 }
 // Using MVC
 public Coursework() {
    model();
    view();
    controller();
 }
 private void view() {
    Font fnt = new Font("Georgia", Font.PLAIN, 24);
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    setTitle("Coursework - barnabe");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel cen = new JPanel();
    cen.setLayout(new FlowLayout());

    String html = "<html><body>Hello <b>Andy</b></body></html>";
    JLabel cenLbl = new JLabel(html);
    cenLbl.setFont(fnt);
    cen.add(cenLbl);
    add(BorderLayout.CENTER, cen);
    
    setVisible(true); // Needed to ensure that the items can be seen.
 }
