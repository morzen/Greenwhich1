package coursework;

import javax.swing.JComboBox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
// import AllNotes;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
*
* @author bm4904f
*/

public class Coursework extends JFrame implements ActionListener, KeyListener {
    
    File infile =new File("Courses.txt");
    File outfile =new File("Coursestemp.txt");
    File Notes =new File("Notes.txt");
    File NotesTemp =new File("Notestemp.txt");
            
    FileInputStream instream = null;
    FileOutputStream outstream = null;
    
    CommonCode cc = new CommonCode();
    
    JPanel pnl = new JPanel(new BorderLayout());
    JTextArea txtNewNote = new JTextArea();
    JTextArea txtDisplayNotes = new JTextArea();
    JComboBox courseList = new JComboBox();
    
    ArrayList<String> note = new ArrayList<>();
    ArrayList<String> course = new ArrayList<>();
    String total = "0";
    String remove = " ";  
    String crse = " ";
    String ENotes = " ";
    StringBuffer inputBuffer = new StringBuffer();

    AllNotes allNotes = new AllNotes();
    Note notes = new Note();






   


         int id = Integer.parseInt(total.trim());
         int i = 1;

    

    public static void main(String[] args) {
        Coursework prg = new Coursework();
    }

    public Coursework() {
        model();
        view();
        controller();
    }


//    @Override
//    public void actionPerformed(ActionEvent ae) {
//         if ("NewNote".equals(ae.getActionCommand())) {
//             txtShowText.setText("this is a note");
//         }
//         if ("Close".equals(ae.getActionCommand())) {
//             txtShowText.setText("");
//         }
//        if ("Course".equals(ae.getActionCommand())) {
//            crse = courseList.getSelectedItem().toString();
//            System.out.println(crse);
//        }
//        if ("Exit".equals(ae.getActionCommand())) {
//            System.exit(0);
//        }
//        if ("NewPage".equals(ae.getActionCommand())) {
//
//        }
//    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped not coded yet");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed not coded yet");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("keyReleased not coded yet");
    }


    private void model() {
        try {
     
     FileReader fr = new FileReader ("Courses.txt");
     BufferedReader br = new BufferedReader(fr);
     String crse;
     while ((crse = br.readLine()) != null) {
         course.add(crse);
     }
     
     br.close();
     
 }  catch (IOException e) {
     out.println("File not Found");
 }
 
 try {
    	    File infile =new File("Courses.txt");
    	    File outfile =new File("Coursestemp.txt");
 
    	    instream = new FileInputStream(infile);
    	    outstream = new FileOutputStream(outfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    /*copying the contents from input stream to
    	     * output stream using read and write methods
    	     */
    	    while ((length = instream.read(buffer)) > 0){
    	    	outstream.write(buffer, 0, length);
    	    }

    	    //Closing the input/output file streams
    	    instream.close();
    	    outstream.close();

 

}catch(IOException ioe){
    		ioe.printStackTrace();
    
} 
 
 try {
    	    File infile =new File("Notes.txt");
    	    File outfile =new File("Notestemp.txt");
 
    	    instream = new FileInputStream(outfile);
    	    outstream = new FileOutputStream(infile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;

    	    while ((length = instream.read(buffer)) > 0){
    	    	outstream.write(buffer, 0, length);
    	    }

 
    	    instream.close();
    	    outstream.close();

    	  



}catch(IOException ioe){
    		ioe.printStackTrace();
    
} 


 
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
        menuBar.add(makeMenuItem("Exit", "Exit", "Close this program", fnt));


        // This will add each course to the combobox
        for (String crse : course) {
            courseList.addItem(crse);
        }
        courseList.setFont(fnt);
        courseList.setMaximumSize(courseList.getPreferredSize());
        courseList.addActionListener(this);
        courseList.setActionCommand("Course");
        menuBar.add(courseList);

        JMenu Course = new JMenu();
        Course = new JMenu("Course");
        Course.setToolTipText("Course Names");
        Course.setFont(fnt);
        Course.add(makeMenuItem("Add Course", "add", "Add a Course", fnt));
        Course.add(makeMenuItem("Amend Course", "amend", "Amend Course", fnt));
        Course.add(makeMenuItem("Delete Course", "delete", "Delete Course", fnt));
        menuBar.add(Course);
        pnlTop.add(menuBar);
        this.setJMenuBar(menuBar);
        JToolBar toolBar = new JToolBar();
               // Setting up the ButtonBar
               JButton button = null;
               button = makeButton("Create", "NewNote",
                       "Create a new note.",
                       "New");
               toolBar.add(button);
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

               JButton btnAddNote = new JButton("Add note");
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
               setTitle("Coursework - Daniels Magonis");
               setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

               setVisible(true);  // Needed to ensure that the items can be seen.



           }

    private void controller() {
        addAllNotes();
    }

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
        } else {
            // image NOT found
            button.setText(altText);
            System.err.println("Resource not found: " + imgLocation);
        }

        return button;
    }

    private void addNote(String text) {
        note.add(txtNewNote.getText());
        addAllNotes();
    }

    private void addAllNotes() {
        String notes = "";

        for(Note n: allNotes.getAllNotes()) {
            notes += n.getNote() + "\n";
        }

        txtDisplayNotes.setText(notes);
    }
    
    
    private void write(byte[] b,
                  int off,
                  int length)
           throws IOException{
        
    }
    

    private String getDateAndTime() {
        String UK_DATE_FORMAT_NOW = "dd-MM-YYYY HH:mm:ss";
        String ukDateAndTime;
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat uksdf = new SimpleDateFormat(UK_DATE_FORMAT_NOW);
        ukDateAndTime = uksdf.format(cal.getTime());
        return ukDateAndTime;
    }
