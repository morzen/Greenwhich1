
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
public class Deadlines extends CommonCode {
    private ArrayList<Note> Deadlines = new ArrayList<>();
    private String crse = "";
    private int maxID = 0;
         DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       Date dateobj = new Date();
       Calendar calobj = Calendar.getInstance();
       String date = df.format(calobj.getTime());

    Deadlines() {
        readAllDeadlines();
    }

    private void readAllDeadlines() {
        ArrayList<String> readNotes = new ArrayList<>();
        readNotes = readTextFile(appDir + "\\Deadlines.txt");
        System.out.println(readNotes.get(0));
        if ("File not found".equals(readNotes.get(0))) {
        } else {
            Deadlines.clear();
            for (String str : readNotes) {
                String[] tmp = str.split("\t");
                Note n = new Note();
                n.setCourse(tmp[0]);
                n.setDayte(tmp[1]);
                n.setNote(tmp[2]);
                Deadlines.add(n);
            }
        }
    }

     public void addNote(String course, String note) {
        Note myNote = new Note(course, date, note);
        Deadlines.add(myNote);
        writeAllNotes();
    }

    public ArrayList<Note> getAllDeadlines() {
        return Deadlines;
    }

    private void writeAllNotes() {
        String path = appDir + "\\Deadlines.txt";
        ArrayList<String> writeNote = new ArrayList<>();
        for (Note n : Deadlines) {
            String tmp = n.getCourse() + "\t";
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
        if (i == Deadlines.size()) {
            return noteList;
        }
        if (Deadlines.get(i).getNote().contains(s)) {
            noteList += Deadlines.get(i).getNote() + "\n";

        }

        return searchAllNotesByKeyword(noteList, i + 1, s);

    }

    

    
    }
    



