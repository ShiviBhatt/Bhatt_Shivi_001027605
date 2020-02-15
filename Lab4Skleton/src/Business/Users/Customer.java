/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.ProductDirectory;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public class Customer  extends User implements Comparable<Customer>{
     private ProductDirectory directory;
     private LocalDate date;
    
    public Customer(String password, String userName, LocalDate date) {
        super(password, userName, "CUSTOMER");
        directory = new ProductDirectory();
        this.date=date;
        
    }
    public LocalDate getCreateDate() {
        return date;
    }

    public ProductDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(ProductDirectory directory) {
        this.directory = directory;
    }

    @Override
    public int compareTo(Customer c) {
        return c.getUserName().compareTo(this.getUserName());
    }

    @Override
    public String toString() {
        return getUserName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
}
