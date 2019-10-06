
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dm5376y
 */
public class Arraylists {
   ArrayList<String> words = new ArrayList<String>(); 
    
    private void addword() throws IOException {
String texts = JOptionPane.showInputDialog("Write text to add!");    
words.add(texts);
Object[] result = words.toArray();

System.out.println(words); 

}
    
}
