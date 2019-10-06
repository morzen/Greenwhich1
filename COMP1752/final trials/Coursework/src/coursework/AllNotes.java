package coursework;

import java.util.ArrayList;

/**
*
* @author bm4904f
*/
public class AllNotes {
    
    private ArrayList<Note> allNotes = new ArrayList<>();
    private CommonCode cc = new CommonCode();
    private String crse = "";
    
    AllNotes() {
        readAllNotes();
    }

    private void readAllNotes() {
        crse = "COMP1752 - Object Oriented Programming";
        addNote("The four principles of object oriented programming are A PIE.");
        addNote("This stands for Abstraction, Polymorphism, Inheritance and Encapsulation.");
    }

    public void addNote(String text) {
        Note myNote = new Note();
        myNote.setCourse(crse);
        myNote.setDayte(cc.ukDateAndTime);
        myNote.setNote(text);
        allNotes.add(myNote);
    }

    public void addNote(Note nt) {
        allNotes.add(nt);
        
        // Note that the call to the method addAllNotes() has gone.
        // This will now appear in the main program.
    }
    
    public ArrayList<Note> getAllNotes() {
        return allNotes;
    }
}