@Override
 public void actionPerformed(ActionEvent ae) {
 if ("add".equals(ae.getActionCommand())) {
  
     try {
         
         FileWriter fw = new FileWriter("Courses.txt", true);
         PrintWriter pw = new PrintWriter(fw);
        
             crse = JOptionPane.showInputDialog("Write course name to add!");
             pw.println(crse);
             pw.close();
             File CourseFile = new File(crse);
        courseList.addItem(crse);
        courseList.setSelectedItem(crse);
             
               
     } catch (IOException e) {
     out.println("ERROR!");

     
     }
     
     try {
    	    File infile =new File("Courses.txt");
    	    File outfile =new File("Coursestemp.txt");
 
    	    instream = new FileInputStream(infile);
    	    outstream = new FileOutputStream(outfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    
    	    while ((length = instream.read(buffer)) > 0){
    	    	outstream.write(buffer, 0, length);
    	    }

    
    	    instream.close();
    	    outstream.close();

    	    
 

}catch(IOException ioe){
    		ioe.printStackTrace();
    
} 
     
 }
 
 if ("amend".equals(ae.getActionCommand())) {
 
     String rename = JOptionPane.showInputDialog("Rename a file:");
     String item = courseList.getSelectedItem().toString();
     
        String FileContent = "";
        String sCurrentLine = "Courses.txt ";
        
        
      
        try {
      
            BufferedReader reader = new BufferedReader(new FileReader(outfile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(infile));
            String currentReadingLine = reader.readLine();
            
            while (currentReadingLine != null) {
                FileContent += currentReadingLine + System.lineSeparator();
                currentReadingLine = reader.readLine();
                
            }
            
            String modifiedFileContent = FileContent.replaceAll(item, rename);
            
            
            writer.write(modifiedFileContent);
              
            courseList.removeItem(item);
              courseList.addItem(rename);
              courseList.setSelectedItem(rename);
             
              reader.close();
              writer.close();
      
            } catch (IOException e) {
                   out.println("ERROR!");
            }

         try {
    	    File infile =new File("Courses.txt");
    	    File outfile =new File("Coursestemp.txt");
 
    	    instream = new FileInputStream(infile);
    	    outstream = new FileOutputStream(outfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	  
    	    while ((length = instream.read(buffer)) > 0){
    	    	outstream.write(buffer, 0, length);
    	    }

    	    instream.close();
    	    outstream.close();

    	    
 

}catch(IOException ioe){
    		ioe.printStackTrace();
    
}
 }
    
          
 
 


 
if ("delete".equals(ae.getActionCommand())) {
    
    try {
       FileReader fr = new FileReader(outfile);
     BufferedReader br = new BufferedReader(new FileReader(infile));
     BufferedWriter bw = new BufferedWriter(new FileWriter(outfile));
     
     while ((crse = br.readLine()) != null) {
         remove = courseList.getSelectedItem().toString();
              
         String trimline = crse.trim();
         if(trimline.equals(remove)) continue;
            bw.write(crse + "\n");
         
        
}
 bw.close(); 
 br.close();
 fr.close();

 Files.move(outfile.toPath(), infile.toPath(), StandardCopyOption.REPLACE_EXISTING);
 
 courseList.removeItem(remove);


     } catch (IOException e) { 
         out.println("ERROR!");
     
     }
    
    try {
    	    File infile =new File("Courses.txt");
    	    File outfile =new File("Coursestemp.txt");
 
    	    instream = new FileInputStream(infile);
    	    outstream = new FileOutputStream(outfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;

    	    while ((length = instream.read(buffer)) > 0){
    	    	outstream.write(buffer, 0, length);
    	    }

 
    	    instream.close();
    	    outstream.close();

    	    



}catch(IOException ioe){
    		ioe.printStackTrace();
    
} 

}
 
 
 if ("Exit".equals(ae.getActionCommand())) {
  System.exit(0);
 } 
 if ("Course".equals(ae.getActionCommand())) {
crse = courseList.getSelectedItem().toString();
System.out.println(crse);
}
 if ("NewNote".equals(ae.getActionCommand())){ 
     
     
    try {
   
         FileWriter fw = new FileWriter("Notes.txt", true);
         PrintWriter pw = new PrintWriter(fw);
         String notes = " ";
         id += i;
         Note nt = new Note();
        nt.setNoteID(id);
        nt.setDayte(getDateAndTime());
        nt.setCourse(crse);
        nt.setNote(txtNewNote.getText());
        allNotes.addNote(nt.getNoteID(), nt.getCourse(), nt.getNote());
        notes = txtNewNote.getText();
        txtNewNote.setText(" ");
        txtDisplayNotes.setText(id + "   " +  crse + "   " + notes);
         
        pw.close();
        
     } catch (IOException e) {
         out.println("ERROR!");
     }
 try {
    	    File infile =new File("Notes.txt");
    	    File outfile =new File("Notestemp.txt");
 
    	    instream = new FileInputStream(outfile);
    	    outstream = new FileOutputStream(infile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;

    	    while ((length = instream.read(buffer)) > 0){
    	    	outstream.write(buffer, 0, length);
    	    }

 
    	    instream.close();
    	    outstream.close();




}catch(IOException ioe){
    		ioe.printStackTrace();
    
} 

 }



 } }



