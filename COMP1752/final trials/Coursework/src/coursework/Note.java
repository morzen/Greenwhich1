package coursework;

/**
*
* @author bm4904f
*/

public class Note {
    private String course = "";
    private String dayte = "";
    private String note = "";
    private int noteID = 0;
    
    public Note() {
        
    }

    public void setCourse(String c) {
        String crse = c;
        // Any validation goes here.
        course = crse;
    }

    public String getCourse() {
        // Any checking goes here.
        return course;
    }

    public void setDayte(String d) {
        String dt = d;
        // Any validation goes here.
        dayte = d;
    }

    public String getDayte() {
        // Any checking goes here.
        return dayte;
    }

    public void setNote(String n) {
        String nt = n;
        // Any validation goes here.
        note = nt;
    }

    public String getNote() {
        // Any checking goes here.
        return note;
    }

    public void setNoteID(int i) {
        int id = i;
        // Any validation goes here.
        noteID = id;
    }

    public int getNoteID() {
        // Any checking goes here.
        return noteID;
    }
}
