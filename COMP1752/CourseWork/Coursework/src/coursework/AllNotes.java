package coursework;

//import coursework.Note.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author bm4904f
 **/
public class AllNotes extends CommonCode {

    
    private ArrayList<Note> allNotes = new ArrayList<>();
    private CommonCode cc = new CommonCode();
    private String crse = "";
    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    Date dateobj = new Date();
    Calendar calobj = Calendar.getInstance();
    String datez = df.format(calobj.getTime());

    private int maxID = 0;

    AllNotes() {
        readAllNotes();
    }

    private void readAllNotes() {
        ArrayList<String> readNotes = new ArrayList<>();
        readNotes = readTextFile(appDir + "/Notestemp.txt");
        System.out.println(readNotes.get(0));
        if ("File not found".equals(readNotes.get(0))) {
        } else {
            allNotes.clear();
            for (String str : readNotes) {
                String[] tmp = str.split("\t");
                Note n = new Note();
                n.setNoteID(Integer.parseInt(tmp[0]));
                n.setCourse(tmp[1]);
                n.setDayte(tmp[2]);
                n.setNote(tmp[3]);
                allNotes.add(n);
            }
        }

//        crse = "COMP1752 - Object Oriented Programming";
//        addNote("The four principles of object oriented programming are A PIE.");
//        addNote("This stands for Abstraction, Polymorphism, Inheritance and Encapsulation.");
    }

//    public void addNote(int noteID, String course, String note) {
//        Note myNote = new Note();
//        myNote.setNoteID(noteID);
//        myNote.setCourse(course);
//        myNote.setDayte();
//        myNote.setNote(note);
//        allNotes.add(myNote);
//        writeAllNotes();
// }
    
    public void addNote(int maxID, String course, String note) {
        Note myNote = new Note(maxID, course, note);
        allNotes.add(myNote);
        writeAllNotes();
    }

    //int i = 0;
    public String searchAllNotesByKeyword(String noteList, String s) {
        int i = 0;
        while (i < allNotes.size()) {
            if (allNotes.get(i).getNote().contains(s)) {
                noteList += allNotes.get(i).getNote() + "\n";
            }
            i++;
        }
        return noteList;
    }

    public ArrayList<Note> getAllNotes() {
        return allNotes;
    }

    public int getMaxID() {
        maxID++;
        return maxID;
    }

//    public void addNote(Note nt) {
//        allNotes.add(nt);
//        
//        // Note that the call to the method addAllNotes() has gone.
//        // This will now appear in the main program.
//    }
    private void writeAllNotes() {
        String path = appDir + "\\Notestemp.txt";
        ArrayList<String> writeNote = new ArrayList<>();
        for (Note n : allNotes) {
            String tmp = n.getNoteID() + "\t";
            tmp += n.getCourse() + "\t";
            tmp += n.getDayte() + "\t";
            tmp += n.getNote();
            writeNote.add(tmp);

        }
        try {
            writeTextFile(path, writeNote);
        } catch (IOException ex) {
            System.out.println("Problem! " + path);
        }
    }

   

    
    /*public ArrayList<Note> getAllNotes(){
    return allNotes;
    }*/
}
