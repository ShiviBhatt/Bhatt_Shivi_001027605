/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author shivibhatt
 */
public class OrderWorkRequest extends WorkRequest{
    
    private String id;
    
    private List<ItemWithQuantity> itemsWithQuatityList = new ArrayList<ItemWithQuantity>();
    
    private String customerFeedback;

    public OrderWorkRequest() {
        UUID uuid = UUID.randomUUID();
        id = uuid.toString();
    }
    
    public String getId() {
        return id;
    }
    
     public ItemWithQuantity addItem(ItemWithQuantity itemWithQuantity){
        itemsWithQuatityList.add(itemWithQuantity);
        return itemWithQuantity;
    }

    public List<ItemWithQuantity> getItemsWithQuatityList() {
        return itemsWithQuatityList;
    }

    public void setItemsWithQuatityList(List<ItemWithQuantity> itemsWithQuatityList) {
        this.itemsWithQuatityList = itemsWithQuatityList;
    }

    public String getCustomerFeedback() {
        return customerFeedback;
    }

    public void setCustomerFeedback(String customerFeedback) {
        this.customerFeedback = customerFeedback;
    }
         
}
