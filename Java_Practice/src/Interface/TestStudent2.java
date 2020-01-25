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
//Initialization through reference
 class Student { //Initializing an object means storing data into the object.
    int id;
    String name;
    
    
}
class TestStudent2{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.id=101;
        s1.name="Shivi";
        System.out.println("ID : "+ s1.id + "    " +   "Name : " + s1.name);
        
    }
}