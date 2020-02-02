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
public class VitalSigns {

    private double respiratorRate;
    private double heartRate;
    private double systolicBloodPressure;
    private double weightKg;
    private double weightLbs;

    public double getRespiratorRate() {
        return respiratorRate;
    }

    public void setRespiratorRate(double respiratorRate) {
        this.respiratorRate = respiratorRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(double systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public double getWeightLbs() {
        return weightLbs;
    }

    public void setWeightLbs(double weightLbs) {
        this.weightLbs = weightLbs;
    }

    public boolean isThisVitalSignNormal(String vsign, double ageGroup) {

        switch (vsign) {
            case "Respiratory Rate":
                return isRespiratoryNormal(ageGroup);

            case "Heart Rate":
                return isHeartRateNormal(ageGroup);

            case "Systolic Blood Pressure":
                return isBloodPressureNormal(ageGroup);

            case "Weight in Kilos":
                return isWeightKGNormal(ageGroup);

            case "Weight in Pounds":
                return isWeightPoundsNormal(ageGroup);

            default:
                return false;
        }
    }

    private boolean isRespiratoryNormal(double ageGroup) {
        boolean flag = true;

        if (ageGroup < 1) {
            //System.out.println("Age Group is Newborn");

            //Respiratory Range
            if (respiratorRate >= 30 && respiratorRate <= 50) {
                System.out.println("Newborn Respiratory Rate     is in Normal Range");
            } else {
                flag = false;
                System.out.println("Newborn Respiratory Rate     is in abnormal Range");
            }
        } else if (ageGroup >= 1 && ageGroup < 12) {
            //System.out.println("Age Group is Infants(1- 12 months old)");

            //Respiratory Range Infants
            if (respiratorRate >= 20 && respiratorRate <= 30) {
                System.out.println("Infants Respiratory Rate     is in Normal Range");
            } else {
                flag = false;
                System.out.println("Infants Respiratory Rate     is in abnormal Range");
            }
        } else if (ageGroup >= 12 && ageGroup < 36) {
            //System.out.println("Age Group is Toddler(1- 3 years)");

            //Respiratory Range
            if (respiratorRate >= 20 && respiratorRate <= 30) {
                System.out.println("Toddler Respiratory Rate     is in Normal Range");
            } else {
                flag = false;
                System.out.println("Toddler Respiratory Rate     is in abnormal Range");
            }
        } else if (ageGroup >= 36 && ageGroup <= 60) {
            //System.out.println("Age Group is Preschooler(3- 5 years)");

            //Respiratory Range
            if (respiratorRate >= 20 && respiratorRate <= 30) {
                System.out.println("Preschooler Respiratory Rate  is in Normal Range");
            } else {
                flag = false;
                System.out.println("Preschooler Respiratory Rate  is in abnormal Range");
            }
        } else if (ageGroup >= 72 && ageGroup < 144) {
            //System.out.println("Age Group is SchoolAge(6- 12 years)");

            //Respiratory Range
            if (respiratorRate >= 20 && respiratorRate <= 30) {
                System.out.println("SchoolAge Respiratory Rate    is in Normal Range");
            } else {
                flag = false;
                System.out.println("SchoolAge Respiratory Rate    is in abnormal Range");
            }
        } else if (ageGroup >= 156) {
            //System.out.println("Age Group is Adolescent(13+ years)");

            //Respiratory Range
            if (respiratorRate >= 12 && respiratorRate <= 20) {
                System.out.println("Adolescent Respiratory Rate  is in Normal Range");
            } else {
                flag = false;
                System.out.println("Adolescent Respiratory Rate  is in abnormal Range");
            }
        } else {
            return false;
        }
        return flag;
    }

    private boolean isHeartRateNormal(double ageGroup) {
        boolean flag = true;
        if (ageGroup < 1) {
            //System.out.println("Age Group is Newborn");
            if (heartRate >= 120 && heartRate <= 160) {
                System.out.println("Newborn Heart Rate           is in Normal Range");
            } else {
                flag = false;
                System.out.println("Newborn Heart Rate           is in abnormal Range");
            }

        } else if (ageGroup >= 1 && ageGroup < 12) {
            //System.out.println("Age Group is Infants(1- 12 months old)");
            if (heartRate >= 80 && heartRate <= 140) {
                System.out.println("Infants Heart Rate           is in Normal Range");
            } else {
                flag = false;
                System.out.println("Infants Heart Rate           is in abnormal Range");
            }
        } else if (ageGroup >= 12 && ageGroup < 36) {
            //System.out.println("Age Group is Toddler(1- 3 years)");
            if (heartRate >= 80 && heartRate <= 130) {
                System.out.println("Toddler Heart Rate           is in Normal Range");
            } else {
                flag = false;
                System.out.println("Toddler Heart Rate           is in abnormal Range");
            }

        } else if (ageGroup >= 36 && ageGroup <= 60) {
            //System.out.println("Age Group is Preschooler(3- 5 years)");
            if (heartRate >= 80 && heartRate <= 120) {
                System.out.println("Preschooler Heart Rate        is in Normal Range");
            } else {
                flag = false;
                System.out.println("Preschooler Heart Rate        is in abnormal Range");
            }
        } else if (ageGroup >= 72 && ageGroup < 144) {
            //System.out.println("Age Group is SchoolAge(6- 12 years)");
            if (heartRate >= 70 && heartRate <= 110) {
                System.out.println("SchoolAge Heart Rate          is in Normal Range");
            } else {
                flag = false;
                System.out.println("SchoolAge Heart Rate          is in abnormal Range");
            }
        } else if (ageGroup >= 156) {
            //System.out.println("Age Group is Adolescent(13+ years)");
            if (heartRate >= 55 && heartRate <= 105) {
                System.out.println("Adolescent Heart Rate        is in Normal Range");
            } else {
                flag = false;
                System.out.println("Adolescent Heart Rate        is in abnormal Range");
            }
        } else {
            return false;
        }

        return flag;
    }

    private boolean isBloodPressureNormal(double ageGroup) {
        boolean flag = true;
        if (ageGroup < 1) {
            //System.out.println("Age Group is Newborn");
            if (systolicBloodPressure >= 50 && systolicBloodPressure <= 70) {
                System.out.println("Newborn Blood Pressure       is in Normal Range");
            } else {
                flag = false;
                System.out.println("NewbornBlood Pressure        is in abnormal Range");
            }
        } else if (ageGroup >= 1 && ageGroup < 12) {
            //System.out.println("Age Group is Infants(1- 12 months old)");
            if (systolicBloodPressure >= 70 && systolicBloodPressure <= 100) {
                System.out.println("Infants Blood Pressure       is in Normal Range");
            } else {
                flag = false;
                System.out.println("Infants Blood Pressure       is in abnormal Range");
            }
        } else if (ageGroup >= 12 && ageGroup < 36) {
            //System.out.println("Age Group is Toddler(1- 3 years)");
            if (systolicBloodPressure >= 80 && systolicBloodPressure <= 110) {
                System.out.println("Toddler Blood Pressure       is in Normal Range");
            } else {
                flag = false;
                System.out.println("Toddler Blood Pressure       is in abnormal Range");
            }

        } else if (ageGroup >= 36 && ageGroup <= 60) {
            //System.out.println("Age Group is Preschooler(3- 5 years)");
            if (systolicBloodPressure >= 80 && systolicBloodPressure <= 110) {
                System.out.println("Preschooler Blood Pressure    is in Normal Range");
            } else {
                flag = false;
                System.out.println("Preschooler Blood Pressure    is in abnormal Range");
            }
        } else if (ageGroup >= 72 && ageGroup < 144) {
            //System.out.println("Age Group is SchoolAge(6- 12 years)");
            if (systolicBloodPressure >= 80 && systolicBloodPressure <= 120) {
                System.out.println("SchoolAge Blood Pressure      is in Normal Range");
            } else {
                flag = false;
                System.out.println("SchoolAge Blood Pressure      is in abnormal Range");
            }
        } else if (ageGroup >= 156) {
            //System.out.println("Age Group is Adolescent(13+ years)");
            if (systolicBloodPressure >= 110 && systolicBloodPressure <= 120) {
                System.out.println("Adolescent Blood Pressure    is in Normal Range");
            } else {
                flag = false;
                System.out.println("AdolescentBlood Pressure     is in abnormal Range");
            }
        } else {
            return false;
        }

        return flag;
    }

    private boolean isWeightKGNormal(double ageGroup) {
        boolean flag = true;
        if (ageGroup < 1) {
            //System.out.println("Age Group is Newborn");
            if (weightKg >= 2 && weightKg <= 3) {
                System.out.println("Newborn Weight in (Kg)       is in Normal Range");
            } else {
                flag = false;
                System.out.println("Newborn Weight in (Kg)       is in abnormal Range");
            }
        } else if (ageGroup >= 1 && ageGroup < 12) {
            //System.out.println("Age Group is Infants(1- 12 months old)");
            if (weightKg >= 4 && weightKg <= 10) {
                System.out.println("Infants Weight in (Kg)       is in Normal Range");
            } else {
                flag = false;
                System.out.println("Infants Weight in (Kg)       is in abnormal Range");
            }
        } else if (ageGroup >= 12 && ageGroup < 36) {
            //System.out.println("Age Group is Toddler(1- 3 years)");
            if (weightKg >= 10 && weightKg <= 14) {
                System.out.println("Toddler Weight in (Kg)       is in Normal Range");
            } else {
                flag = false;
                System.out.println("Toddler Weight in (Kg)       is in abnormal Range");
            }

        } else if (ageGroup >= 36 && ageGroup <= 60) {
            //System.out.println("Age Group is Preschooler(3- 5 years)");
            if (weightKg >= 14 && weightKg <= 18) {
                System.out.println("Preschooler Weight in (Kg)    is in Normal Range");
            } else {
                flag = false;
                System.out.println("Preschooler Weight in (Kg)    is in abnormal Range");
            }
        } else if (ageGroup >= 72 && ageGroup < 144) {
            //System.out.println("Age Group is SchoolAge(6- 12 years)");
            if (weightKg >= 20 && weightKg <= 42) {
                System.out.println("SchoolAge Weight in (Kg)      is in Normal Range");
            } else {
                flag = false;
                System.out.println("SchoolAge Weight in (Kg)      is in abnormal Range");
            }
        } else if (ageGroup >= 156) {
            //System.out.println("Age Group is Adolescent(13+ years)");
            if (weightKg > 50) {
                System.out.println("Adolescent Weight in (Kg)    is in Normal Range");
            } else {
                flag = false;
                System.out.println("Adolescent Weight in (Kg)    is in abnormal Range");
            }
        } else {
            return false;
        }

        return flag;

    }

    private boolean isWeightPoundsNormal(double ageGroup) {
        boolean flag = true;
        if (ageGroup < 1) {
            //System.out.println("Age Group is Newborn");
            if (weightLbs >= 4.5 && weightLbs <= 7) {
                System.out.println("Newborn Weight in (Lbs )     is in Normal Range");
            } else {
                flag = false;
                System.out.println("Newborn Weight in (Lbs )     is in abnormal Range");
            }
        } else if (ageGroup >= 1 && ageGroup < 12) {
            //System.out.println("Age Group is Infants(1- 12 months old)");
            if (weightLbs >= 9 && weightLbs <= 22) {
                System.out.println("Infants Weight in (Lbs )     is in Normal Range");
            } else {
                flag = false;
                System.out.println("Infants Weight in (Lbs )     is in abnormal Range");
            }
        } else if (ageGroup >= 12 && ageGroup < 36) {
            //System.out.println("Age Group is Toddler(1- 3 years)");
            if (weightLbs >= 22 && weightLbs <= 31) {
                System.out.println("Toddler Weight in (Lbs )     is in Normal Range");
            } else {
                flag = false;
                System.out.println("Toddler Weight in (Lbs )     is in abnormal Range");
            }

        } else if (ageGroup >= 36 && ageGroup <= 60) {
            //System.out.println("Age Group is Preschooler(3- 5 years)");
            if (weightLbs >= 31 && weightLbs <= 40) {
                System.out.println("Preschooler Weight in (Lbs )  is in Normal Range");
            } else {
                flag = false;
                System.out.println("Preschooler Weight in (Lbs )  is in abnormal Range");
            }
        } else if (ageGroup >= 72 && ageGroup < 144) {
            //System.out.println("Age Group is SchoolAge(6- 12 years)");
            if (weightLbs >= 41 && weightLbs <= 92) {
                System.out.println("SchoolAge Weight in (Lbs )    is in Normal Range");
            } else {
                flag = false;
                System.out.println("SchoolAge Weight in (Lbs )    is in abnormal Range");
            }
        } else if (ageGroup >= 156) {
            //System.out.println("Age Group is Adolescent(13+ years)");
            if (weightLbs > 110) {
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
