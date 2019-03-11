package coursework;

/**
 *
 * @author bm4904f
 */
public class Note extends CommonCode {

    private int noteID = 0;
    private String course = "";
    private String dayte = "";
    private String note = "";

//    public Note() {
//
//    }
    public Note(int nid, String crs, String dt, String nt) {
        setNoteID(nid);
        setCourse(crs);
        setDayte(dt);
        setNote(nt);
    }

    public Note(int max, String crs, String nt) {
        setNoteID(max);
        setCourse(crs);
        setDayte();
        setNote(nt);
    }

    Note() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
    public void setNoteID(int n) {
        int nid = n;
        // Any validation goes here.
        noteID = nid;
    }

    public void setCourse(String c) {
        String crse = c;
        // Any validation goes here.
        course = crse;
    }

    public int getNoteID() {

        return noteID;
    }

    public String getCourse() {
        // Any checking goes here.
        return course;
    }

    public void setDayte() {
        dayte = orderedDate;
    }

    public void setDayte(String d) {
        dayte = d;
    }

    public String getDayte() {
        return dayte;
    }

    public void setNote(String n) {
        // Any validation goes here.
        note = n;
    }

    public String getNote() {
        // Any checking goes here.
        return note;
    }
}

//public class Note /*extends CommonCode*/ {
//    private String course = "";
//    private String dayte = "";
//    private String note = "";
//    private int noteID = 0;
//    
//    public Note() {
//        
//    }
//
//    public void setCourse(String c) {
//        String crse = c;
//        // Any validation goes here.
//        course = crse;
//    }
//
//    public String getCourse() {
//        // Any checking goes here.
//        return course;
//    }
//
////    public void setDayte(String d) {
////        String dt = d;
////        // Any validation goes here.
////        dayte = d;
////    }
//
//    
//    
//    public String getDayte() {
//        // Any checking goes here.
//        return dayte;
//    }
//
//    public void setNote(String n) {
//        String nt = n;
//        // Any validation goes here.
//        note = nt;
//    }
//
//    public String getNote() {
//        // Any checking goes here.
//        return note;
//    }
//
//    public void setNoteID(int i) {
//        int id = i;
//        // Any validation goes here.
//        noteID = id;
//    }
//
//    public int getNoteID() {
//        // Any checking goes here.
//        return noteID;
//    }
//
//    void setDayte() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//}
