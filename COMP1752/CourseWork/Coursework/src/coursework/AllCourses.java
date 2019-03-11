package coursework;

import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class AllCourses extends CommonCode {

    private ArrayList<Course> allCourses = new ArrayList<>();
    private String crse = "";

    AllCourses() {
        readAllCourses();
    }

    private void readAllCourses() {
        ArrayList<String> readCourses = new ArrayList<>();
        readCourses = readTextFile(appDir + "//Courses.txt");
        System.out.println(readCourses.get(0));
        if ("File not found".equals(readCourses.get(0))) {
        } else {

            allCourses.clear();
            for (String str : readCourses) {
                String[] tmp = str.split("/t");
                Course m = new Course();
                m.setCourse(tmp[0]);
                allCourses.add(m);
            }
        }
    }

    public void addCourse(String crse) {
        Course myCourse = new Course();
        myCourse.setCourse(crse);
        allCourses.add(myCourse);
        writeAllCourses();
    }

    public ArrayList<Course> getAllCourses() {
        return allCourses;
    }

    private void writeAllCourses() {
        String path = appDir + "//Courses.txt";
        ArrayList<String> writeCourse = new ArrayList<>();
        for (Course m : allCourses) {
            String tmp = m.getCourse() + "/t";
            writeCourse.add(tmp);

        }
        try {
            writeTextFile(path, writeCourse);
        } catch (IOException ex) {
            System.out.println("Problem! " + path);
        }
    }

}
