/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author shivibhatt
 */
public class Menu {
    ArrayList<Item> itemList = new ArrayList<Item>();

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }
    
    public void addItem(Item item){
        itemList.add(item);
    }
    
    public void removeItem(Item item){
        itemList.remove(item);
    }
}
