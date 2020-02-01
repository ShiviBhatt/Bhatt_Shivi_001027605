/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import static Business.Main.main;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shivibhatt
 */
public class Main {

    Patient patient = new Patient();
    //Scanner sc = new Scanner(System.in); 

    public static void main(String args[]) {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                           PEDIATRIC VITAL SIGNS FOR PATIENTS                                                                      ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        boolean x = true;
        while (x) {
            //System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            //System.out.println("                                           PEDIATRIC VITAL SIGNS FOR PATIENTS                                                                      ");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(" CHOOSE FROM THE MENU OPTION \n PRESS 1 FOR ADDING PATIENT DETAILS AND VITAL SIGNS \n PRESS 2 TEST VITAL SIGNS  \n PRESS 3 PATIENT VITAL SIGN DETAILS \n PRESS 4 TO EXIT \n");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ADD PATIENT AND VITAL SIGNS DETAILS");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
                    main.newVitalSign(sc);
                    break;
                case 2:
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("TEST VITAL SIGNS");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
                    TestPatient.runHardCodeTest();
                    break;
                case 3:
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("PATIENT VITAL SIGN DETAILS");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
                    main.displayVitalSignHistory();
                    break;
                case 4:
                    x = false;
                    break;
                default:
                    System.out.println("PRESS 1 , 2, 3 or 4 FROM THE OPTIONS");
            }
        }
        sc.close();
    }

    private void displayVitalSignHistory() {
        VitalSigns vs = patient.getVitalSigns();

        double age = patient.getAgeGroup();

        System.out.println("Age Group  : " + age);
        System.out.println("First Name : " + patient.getFirstName());
        System.out.println("Last Name  : " + patient.getLastName());

        //for (int i = 0; i < list.size(); i++) {
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                   PATIENT VITAL SIGN DETAILS    ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        //VitalSigns vs = list.get(i);
        System.out.println("Respiratory Rate : " + vs.getRespiratorRate());
        System.out.println("Heart Rate       : " + vs.getHeartRate());
        System.out.println("Blood Pressure   : " + vs.getSystolicBloodPressure());
        System.out.println("Weight in Kg     : " + vs.getWeightKg());
        System.out.println("Weight in Lb     : " + vs.getWeightLbs());
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                   VITAL SIGNS STATUS                        ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");

        if (patient.isPatientNormal()) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("               PATIENT IS NORMAL                        ");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("               PATIENT IS ABNORMAL                      ");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        //}

    }

    private void newVitalSign(Scanner sc) {

        VitalSigns vs = new VitalSigns();

        if (patient.getAgeGroup() == null) {
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("AGE GROUP CATEGORIES : Newborn, Infant(1-12months), Toddler(1-3 years), Prechooler(3-5 years), schoolAge(6-12 years), Adolescent(13+ years) ");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("ENTER DATE OF BIRTH IN FORMAT YYYY-MM-DD: OF PATIENT TO GET AGE");
            String ageGroup = sc.next();
            PatientHelperUtils.setAgeValue(patient,ageGroup);

        }
        if (patient.getFirstName() == null) {
            System.out.println("ENTER FIRST NAME ");
            String firstName = sc.next();
            patient.setFirstName(firstName);
        }
        if (patient.getLastName() == null) {
            System.out.println("ENTER LAST NAME ");
            String lastName = sc.next();
            patient.setLastName(lastName);
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                       CHECK FOR VARIOUS PEDIATRIC VITAL SIGNS                                                                                 ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
        //Respiratory Rate
        System.out.println("ENTER RESPIRATORY RATE");
        double respiratoryRate = sc.nextDouble();
        vs.setRespiratorRate(respiratoryRate);
        System.out.println("You Entered Respiratory Rate as " + respiratoryRate);

        //Heart Rate
        System.out.println("ENTER HEART RATE");
        double heartRate = sc.nextDouble();
        vs.setHeartRate(heartRate);
        System.out.println("You Entered Heart Rate as " + heartRate);

        //Blood Pressure
        System.out.println("ENTER SYSTOLIC BLOOD PRESSURE ");
        double BloodPressure = sc.nextDouble();
        vs.setSystolicBloodPressure(BloodPressure);
        System.out.println("You Entered Systolic Blood Pressure  as " + BloodPressure);

        //Weight KG
        System.out.println("ENTER WEIGHT IN KILOS (Kg)");
        double weightKg = sc.nextDouble();
        vs.setWeightKg(weightKg);
        System.out.println("You Entered Weight in Kilos (Kg) as " + weightKg);

        //Weight Lbs
        System.out.println("ENTER WEIGHT IN POUNDS (lbs)");
        double weightLbs = sc.nextDouble();
        vs.setWeightLbs(weightLbs);
        System.out.println("You Entered Weight in Kilos (Kg) as " + weightLbs);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                         VITAL SIGNS STATUS                        ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        //setting vs object into patient object
        patient.setVitalSigns(vs);

        if (patient.isPatientNormal()) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                      PATIENT IS NORMAL                        ");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                      PATIENT IS ABNORMAL                      ");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }

    }

}
