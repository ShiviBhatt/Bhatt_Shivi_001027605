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

class Employee{
    int id;
    String name;
    float salary;
    void insert(int i, String n, float s){
        id = i;
        name= n;
        salary = s;
    }
    void display(){
        System.out.println("ID : " + id + " name : " + name + " salary : " + salary);
        
    }
}
public class TestEmployee {
    public static void main(String args[]){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        
        e1.insert(10,"USA", 110);
        e2.insert(20,"INDIA", 120);
        e3.insert(30,"CHINA", 130);
        e1.display();
        e2.display();
        e3.display();
        
         
        
    }
    
}
