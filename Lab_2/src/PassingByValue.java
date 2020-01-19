/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shivibhatt
 */
public class PassingByValue {
    
    
    public static void main (String[] args){
        
        PassingByValue test1 = new PassingByValue();
        int  number =1;
        System.out.println("Before Display : " + number);
        test1.display(number);
                System.out.println("Before Display : " + number);
    }
    
}
