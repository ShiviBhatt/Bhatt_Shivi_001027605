/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Restaurant extends UserAccount{
    private String name;
    private String address;
    private String phone;
    private Menu menu;

    public Restaurant(String userName, String password,String name, String address, String phone) {
        setUsername(userName);
        setPassword(password);
        setRole(new AdminRole());
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.menu = new Menu();
     
    }

    public Restaurant(){
    
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
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

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
}
