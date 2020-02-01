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
    private String firstName;
    private String lastName;
    //private VitalSigns vitalSign;
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

//    public VitalSigns getVitalSign() {
//        return vitalSign;
//    }

    public void addVitalSign(VitalSigns vitalSign) {
       // this.vitalSign = vitalSign;
        vitalSignHistory.addVital(vitalSign);
    }

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public boolean isPatientNormal(VitalSigns vitalSigns){
        boolean flag = true;
        if(!isThisVitalSignNormal("Respiratory Rate",vitalSigns)){
            flag = false;
            //System.out.println("Respiratory " + flag);
        }
        if(!isThisVitalSignNormal("Heart Rate",vitalSigns)){
            flag=false;
             //System.out.println("Heart Rate Normal " + flag);
        }
        if(!isThisVitalSignNormal("Systolic Blood Pressure",vitalSigns)){
            flag=false;
             //System.out.println("Blood pressure" + flag);
        }
        if(!isThisVitalSignNormal("Weight in Kilos",vitalSigns)){
            flag=false;
             //System.out.println("Weight Kg" + flag);
        }
        if(!isThisVitalSignNormal("Weight in Pounds",vitalSigns)){
            flag=false;
             //System.out.println("Weight Pound" + flag);
        }
       
        return flag;
    }
    
    public boolean isThisVitalSignNormal(String vsign, VitalSigns vitalSigns) {

        switch (vsign) {
            case "Respiratory Rate":
                return isRespiratoryNormal(vitalSigns);

            case "Heart Rate":
                return isHeartRateNormal(vitalSigns);

            case "Systolic Blood Pressure":
                return isBloodPressureNormal(vitalSigns);

            case "Weight in Kilos":
                return isWeightKGNormal(vitalSigns);

            case "Weight in Pounds":
                return isWeightPoundsNormal(vitalSigns);

            default:
                return false;
        }
    }

    private boolean isRespiratoryNormal(VitalSigns vitalSign) {
        boolean flag = true;

        if (this.ageGroup < 1) {
            //System.out.println("Age Group is Newborn");

            //Respiratory Range
            
            if (vitalSign.getRespiratorRate() >= 30 && vitalSign.getRespiratorRate() <= 50) {
                System.out.println("Newborn Respiratory Rate is in Normal Range");
            } else {
                flag = false;
                System.out.println("Newborn Respiratory Rate is in abnormal Range");
            }
        } else if (this.ageGroup >=1 && this.ageGroup <12) {
            System.out.println("Age Group is Infants(1- 12 months old)");

            //Respiratory Range Infants
            if (vitalSign.getRespiratorRate() >= 20 && vitalSign.getRespiratorRate() <= 30) {
                System.out.println("Infants Respiratory Rate is in Normal Range");
            } else {
                flag = false;
                System.out.println("Infants Respiratory Rate is in abnormal Range");
            }
        } else if (this.ageGroup >=12 && this.ageGroup < 36) {
            System.out.println("Age Group is Toddler(1- 3 years)");

            //Respiratory Range
            if (vitalSign.getRespiratorRate() >= 20 && vitalSign.getRespiratorRate() <= 30) {
                System.out.println("Toddler Respiratory Rate is in Normal Range");
            } else {
                flag = false;
                System.out.println("Toddler Respiratory Rate is in abnormal Range");
            }
        } else if (this.ageGroup>=36 && this.ageGroup < 60) {
            System.out.println("Age Group is Preschooler(3- 5 years)");

            //Respiratory Range
            if (vitalSign.getRespiratorRate() >= 20 && vitalSign.getRespiratorRate() <= 30) {
                System.out.println("Preschooler Respiratory Rate is in Normal Range");
            } else {
                flag = false;
                System.out.println("Preschooler Respiratory Rate is in abnormal Range");
            }
        } else if (this.ageGroup >=72 && this.ageGroup <144) {
            System.out.println("Age Group is SchoolAge(6- 12 years)");

            //Respiratory Range
            if (vitalSign.getRespiratorRate() >= 20 && vitalSign.getRespiratorRate() <= 30) {
                System.out.println("SchoolAge Respiratory Rate is in Normal Range");
            } else {
                flag = false;
                System.out.println("SchoolAge Respiratory Rate is in abnormal Range");
            }
        }  else if (this.ageGroup >=156) {
            System.out.println("Age Group is Adolescent(13+ years)");

            //Respiratory Range
            if (vitalSign.getRespiratorRate() >= 12 && vitalSign.getRespiratorRate() <= 20) {
                System.out.println("Adolescent Respiratory Rate is in Normal Range");
            } else {
                flag = false;
                System.out.println("Adolescent Respiratory Rate is in abnormal Range");
            }
        } else {
            return false;
        }
        return flag;
    }

    private boolean isHeartRateNormal(VitalSigns vitalSign) {
        boolean flag = true;
        if (this.ageGroup < 1) {
            //System.out.println("Age Group is Newborn");
            if (vitalSign.getHeartRate() >= 120 && vitalSign.getHeartRate() <= 160) {
                System.out.println("Newborn Heart Rate is in Normal Range");
            } else {
                flag = false;
                System.out.println("Newborn Heart Rate is in abnormal Range");
            }
            
        }else if (this.ageGroup >=1 &&this.ageGroup <12) {
                System.out.println("Age Group is Infants(1- 12 months old)");
                if (vitalSign.getHeartRate() >= 80 && vitalSign.getHeartRate() <= 140) {
                    System.out.println("Infants Heart Rate is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("Infants Heart Rate is in abnormal Range");
                }
            } else if (this.ageGroup >=12 && this.ageGroup <36) {
                System.out.println("Age Group is Toddler(1- 3 years)");
                if (vitalSign.getHeartRate() >= 80 && vitalSign.getHeartRate() <= 130) {
                    System.out.println("Toddler Heart Rate is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("Toddler Heart Rate is in abnormal Range");
                }

            } else if (this.ageGroup >=36 && this.ageGroup <60) {
                System.out.println("Age Group is Preschooler(3- 5 years)");
                if (vitalSign.getHeartRate() >= 80 && vitalSign.getHeartRate() <= 120) {
                    System.out.println("Preschooler Heart Rate is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("Preschooler Heart Rate is in abnormal Range");
                }
            } else if (this.ageGroup >=72 && this.ageGroup <144) {
                System.out.println("Age Group is SchoolAge(6- 12 years)");
                if (vitalSign.getHeartRate() >= 70 && vitalSign.getHeartRate() <= 110) {
                    System.out.println("SchoolAge Heart Rate is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("SchoolAge Heart Rate is in abnormal Range");
                }
            } else if (this.ageGroup >=156) {
                System.out.println("Age Group is Adolescent(13+ years)");
                if (vitalSign.getHeartRate() >= 55 && vitalSign.getHeartRate() <= 105) {
                    System.out.println("Adolescent Heart Rate is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("Adolescent Heart Rate is in abnormal Range");
                }
            } else {
                return false;
            }
        

        return flag;
    }

    private boolean isBloodPressureNormal(VitalSigns vitalSign) {
        boolean flag = true;
        if (this.ageGroup<1) {
            //System.out.println("Age Group is Newborn");
            if (vitalSign.getSystolicBloodPressure() >= 50 && vitalSign.getSystolicBloodPressure() <= 70) {
                System.out.println("Newborn Blood Pressure is in Normal Range");
            } else {
                flag = false;
                System.out.println("NewbornBlood Pressure  is in abnormal Range");
            }
        }else if(this.ageGroup >=1 &&this.ageGroup <12) {
                System.out.println("Age Group is Infants(1- 12 months old)");
                if (vitalSign.getSystolicBloodPressure() >= 70 && vitalSign.getSystolicBloodPressure() <= 100) {
                    System.out.println("Infants Blood Pressure  is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("Infants Blood Pressure is in abnormal Range");
                }
            } else if(this.ageGroup >=12 && this.ageGroup <36) {
                System.out.println("Age Group is Toddler(1- 3 years)");
                if (vitalSign.getSystolicBloodPressure() >= 80 && vitalSign.getSystolicBloodPressure() <= 110) {
                    System.out.println("Toddler Blood Pressure  is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("Toddler Blood Pressure  is in abnormal Range");
                }

            } else if (this.ageGroup>=36 && this.ageGroup < 60){
                System.out.println("Age Group is Preschooler(3- 5 years)");
                if (vitalSign.getSystolicBloodPressure() >= 80 && vitalSign.getSystolicBloodPressure() <= 110) {
                    System.out.println("Preschooler Blood Pressure  is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("Preschooler Blood Pressure  is in abnormal Range");
                }
            } else if (this.ageGroup >=72 && this.ageGroup <144) {
                System.out.println("Age Group is SchoolAge(6- 12 years)");
                if (vitalSign.getSystolicBloodPressure() >= 80 && vitalSign.getSystolicBloodPressure() <= 120) {
                    System.out.println("SchoolAge Blood Pressure  is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("SchoolAge Blood Pressure is in abnormal Range");
                }
            } else if (this.ageGroup >=156)  {
                System.out.println("Age Group is Adolescent(13+ years)");
                if (vitalSign.getSystolicBloodPressure() >= 110 && vitalSign.getSystolicBloodPressure() <= 120) {
                    System.out.println("Adolescent Blood Pressure is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("AdolescentBlood Pressure is in abnormal Range");
                }
            } else {
                return false;
            }
        

        return flag;
    }

    private boolean isWeightKGNormal(VitalSigns vitalSign) {
        boolean flag = true;
        if (this.ageGroup <1) {
            //System.out.println("Age Group is Newborn");
            if (vitalSign.getWeightKg() >= 2 && vitalSign.getWeightKg() <= 3) {
                System.out.println("Newborn Weight in (Kg) is in Normal Range");
            } else {
                flag = false;
                System.out.println("Newborn Weight in (Kg) is in abnormal Range");
            }
        }else if (this.ageGroup >=1 && this.ageGroup <12) {
                System.out.println("Age Group is Infants(1- 12 months old)");
                if (vitalSign.getWeightKg() >= 4 && vitalSign.getWeightKg() <= 10) {
                    System.out.println("Infants Weight in (Kg) is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("Infants Weight in (Kg) is in abnormal Range");
                }
            } else if (this.ageGroup >=12 && this.ageGroup <36) {
                System.out.println("Age Group is Toddler(1- 3 years)");
                if (vitalSign.getWeightKg() >= 10 && vitalSign.getWeightKg() <= 14) {
                    System.out.println("Toddler Weight in (Kg) is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("Toddler Weight in (Kg) is in abnormal Range");
                }

            } else if(this.ageGroup>=36 && this.ageGroup < 60) {
                System.out.println("Age Group is Preschooler(3- 5 years)");
                if (vitalSign.getWeightKg() >= 14 && vitalSign.getWeightKg() <= 18) {
                    System.out.println("Preschooler Weight in (Kg) is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("Preschooler Weight in (Kg) is in abnormal Range");
                }
            } else if (this.ageGroup >=72 && this.ageGroup <144) {
                System.out.println("Age Group is SchoolAge(6- 12 years)");
                if (vitalSign.getWeightKg() >= 20 && vitalSign.getWeightKg() <= 42) {
                    System.out.println("SchoolAge Weight in (Kg) is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("SchoolAge Weight in (Kg) is in abnormal Range");
                }
            } else if (this.ageGroup >=156) {
                System.out.println("Age Group is Adolescent(13+ years)");
                if (vitalSign.getWeightKg() > 50) {
                    System.out.println("Adolescent Weight in (Kg) is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("Adolescent Weight in (Kg) is in abnormal Range");
                }
            } else {
                return false;
            }
        
        return flag;

    }

    private boolean isWeightPoundsNormal(VitalSigns vitalSign) {
        boolean flag = true;
        if (this.ageGroup <1) {
            //System.out.println("Age Group is Newborn");
            if (vitalSign.getWeightLbs() >= 4.5 && vitalSign.getWeightLbs() <= 7) {
                System.out.println("Newborn Weight in (Lbs ) is in Normal Range");
            } else {
                flag = false;
                System.out.println("Newborn Weight in (Lbs ) is in abnormal Range");
            }
        }
            else if (this.ageGroup >=1 && this.ageGroup <12){
                System.out.println("Age Group is Infants(1- 12 months old)");
                if (vitalSign.getWeightLbs() >= 9 && vitalSign.getWeightLbs() <= 22) {
                    System.out.println("Infants Weight in (Lbs )  is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("Infants Weight in (Lbs )  is in abnormal Range");
                }
            } else if(this.ageGroup >=12 && this.ageGroup <36) {
                System.out.println("Age Group is Toddler(1- 3 years)");
                if (vitalSign.getWeightLbs() >= 22 && vitalSign.getWeightLbs() <= 31) {
                    System.out.println("Toddler Weight in (Lbs )  is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("Toddler Weight in (Lbs )  is in abnormal Range");
                }

            } else if (this.ageGroup>=36 && this.ageGroup < 60) {
                System.out.println("Age Group is Preschooler(3- 5 years)");
                if (vitalSign.getWeightLbs() >= 31 && vitalSign.getWeightLbs() <= 40) {
                    System.out.println("Preschooler Weight in (Lbs ) is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("Preschooler Weight in (Lbs )  is in abnormal Range");
                }
            } else if (this.ageGroup >=72 && this.ageGroup <144) {
                System.out.println("Age Group is SchoolAge(6- 12 years)");
                if (vitalSign.getWeightLbs() >= 41 && vitalSign.getWeightLbs() <= 92) {
                    System.out.println("SchoolAge Weight in (Lbs )  is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("SchoolAge Weight in (Lbs ) is in abnormal Range");
                }
            } else if(this.ageGroup >=156)  {
                System.out.println("Age Group is Adolescent(13+ years)");
                if (vitalSign.getWeightLbs() > 110) {
                    System.out.println("Adolescent Weight in (Lbs )  is in Normal Range");
                } else {
                    flag = false;
                    System.out.println("Adolescent Weight in (Lbs )  is in abnormal Range");
                }
            } else {
                return false;
            }
        
        return flag;

    }
}
