/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import Business.VitalSigns;

/**
 *
 * @author shivibhatt
 */


public class VitalSignHistory {
   
    
    
 private ArrayList<VitalSigns> vitalSignHistoryList = new ArrayList<VitalSigns>();


    public ArrayList<VitalSigns> getVitalSignHistoryList() {
        return vitalSignHistoryList;
    }

    public void setVitalSignHistoryList(ArrayList<VitalSigns> vitalSignHistoryList) {
        this.vitalSignHistoryList = vitalSignHistoryList;
    }

   
    public void addVital(VitalSigns vs){
        vitalSignHistoryList.add(vs);
        
    }

  
 
    
}
