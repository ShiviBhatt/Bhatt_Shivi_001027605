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

    public static void runHardCodeTest() {

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
        newBornPatient.setFirstName("NEW BORN");
        System.out.println("FIRST NAME     : " + newBornPatient.getFirstName());
        newBornPatient.setLastName("PATIENT");
        System.out.println("LAST NAME      : " + newBornPatient.getLastName());
        newBornPatient.setVitalSigns(vs);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        if (newBornPatient.isPatientNormal()) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                                    PATIENT IS NORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                                  PATIENT IS ABNORMAL");
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
        newBornNegativePatient.setFirstName("NEW BORN");
        System.out.println("FIRST NAME     : " + newBornNegativePatient.getFirstName());
        newBornNegativePatient.setLastName("PATIENT");
        System.out.println("LAST NAME      :  " + newBornNegativePatient.getLastName());
        newBornNegativePatient.setVitalSigns(vsNegativeNewBorn);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        if (newBornNegativePatient.isPatientNormal()) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                              PATIENT IS NORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                             PATIENT IS ABNORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        //Infant Positive 
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        Patient infantPatient = new Patient();
        VitalSigns infantVitalSign = new VitalSigns();
        infantVitalSign.setRespiratorRate(25);
        infantVitalSign.setHeartRate(90);
        infantVitalSign.setSystolicBloodPressure(80);
        infantVitalSign.setWeightKg(5);
        infantVitalSign.setWeightLbs(10);
        PatientHelperUtils.setAgeValue(infantPatient, "2019-07-15");
        infantPatient.setFirstName("INFANT");
        System.out.println("FIRST NAME     : " + infantPatient.getFirstName());
        infantPatient.setLastName("PATIENT");
        System.out.println("LAST NAME      : " + infantPatient.getLastName());
        infantPatient.setVitalSigns(infantVitalSign);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        if (infantPatient.isPatientNormal()) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                               PATIENT IS NORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                             PATIENT IS ABNORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        //Negative Test Case Infant
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        Patient negativeInfantPatient = new Patient();
        VitalSigns NegativeInfantVitalSign = new VitalSigns();
        NegativeInfantVitalSign.setRespiratorRate(25);
        NegativeInfantVitalSign.setHeartRate(90);
        NegativeInfantVitalSign.setSystolicBloodPressure(60);
        NegativeInfantVitalSign.setWeightKg(5);
        NegativeInfantVitalSign.setWeightLbs(10);
        PatientHelperUtils.setAgeValue(negativeInfantPatient, "2019-07-15");
        negativeInfantPatient.setFirstName("INFANT");
        System.out.println("FIRST NAME     :  " + negativeInfantPatient.getFirstName());
        negativeInfantPatient.setLastName("PATIENT");
        System.out.println("LAST NAME      :  " + negativeInfantPatient.getLastName());
        negativeInfantPatient.setVitalSigns(NegativeInfantVitalSign);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        if (negativeInfantPatient.isPatientNormal()) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                               PATIENT IS NORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                             PATIENT IS ABNORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        //Toddler
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        Patient toddlerPatient = new Patient();
        VitalSigns toddlerVitalSign = new VitalSigns();
        toddlerVitalSign.setRespiratorRate(25);
        toddlerVitalSign.setHeartRate(90);
        toddlerVitalSign.setSystolicBloodPressure(80);
        toddlerVitalSign.setWeightKg(11);
        toddlerVitalSign.setWeightLbs(23);
        PatientHelperUtils.setAgeValue(toddlerPatient, "2017-07-15");
        toddlerPatient.setFirstName("TODDLER");
        System.out.println("FIRST NAME     : " + toddlerPatient.getFirstName());
        toddlerPatient.setLastName("PATIENT");
        System.out.println("LAST NAME      : " + toddlerPatient.getLastName());
        toddlerPatient.setVitalSigns(toddlerVitalSign);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        if (toddlerPatient.isPatientNormal()) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                               PATIENT IS NORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                             PATIENT IS ABNORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        //Toddler Negative Test Case
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        Patient negativeToddlerPatient = new Patient();
        VitalSigns negativeToddlerVitalSign = new VitalSigns();
        negativeToddlerVitalSign.setRespiratorRate(25);
        negativeToddlerVitalSign.setHeartRate(70);
        negativeToddlerVitalSign.setSystolicBloodPressure(80);
        negativeToddlerVitalSign.setWeightKg(9);
        negativeToddlerVitalSign.setWeightLbs(10);
        PatientHelperUtils.setAgeValue(negativeToddlerPatient, "2017-07-15");
        negativeToddlerPatient.setFirstName("TODDLER");
        System.out.println("FIRST NAME     : " + negativeToddlerPatient.getFirstName());
        negativeToddlerPatient.setLastName("PATIENT");
        System.out.println("LAST NAME      : " + negativeToddlerPatient.getLastName());
        negativeToddlerPatient.setVitalSigns(negativeToddlerVitalSign);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        if (negativeToddlerPatient.isPatientNormal()) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                               PATIENT IS NORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                             PATIENT IS ABNORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        //PreSchoolar Test Case
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        Patient preSchoolerPatient = new Patient();
        VitalSigns preSchoolerVitalSign = new VitalSigns();
        preSchoolerVitalSign.setRespiratorRate(25);
        preSchoolerVitalSign.setHeartRate(95);
        preSchoolerVitalSign.setSystolicBloodPressure(100);
        preSchoolerVitalSign.setWeightKg(15);
        preSchoolerVitalSign.setWeightLbs(32);
        PatientHelperUtils.setAgeValue(preSchoolerPatient, "2015-07-15");
        preSchoolerPatient.setFirstName("PRESCHOOLER");
        System.out.println("FIRST NAME     : " + preSchoolerPatient.getFirstName());
        preSchoolerPatient.setLastName("PATIENT");
        System.out.println("LAST NAME      : " + preSchoolerPatient.getLastName());
        preSchoolerPatient.setVitalSigns(preSchoolerVitalSign);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        if (preSchoolerPatient.isPatientNormal()) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                               PATIENT IS NORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                             PATIENT IS ABNORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        //PreSchooler Negative Test Case
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        Patient negativepreSchoolerPatient = new Patient();
        VitalSigns negativepreSchoolerVitalSign = new VitalSigns();
        negativepreSchoolerVitalSign.setRespiratorRate(25);
        negativepreSchoolerVitalSign.setHeartRate(70);
        negativepreSchoolerVitalSign.setSystolicBloodPressure(70);
        negativepreSchoolerVitalSign.setWeightKg(9);
        negativepreSchoolerVitalSign.setWeightLbs(10);
        PatientHelperUtils.setAgeValue(negativepreSchoolerPatient, "2015-07-15");
        negativepreSchoolerPatient.setFirstName("PRESCHOOLER");
        System.out.println("FIRST NAME     : " + negativepreSchoolerPatient.getFirstName());
        negativepreSchoolerPatient.setLastName("PATIENT");
        System.out.println("LAST NAME      : " + negativepreSchoolerPatient.getLastName());
        negativepreSchoolerPatient.setVitalSigns(negativepreSchoolerVitalSign);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        if (negativepreSchoolerPatient.isPatientNormal()) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                               PATIENT IS NORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                             PATIENT IS ABNORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        //SchoolAge Test Case
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        Patient schoolAgePatient = new Patient();
        VitalSigns schoolAgeVitalSign = new VitalSigns();
        schoolAgeVitalSign.setRespiratorRate(25);
        schoolAgeVitalSign.setHeartRate(95);
        schoolAgeVitalSign.setSystolicBloodPressure(100);
        schoolAgeVitalSign.setWeightKg(30);
        schoolAgeVitalSign.setWeightLbs(50);
        PatientHelperUtils.setAgeValue(schoolAgePatient, "2010-07-15");
        schoolAgePatient.setFirstName("SCHOOL AGE");
        System.out.println("FIRST NAME     : " + schoolAgePatient.getFirstName());
        schoolAgePatient.setLastName("PATIENT");
        System.out.println("LAST NAME      : " + schoolAgePatient.getLastName());
        schoolAgePatient.setVitalSigns(schoolAgeVitalSign);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        if (schoolAgePatient.isPatientNormal()) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                               PATIENT IS NORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                             PATIENT IS ABNORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        //SchoolAge Negative Test Case
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        Patient negativeSchoolAgePatient = new Patient();
        VitalSigns negativeSchoolAgeVitalSign = new VitalSigns();
        negativeSchoolAgeVitalSign.setRespiratorRate(25);
        negativeSchoolAgeVitalSign.setHeartRate(70);
        negativeSchoolAgeVitalSign.setSystolicBloodPressure(100);
        negativeSchoolAgeVitalSign.setWeightKg(9);
        negativeSchoolAgeVitalSign.setWeightLbs(10);
        PatientHelperUtils.setAgeValue(negativeSchoolAgePatient, "2010-07-15");
        negativeSchoolAgePatient.setFirstName("SCHOOL AGE");
        System.out.println("FIRST NAME     : " + negativeSchoolAgePatient.getFirstName());
        negativeSchoolAgePatient.setLastName("PATIENT");
        System.out.println("LAST NAME      : " + negativeSchoolAgePatient.getLastName());
        negativeSchoolAgePatient.setVitalSigns(negativeSchoolAgeVitalSign);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        if (negativeSchoolAgePatient.isPatientNormal()) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                               PATIENT IS NORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                             PATIENT IS ABNORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        //Adolscent Test Case
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        Patient adolscentPatient = new Patient();
        VitalSigns adolescentVitalSign = new VitalSigns();
        adolescentVitalSign.setRespiratorRate(15);
        adolescentVitalSign.setHeartRate(95);
        adolescentVitalSign.setSystolicBloodPressure(115);
        adolescentVitalSign.setWeightKg(60);
        adolescentVitalSign.setWeightLbs(120);
        PatientHelperUtils.setAgeValue(adolscentPatient, "2004-07-15");
        adolscentPatient.setFirstName("ADOLESCENT");
        System.out.println("FIRST NAME     : " + adolscentPatient.getFirstName());
        adolscentPatient.setLastName("PATIENT");
        System.out.println("LAST NAME      : " + adolscentPatient.getLastName());
        adolscentPatient.setVitalSigns(adolescentVitalSign);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        if (adolscentPatient.isPatientNormal()) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                               PATIENT IS NORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                             PATIENT IS ABNORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        //Adolscent Negative Test Case
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        Patient negativeAdolescentPatient = new Patient();
        VitalSigns negativeAdolescentVitalSign = new VitalSigns();
        negativeAdolescentVitalSign.setRespiratorRate(15);
        negativeAdolescentVitalSign.setHeartRate(70);
        negativeAdolescentVitalSign.setSystolicBloodPressure(115);
        negativeAdolescentVitalSign.setWeightKg(9);
        negativeAdolescentVitalSign.setWeightLbs(10);
        PatientHelperUtils.setAgeValue(negativeAdolescentPatient, "2004-07-15");
        negativeAdolescentPatient.setFirstName("ADOLESCENT");
        System.out.println("FIRST NAME     : " + negativeAdolescentPatient.getFirstName());
        negativeAdolescentPatient.setLastName("PATIENT");
        System.out.println("LAST NAME      : " + negativeAdolescentPatient.getLastName());
        negativeAdolescentPatient.setVitalSigns(negativeAdolescentVitalSign);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        if (negativeAdolescentPatient.isPatientNormal()) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                               PATIENT IS NORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                             PATIENT IS ABNORMAL");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }

    }
}
