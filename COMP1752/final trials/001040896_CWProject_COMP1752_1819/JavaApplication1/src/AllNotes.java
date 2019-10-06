
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Daniels Magonis- dm5376y, Barnabe Malandain, Jake Nelms.
 */
public class AllNotes extends CommonCode {

    private ArrayList<Note> allNotes = new ArrayList<>();
    private String crse = "";
    private int maxID = 0;
         DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       Date dateobj = new Date();
       Calendar calobj = Calendar.getInstance();
       String date = df.format(calobj.getTime());

    AllNotes() {
        readAllNotes();
    }

    private void readAllNotes() {
        ArrayList<String> readNotes = new ArrayList<>();
        readNotes = readTextFile(appDir + "\\Notestemp.txt");
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
    }

    public void addNote(int maxID, String course, String note) {
        Note myNote = new Note(maxID, course, date, note);
        allNotes.add(myNote);
        writeAllNotes();
    }

    public ArrayList<Note> getAllNotes() {
        return allNotes;
    }

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

    public String searchAllNotesByKeyword(String noteList, int i, String s) {
        if (i == allNotes.size()) {
            return noteList;
        }
        if (allNotes.get(i).getNote().contains(s)) {
            noteList += allNotes.get(i).getNote() + "\n";

        }

        return searchAllNotesByKeyword(noteList, i + 1, s);

    }


    public int getMaxID() throws FileNotFoundException{
int newID = 0; 
        Scanner fileToRead = new Scanner(new File("Notes.txt"));
    int max = 0;  
    boolean bFirstTime = true; 
    double curr; 
    while (fileToRead.hasNext()) { 
        if (fileToRead.hasNextDouble()) {
            curr = fileToRead.nextDouble(); 
            if (bFirstTime) {
                max = (int) curr;
                bFirstTime = false;
            } else {
                max = (int) Math.max(max,curr);
            }
        } else {
            fileToRead.next();
        }   
         newID = max + 1;
        
            
    }return newID;
    }
    
}

