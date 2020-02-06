/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author shivibhatt
 */
public class Patient {

    private Double ageGroup;
    public String firstName;
    private String lastName;
    private String dateVisited;
    //private VitalSigns latestVitalSigns;
    private VitalSignHistory vitalSignHistory = new VitalSignHistory();

    //VitalSigns vs = new VitalSigns();
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

    public String getDateVisited() {
        return dateVisited;
    }

    public void setDateVisited(String dateVisited) {
        this.dateVisited = dateVisited;
    }

    public void addVitalSign(VitalSigns vitalSign) {
        //this.latestVitalSigns = vitalSign;
        vitalSignHistory.addVital(vitalSign);

    }

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public boolean isThisVitalSignNormal(String vsignName, VitalSigns vitalSigns) {

        if (vitalSigns == null) {
            if (vitalSignHistory.getVitalSignHistoryList().size() == 0) {
                throw new IllegalArgumentException("There is no items in the patient Vital sign history List");
            } else {
                vitalSigns = vitalSignHistory.getVitalSignHistoryList().get(vitalSignHistory.getVitalSignHistoryList().size() - 1);
            }

        }

        return vitalSigns.isThisVitalSignNormal(vsignName, ageGroup);

    }

    public boolean isPatientNormal(VitalSigns vitalSigns) {

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
