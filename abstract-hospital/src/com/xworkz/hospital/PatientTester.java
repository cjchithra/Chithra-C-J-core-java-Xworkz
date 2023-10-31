package com.xworkz.hospital;

import com.xworkz.hospital.constant.BloodGroup;
import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.exception.*;
import com.xworkz.hospital.impl.ApolloHospitalImpl;
import com.xworkz.hospital.impl.Hospital;
import com.xworkz.hospital.patient.Patient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PatientTester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("number of patients are:");
        int size = sc.nextInt();
        //int size = sc.nextInt();
        Hospital hos = new ApolloHospitalImpl(size);
        for (int index = 0; index < size; index++) {
            Patient pat = new Patient();

            // System.out.println(("Enter the patients's id"));
            //pat.setPatientId(sc.nextInt());
            System.out.println(("Enter the patients's name"));
            pat.setPName(sc.next());
            System.out.println(("Enter the patients's age"));
            pat.setPAge(sc.nextInt());
            System.out.println("Enter the patients's address");
            pat.setAddress(sc.next());
            System.out.println("Enter the patients's attender");
            pat.setAttenderName(sc.next());

            System.out.println("Enter the patients's wardNo");
            pat.setWardNO(sc.next());
            System.out.println("Enter the patients's hospital name");
            pat.setHospitalName(sc.next());
            System.out.println("Enter the patients's Gender");
            pat.setGender(Gender.valueOf(sc.next()));

            System.out.println("Enter the patients's bloodgroup");
            pat.setBloodGroup(BloodGroup.valueOf(sc.next()));
            hos.savePatient(pat);
        }
        String userInput = null;
        do {
            System.out.println("Press 1 : To get all the patient's info");
            System.out.println("Press 2 : To get all the attender's name ");
            System.out.println("Press 3 : To get all the patient's gender ");
            System.out.println("Press 4 : To get all the patient's age ");
            System.out.println("Press 5 : To get all the patient's address ");
            System.out.println("Press 6 : To get all the patient's bloodgroup ");
            System.out.println("Press 7 : To get all the patient's by using id ");
            System.out.println("Press 8 : To get all the updated patient's age ");
            System.out.println("Press 9 : To get all the updated patient's wardNO ");
            System.out.println("Press 10 : To delete patient by patient id ");
            int options = sc.nextInt();
            switch (options) {
                case 1:
                    hos.getAllPatients();
                    break;
                case 2:
                    System.out.println("Attender name by using patient's id");
                    try {
                        String attenderName = hos.getPatientsAttenderNameByPatientId(sc.nextInt());
                        //hos.getPatientsAttenderNameByPatientId(sc.nextInt());
                        System.out.println(attenderName);
                    }catch (PatientIdNotFoundException p){
                        p.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Patients's gender by using patient's name");
                        Gender patientGender = hos.getPatientsGenderByPatientName(sc.next());
                        System.out.println(patientGender);
                    }catch (AttenderNotFoundException a){
                        a.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Patients's age by using patient's id");
                        int pAge = hos.getPatientAgeByPatientId(sc.nextInt());
                        System.out.println(pAge);
                    }catch (PatientAgeNotFoundException p){
                        p.printStackTrace();
                    }

                    break;
                case 5:
                    try {
                        System.out.println("Patients's address by using patient's name");
                        String address = hos.getPatientAddressByPatientName(sc.next());
                        System.out.println(address);
                    }catch (PatientAddressNotFoundException a){
                        a.printStackTrace();
                    }
                    break;
                case 6 :
                    try {
                        System.out.println("Patients's blood group  by using patient's name");
                        BloodGroup bloodGroup = hos.getPatientsBloodGroupByPatientName(sc.next());
                        System.out.println(bloodGroup);
                    }catch (BloodGroupNotFoundException b){
                        b.printStackTrace();
                    }

                    break;
                case 7:
                    try {
                        System.out.println("Patients's  by using patient's id");
                        Patient patient1 = hos.getPatientByPatientId(sc.nextInt());
                        System.out.println(patient1);
                    }catch (PatientNotFoundException p){
                        p.printStackTrace();
                    }
                    break;
                case 8:
                    try {
                        System.out.println("update Patients's  age by using patient's name");
                        boolean isAgeUpdated = hos.updatePatientAgeByPatientName(sc.nextInt(), sc.next());
                        System.out.println("updated age is");
                        System.out.println(isAgeUpdated);
                        hos.getAllPatients();
                    }catch (AgeNotUpdatedException a){
                        a.printStackTrace();
                    }
                    break;
                case 9:
                    try {
                        System.out.println("update Patients's  wardNo by using patient's id");
                        boolean isWardNoUpdated = hos.updatePatientWardNoByPatientId(sc.next(), sc.nextInt());
                        System.out.println("updated ward no is");
                        System.out.println(isWardNoUpdated);
                        hos.getAllPatients();
                    }catch (WardNoNotUpdatedException w){
                        w.printStackTrace();
                    }
                    break;
                case 10:
                    try {
                        System.out.println("delete patient by patient's id");
                        boolean isPatientDeleted = hos.deletePatientByPatientId(sc.nextInt());
                        System.out.println(isPatientDeleted);
                        hos.getAllPatients();
                    }catch (PatientNotDeletedException p){
                        p.printStackTrace();
                    }
                    break;
            }
            System.out.println("Do you want to continue yes/no");
            userInput = sc.next();
        }while (userInput.equals("yes"));
        System.out.println("Thank you!");


    }
}


