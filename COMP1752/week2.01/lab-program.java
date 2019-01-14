package coursework;
import java.util.Scanner;
public class Coursework {
    public static void main(String[] args) {

      Scanner user_input = new Scanner(System.in);
      String name;
      System.out.print("Enter your name here: ");
      name = user_input.next();


      Scanner user_input2 =  new Scanner(System.in);
      String age;
      System.out.print("Enter your age here: ");
      age = user_input.next();
      int Age = Integer.parseInt(age);
      

      System.out.println(name + " your age is " + age + " in days it is " + Age * 365 + " days.");
      System.out.println(name + "knowing that the life span of a human on average is 85 year or 31025 day you have " + (31025 - (Age * 365)) + " day to live , good day.");
    }
  }
