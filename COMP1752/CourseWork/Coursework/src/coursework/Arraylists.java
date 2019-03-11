package coursework;


import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Arraylists {
   ArrayList<String> words = new ArrayList<String>(); 
    
    private void addword() throws IOException {
String texts = JOptionPane.showInputDialog("Write text to add!");    
words.add(texts);
Object[] result = words.toArray();

System.out.println(words); 

}
    
}
