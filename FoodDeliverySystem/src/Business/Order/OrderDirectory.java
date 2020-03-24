/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author shivibhatt
 */
public class OrderDirectory {
    
    ArrayList<Order> orderList = new ArrayList<>();

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public void addOrder(Order order){
        orderList.add(order);
    }
    
    public void removeOrder(Order order){
        orderList.remove(order);
    }
    
}
