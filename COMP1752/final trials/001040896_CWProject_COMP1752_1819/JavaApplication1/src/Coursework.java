

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import java.io.*;
import static java.lang.System.out;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Box;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniels Magonis- dm5376y, Barnabe Malandain, Jake Nelms.
 */
public class Coursework  extends JFrame implements ActionListener, KeyListener {
 
File infile =new File("Courses.txt");
File outfile =new File("Coursestemp.txt");
File Notes =new File("Notes.txt");
File NotesTemp =new File("Notestemp.txt");
            
FileInputStream instream = null;
FileOutputStream outstream = null;
 
CommonCode cc = new CommonCode();
 
JPanel pnl = new JPanel(new BorderLayout());
JTextArea txtNewNote = new JTextArea();
JTextArea txtDisplayCourseWork = new JTextArea();
JTextArea txtDisplayNotes = new JTextArea();
JComboBox courseList = new JComboBox();
JTextField search = new JTextField();


ArrayList<String> words = new ArrayList<>();
ArrayList<String> course = new ArrayList<>();
ArrayList<String> note = new ArrayList<>();
String remove = " ";  
String crse = " ";
String ENotes = " ";
StringBuffer inputBuffer = new StringBuffer();

AllNotes allNotes = new AllNotes();
Deadlines deadlines = new Deadlines();
Note notes = new Note();

// JTextField txtShowText = new JTextField(20);
 public static void main(String[] args) {
 // This is required for the coursework.
// JOptionPane.showMessageDialog(null, "Daniels Magonis - wa02");
 Coursework prg = new Coursework();
 }
public Coursework() {

    model();
 view();
 controller();
 }
   
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
 
 duplicatec();
 
 duplicaten();


 
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
        
    Course = new JMenu("Essentials");
 Course.setToolTipText("See Searched word count, Find most used Course and most used date!");
 Course.setFont(fnt);
 Course.add(makeMenuItem("Most used course name", "coursename", "coursename", fnt));
 Course.addSeparator();
 Course.add(makeMenuItem("Searched Words Count", "Count Courses", "Count Courses", fnt));
 Course.addSeparator();
 Course.add(makeMenuItem("Date", "Date", "Date", fnt));
 Course.addSeparator();
 Course.add(makeMenuItem("Add Coursework DeadLines", "Coursework", "Coursework", fnt));
 Course.addSeparator();
 Course.add(makeMenuItem("Show Coursework DeadLines","DeadLines","DeadLines",fnt));
 menuBar.add(Course);
 // This forces anything after it to the right.
 toolBar.add(Box.createHorizontalGlue());
 search.setMaximumSize(new Dimension(6900, 30));
 search.setFont(fnt);
 toolBar.add(search);
 toolBar.addSeparator();
 button = makeButton("search", "SearchKeyword",
 "Search for this text.",
 "Search");
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
        
        JButton btnSearch = new JButton("Search Word");
        btnSearch.setActionCommand("Search");
        btnSearch.addActionListener(this);
        pnlWest.add(btnSearch);
         add(pnlWest, BorderLayout.WEST);
         
          JButton btnaddword = new JButton("Add Word");
        btnaddword.setActionCommand("addword");
        btnaddword.addActionListener(this);
        pnlWest.add(btnaddword);
         add(pnlWest, BorderLayout.WEST);
        
 

        JPanel cen = new JPanel();
        cen.setLayout(new BoxLayout(cen, BoxLayout.Y_AXIS));
        cen.setBorder(BorderFactory.createLineBorder(Color.black));
        txtDisplayCourseWork.setFont(fnt);
        txtDisplayNotes.setFont(fnt);
        cen.add(txtDisplayNotes);
        cen.add(txtDisplayCourseWork);

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

