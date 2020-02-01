/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author shivibhatt
 */
public class Patient {

    private Double ageGroup;
    private String firstName;
    private String lastName;
    private VitalSigns vitalSigns;

    public Double getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(Double ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public boolean isPatientNormal() {
        boolean flag = true;
        if (!vitalSigns.isThisVitalSignNormal("Respiratory Rate", ageGroup)) {
            flag = false;
            //System.out.println("Respiratory " + flag);
        }
        if (!vitalSigns.isThisVitalSignNormal("Heart Rate", ageGroup)) {
            flag = false;
            //System.out.println("Heart Rate Normal " + flag);
        }
        if (!vitalSigns.isThisVitalSignNormal("Systolic Blood Pressure", ageGroup)) {
            flag = false;
            //System.out.println("Blood pressure" + flag);
        }
        if (!vitalSigns.isThisVitalSignNormal("Weight in Kilos", ageGroup)) {
            flag = false;
            //System.out.println("Weight Kg" + flag);
        }
        if (!vitalSigns.isThisVitalSignNormal("Weight in Pounds", ageGroup)) {
            flag = false;
            //System.out.println("Weight Pound" + flag);
        }

        return flag;
    }

}
