/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author shivibhatt
 */
public class VitalSignHistory {
    private ArrayList<VitalSigns> VitalSignHistory;

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return VitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> VitalSignHistory) {
        this.VitalSignHistory = VitalSignHistory;
    }
    
    public VitalSignHistory(){
        //Initialize Array List
        
        VitalSignHistory = new ArrayList<VitalSigns>();    }
    
    public VitalSigns addVitals(){
        VitalSigns vitalSign = new VitalSigns();
        VitalSignHistory.add(vitalSign);
        return vitalSign;
        
    }
}
