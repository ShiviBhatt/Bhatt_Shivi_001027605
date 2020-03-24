/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Restaurant.Restaurant;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Customer extends UserAccount {
    private String name;
    private String address;
    private String phone;
  

    public Customer(String userName, String password, String name, String address, String phone) {
        setUsername(userName);
        setPassword(password);
        setRole(new CustomerRole());
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

      @Override
    public String toString() {
        return this.name;
    }
    
    
    
}