        //Look for the image.
        String imgLocation = System.getProperty("user.dir")
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



private void addnote() throws SQLException {
    
    try {
       DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       Date dateobj = new Date();
       Calendar calobj = Calendar.getInstance();
       String date = df.format(calobj.getTime());
         FileWriter fw = new FileWriter("Notes.txt", true);
         PrintWriter pw = new PrintWriter(fw);
           
    
        allNotes.addNote(allNotes.getMaxID(), crse, txtNewNote.getText());
        txtNewNote.setText(" ");
        addAllNotes();

        
     } catch (IOException e) {
         out.println("ERROR!");
     }
}

private void addcoursework() throws SQLException {
    
    try {
              DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       Date dateobj = new Date();
       Calendar calobj = Calendar.getInstance();
       String date = df.format(calobj.getTime());
         FileWriter fw = new FileWriter("Deadlines.txt", true);
         PrintWriter pw = new PrintWriter(fw);
         String[] Year= {"2019", "2020", "2021", "2022", "2023"};
    String[] Month= {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
    String[] Day={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};

    JComboBox jcd = new JComboBox(Year);
    JComboBox jcm = new JComboBox(Month);
    JComboBox jcy = new JComboBox(Day);
      jcd.setEditable(true);
      jcm.setEditable(true);
      jcy.setEditable(true);
    JOptionPane.showMessageDialog( null, jcd, "Choose Year", JOptionPane.QUESTION_MESSAGE);
    JOptionPane.showMessageDialog( null, jcm, "Choose Month", JOptionPane.QUESTION_MESSAGE);
    JOptionPane.showMessageDialog( null, jcy, "Choose day", JOptionPane.QUESTION_MESSAGE);

         String year = jcd.getSelectedItem().toString();
         int y = Integer.parseInt(year);
    String month= jcm.getSelectedItem().toString();
    int m = Integer.parseInt(month) - 1;
    String day = jcy.getSelectedItem().toString();
    int d = Integer.parseInt(day);
    int SECONDS_IN_A_DAY = 24 * 60 * 60;
    Calendar thatDay = Calendar.getInstance();
    thatDay.setTime(new Date(0)); /* reset */
    thatDay.set(Calendar.DAY_OF_MONTH,d);
    thatDay.set(Calendar.MONTH,m); // 0-11 so 1 less
    thatDay.set(Calendar.YEAR, y);
    Calendar today = Calendar.getInstance();
    long diff =  thatDay.getTimeInMillis() - today.getTimeInMillis();
    long diffSec = diff / 1000;
    long days = diffSec / SECONDS_IN_A_DAY;
    long secondsDay = diffSec % SECONDS_IN_A_DAY;
    long seconds = secondsDay % 60;
    long minutes = (secondsDay / 60) % 60;
    long hours = (secondsDay / 3600); // % 24 not needed
    int dayes=(int)days;
    int houres=(int)hours;
    int min=(int)minutes;



    String coursework = year + "-" + month + "-" + day;
    int num = dayes * (24*60*60) + houres * (60*60) + min * 60 ;
    if (num <= 604800) {
        JOptionPane.showMessageDialog(rootPane," Your nearest CourseWork deadline is on  " + coursework);
    }
    System.out.println(num);
    
    
    
    
    
    
 

         
         
        deadlines.addNote(crse, coursework);
        addAllcourses();
        
     } catch (IOException e) {
         out.println("ERROR!");
     }
}

private void addAllcourses() {
 String txtNotes = "";
 for (Note n : deadlines.getAllDeadlines()) {
 txtNotes += n.getCourse() + "  ";
 txtNotes += n.getNote() + "\n";
 }
 txtDisplayCourseWork.setText(txtNotes);
 }


private void addword() throws IOException {

String texts = JOptionPane.showInputDialog("Write text to add!");      
words.add(texts);
Object[] result = words.toArray();

System.out.println(words);   
  
}

public void Search() {
     Scanner user_input = new Scanner( System.in );
        String Word;
        Word = JOptionPane.showInputDialog(" Write the word you want to search!");
        Set<String> set = new HashSet<String>(words);

        if (set.contains(Word))
        {
            JOptionPane.showMessageDialog(null, "Word is found! Proceed to editing!");
          String[] Font= {" Georgia ", " Arial "};
    String[] Backgroundcolour= {"green", "yellow", "red"};
    String[] Size={"10" , "12", "14", "40"};

    JComboBox jcd = new JComboBox(Font);
    JComboBox jcm = new JComboBox(Backgroundcolour);
    JComboBox jcy = new JComboBox(Size);
      jcd.setEditable(true);
      jcm.setEditable(true);
      jcy.setEditable(true);
    JOptionPane.showMessageDialog( null, jcd, "Set Font", JOptionPane.QUESTION_MESSAGE);
    JOptionPane.showMessageDialog( null, jcm, "Set BackGround colour", JOptionPane.QUESTION_MESSAGE);
    JOptionPane.showMessageDialog( null, jcy, "Size", JOptionPane.QUESTION_MESSAGE);

         String font = jcd.getSelectedItem().toString();
    String colour= jcm.getSelectedItem().toString();
    String sizes = jcy.getSelectedItem().toString();
    JOptionPane.showMessageDialog(this,
            "<html><font face =" + font + "size =" + sizes + " color = " + colour + ">" + Word );
}  

        
        else{
            JOptionPane.showMessageDialog(null,"String is not Found, try to add it First");
            
        }
}
private void duplicaten() {
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
private void duplicatec() {
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
private void addAllNotes() {
 String txtNotes = "";
 for (Note n : allNotes.getAllNotes()) {
 txtNotes += n.getNote() + "\n";
 }
 txtDisplayNotes.setText(txtNotes);
 }

 private void write(byte[] b,
                  int off,
                  int length)
           throws IOException{
        
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
     duplicatec();
     
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

        duplicatec();
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
    
    duplicatec();

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
         addnote();
     } catch (SQLException ex) {
         Logger.getLogger(Coursework.class.getName()).log(Level.SEVERE, null, ex);
     }
 duplicaten();

 }
if ("Search".equals(ae.getActionCommand())){ 
Search();

}

if ("addword".equals(ae.getActionCommand())){ 
 
     try {
         addword();
     } catch (IOException ex) {
         Logger.getLogger(Coursework.class.getName()).log(Level.SEVERE, null, ex);
     }
     
}
if("SearchKeyword".equals(ae.getActionCommand())) {
    String lyst = allNotes.searchAllNotesByKeyword(" ", 0, search.getText());
    txtDisplayNotes.setText(lyst);

}
if("Count Courses".equals(ae.getActionCommand())) {

     int i = 0;
     try {
            
 
        String content = new String(Files.readAllBytes(Paths.get("Notes.txt")));
        Pattern p = Pattern.compile(search.getText());
        Matcher m = p.matcher( content );
        while (m.find()) {
         i++;
        }
        String counted = Integer.toString(i);
        JOptionPane.showMessageDialog(null,"The word " + search.getText() + " appeared " + counted + " Times!");
        } catch (IOException ex) {
         Logger.getLogger(Coursework.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
if("coursename".equals(ae.getActionCommand())) {
String text;
     try {
         text = new String(Files.readAllBytes(Paths.get("Notes.txt")));
          String[] words = text.split("\\s+");
    HashMap<String, Integer> occurrences = new HashMap<String, Integer>();
    for (String word: words) {
        int value = 0;
            if(word.startsWith("COMP")){
    
    if  (occurrences.containsKey(word)) {
        value = occurrences.get(word);
    }
    occurrences.put(word, value + 1);
    }}
    Map.Entry<String,Integer> tempResult = occurrences.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .findFirst().get();
      JOptionPane.showMessageDialog(null, "Most used course = " + tempResult.getKey());
    } catch (IOException ex) {
         Logger.getLogger(Coursework.class.getName()).log(Level.SEVERE, null, ex);
     }
  }
   
if("Date".equals(ae.getActionCommand())) {
    String text;
     try {
         
         text = new String(Files.readAllBytes(Paths.get("Notes.txt")));
          String[] words = text.split("\\s+");
    HashMap<String, Integer> occurrences = new HashMap<String, Integer>();
    for (String word: words) {
        int value = 0;
            if(word.startsWith("20")){
    
    if  (occurrences.containsKey(word)) {
        value = occurrences.get(word);
    }
    occurrences.put(word, value + 1);
    }}
    Map.Entry<String,Integer> tempResult = occurrences.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .findFirst().get();
      JOptionPane.showMessageDialog(null, "Most used Date is " + tempResult.getKey());
    } catch (IOException ex) {
         Logger.getLogger(Coursework.class.getName()).log(Level.SEVERE, null, ex);
     }
  }
if("Coursework".equals(ae.getActionCommand())) {
     try {
         addcoursework();
     } catch (SQLException ex) {
         Logger.getLogger(Coursework.class.getName()).log(Level.SEVERE, null, ex);
     }

}
if("DeadLines".equals(ae.getActionCommand())) {
    addAllcourses();
}


 }
 
}







