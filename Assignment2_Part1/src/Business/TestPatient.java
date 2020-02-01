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
public class TestPatient {
     
    public static void runHardCodeTest(){
        
        
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                            PATIENT VITAL SIGN TEST RESULTS                                                                        ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        
        //Newborn
        Patient newBornPatient = new Patient();
        VitalSigns vs = new VitalSigns();
        vs.setRespiratorRate(40);
        vs.setHeartRate(120);
        vs.setSystolicBloodPressure(60);
        vs.setWeightKg(2);
        vs.setWeightLbs(4.5);
        PatientHelperUtils.setAgeValue(newBornPatient, "2020-01-20");
        newBornPatient.setFirstName("NewBorn");
        newBornPatient.setLastName("Patient");
        newBornPatient.setVitalSigns(vs);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        if(newBornPatient.isPatientNormal()){
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("PATIENT IS NORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }else{
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("PATIENT IS ABNORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }
       
        
       
        //Negative Case for NewBorn
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        Patient newBornNegativePatient = new Patient();
        VitalSigns vsNegativeNewBorn = new VitalSigns();
        vsNegativeNewBorn.setRespiratorRate(20);
        vsNegativeNewBorn.setHeartRate(120);
        vsNegativeNewBorn.setSystolicBloodPressure(60);
        vsNegativeNewBorn.setWeightKg(2);
        vsNegativeNewBorn.setWeightLbs(4.5);
        PatientHelperUtils.setAgeValue(newBornNegativePatient, "2020-01-20");
        newBornNegativePatient.setFirstName("NewBorn");
        newBornNegativePatient.setLastName("Patient");
        newBornNegativePatient.setVitalSigns(vsNegativeNewBorn);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        if(newBornNegativePatient.isPatientNormal()){
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("PATIENT IS NORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }else{
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("PATIENT IS ABNORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        
         //Infant
        Patient infantPatient = new Patient();
        VitalSigns infantVitalSign = new VitalSigns();
        infantVitalSign.setRespiratorRate(25);
        infantVitalSign.setHeartRate(90);
        infantVitalSign.setSystolicBloodPressure(80);
        infantVitalSign.setWeightKg(5);
        infantVitalSign.setWeightLbs(10);
        PatientHelperUtils.setAgeValue(infantPatient, "2019-07-15");
        infantPatient.setFirstName("Infant");
        infantPatient.setLastName("Patient");
        infantPatient.setVitalSigns(infantVitalSign);
        infantPatient.isPatientNormal();
        
        //Negative Test Case Infant
          Patient negativeInfantPatient = new Patient();
        VitalSigns NegativeInfantVitalSign = new VitalSigns();
        NegativeInfantVitalSign.setRespiratorRate(25);
        NegativeInfantVitalSign.setHeartRate(90);
        NegativeInfantVitalSign.setSystolicBloodPressure(80);
        NegativeInfantVitalSign.setWeightKg(5);
        NegativeInfantVitalSign.setWeightLbs(10);
        PatientHelperUtils.setAgeValue(infantPatient, "2019-07-15");
        negativeInfantPatient.setFirstName("Infant");
        negativeInfantPatient.setLastName("Patient");
        negativeInfantPatient.setVitalSigns(NegativeInfantVitalSign);
        negativeInfantPatient.isPatientNormal();
        
        
           //Toddler
        Patient toddlerPatient = new Patient();
        VitalSigns toddlerVitalSign = new VitalSigns();
        toddlerVitalSign.setRespiratorRate(25);
        toddlerVitalSign.setHeartRate(90);
        toddlerVitalSign.setSystolicBloodPressure(80);
        toddlerVitalSign.setWeightKg(5);
        toddlerVitalSign.setWeightLbs(10);
        PatientHelperUtils.setAgeValue(toddlerPatient, "2017-07-15");
        toddlerPatient.setFirstName("Toddler");
        toddlerPatient.setLastName("Patient");
        toddlerPatient.setVitalSigns(toddlerVitalSign);
        toddlerPatient.isPatientNormal();
        
        
        
    }
}
