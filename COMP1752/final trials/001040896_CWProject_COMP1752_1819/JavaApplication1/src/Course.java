/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Course extends CommonCode {
 private String crse = "";


 public Course() {

 }

 public void setCourse(String m) {
 // Any validation goes here.
 crse = m;
 }
 public String getCourse() {
 // Any checking goes here.
 return crse;
 }
}
