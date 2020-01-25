/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author shivibhatt
 */


class Student_3{
    int id;
    String name;
  
        
    }
    

public class TestStudent3 {
      public static void main(String args[]){
        Student_3 s1 = new Student_3();
        Student_3 s2 = new Student_3();
        s1.id = 101;
        s1.name = "Shivi";
        s2.id = 102;
        s2.name = "Bhatt";
          System.out.println("ID :" + s1.id);
          System.out.println("name :" + s1.name);
          System.out.println("ID :" + s2.id);
          System.out.println("name :" + s2.name);
    }
}
