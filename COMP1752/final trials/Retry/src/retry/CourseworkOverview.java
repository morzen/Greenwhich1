/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retry;

/**
 *
 * @author barnabe
 */
import java.util.ArrayList;

public class CourseworkOverview {
    public ArrayList<CourseworkItem> courseworkOverview = new ArrayList<>();
    public int max = 0;
    public CourseworkOverview() {
        readCourseworkOverview();
    }
    
    private void readCourseworkOverview() {
        System.out.println("readCourseworkOverview has not been coded yet.");
    }
    
}
