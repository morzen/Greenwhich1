/**
 *
 * @author Daniels Magonis- dm5376y, Barnabe Malandain, Jake Nelms.
 */




public class Note extends CommonCode {
 private int noteID = 0;
 private String course = "";
 private String dayte = "";
 private String note = "";


 public Note() {

 }
 public Note(int nid, String crs, String dt, String nt) {
 setNoteID(nid);
 setCourse(crs);
 setDayte(dt);
 setNote(nt);
}
public Note(int maxID, String crs, String nt) {
 setNoteID(maxID);
 setCourse(crs);
 setDayte();
 setNote(nt);
}
public Note(String course, String nt) {
 setCourse(course);
 setNote(nt);
}

    Note(String course, String date, String note) {
 setCourse(course);
 setDayte(date);
 setNote(note);
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