/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author shivibhatt
 */
public class PatientHelperUtils {

    // Returns age in Years
    public static double getAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        return Period.between(dob, curDate).getYears();
    }

    // Returns age in Months
    public static double getMonthsAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        return Period.between(dob, curDate).getMonths();
    }

    public static void setAgeValue(Patient patient1, String ageGroup) {
        LocalDate dob = LocalDate.parse(ageGroup);
        if (getAge(dob) < 1) {
            //getMonthsAge(dob);
            double agePatientMonths = getMonthsAge(dob);
            patient1.setAgeGroup(agePatientMonths);
            System.out.println("PATIENT AGE IS : " + getMonthsAge(dob) + " Months");
        } else {
            double agePatientYears = getAge(dob) * 12;
            System.out.println("PATIENT AGE IS : " + getAge(dob) + " Years");
            patient1.setAgeGroup(agePatientYears);
        }

    }
}
