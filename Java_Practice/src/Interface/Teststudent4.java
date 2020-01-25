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
class Student4{
    int rollno;
    String name;
    void insertRecord(String n, int r){
        //Initialization through method
        rollno = r;
        name = n;
    }
    void display(){
        System.out.println(rollno + " -- " + name);
    }
}
public class Teststudent4 {
    public static void main(String args[]){
        Student4 s1 = new Student4();
        Student4 s2 = new Student4();
        s1.insertRecord("Shivi", 10);
        s2.insertRecord("Bhatt", 20);
        //System.out.println(" ID" + s1.name);
        s1.display();
        s2.display();
    }
    
}
