/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    ArrayList<Restaurant> restaurantList = new ArrayList<Restaurant>();
    
    public void addRestaurant(Restaurant restaurant){
        restaurantList.add(restaurant);
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    public void removeRestaurant(Restaurant restaurant){
        restaurantList.remove(restaurant);
    }
}
