package com.xworkz.hospital.impl;

import com.xworkz.hospital.constant.BloodGroup;
import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.exception.*;
import com.xworkz.hospital.patient.Patient;

import java.util.Arrays;

public class ApolloHospitalImpl implements Hospital{

    public Patient patient[];
    public ApolloHospitalImpl(int size) {

        patient = new Patient[size];
    }

    int index;
    static int id = 0;

    @Override
    public boolean savePatient(Patient patient) {
        boolean isAdded = false;
        if (patient != null) {

            patient.setPatientId(++id);

            this.patient[index++] = patient;
            isAdded = true;
        } else {
            System.out.println("Patient is null.. cannot be added");
        }
        return isAdded;
    }

    @Override
    public void getAllPatients() {
        System.out.println("The available patient");
        for (int patientIndex = 0; patientIndex < patient.length; patientIndex++)
            System.out.println(patient[patientIndex]);

    }

    @Override
    public String getPatientsAttenderNameByPatientId(int patientId) throws PatientIdNotFoundException {
        String attenderName = null;
        for (int index = 0; index < patient.length; index++) {
            if (patient[index].getPatientId() == patientId) {
                attenderName = patient[index].getAttenderName();
            }
        }
        if(attenderName == null){
//            AttenderNotFoundException attenderNotFoundException = new AttenderNotFoundException("No attender name found for the given patient id" + patientId);
//            throw attenderNotFoundException;
            throw new AttenderNotFoundException("No attender name found for the given patient id" + patientId);
        }
        return attenderName;
    }

    @Override
    public Gender getPatientsGenderByPatientName(String pName) {
        Gender patientGender = null;
        for (int index = 0; index < patient.length; index++) {
            if (patient[index].getPName().equals(pName)) {
                patientGender = patient[index].getGender();
            }
        }
        if(patientGender == null){
            PatientGenderNotFoundException patientGenderNotFoundException = new PatientGenderNotFoundException("Patient gender not found..");
            throw patientGenderNotFoundException;
        }
        return patientGender;
    }

    @Override
    public int getPatientAgeByPatientId(int patientId){
        int pAge = 0;
        for (int index = 0; index < patient.length; index++) {
            if (patient[index].getPatientId() == (patientId)) {
                pAge = patient[index].getPAge();
            }
        }
        if(pAge == 0){
            PatientAgeNotFoundException patientAgeNotFoundException = new PatientAgeNotFoundException("Patient age not found.." + patientId) ;
            throw patientAgeNotFoundException;
        }

        return pAge;

    }

    @Override
    public String getPatientAddressByPatientName(String pName) {
        String address = null;
        for (int index = 0; index < patient.length; index++) {
            if (patient[index].getPName().equals(pName)) {
                address = patient[index].getAddress();
            }
        }
        if (address == null){
            PatientAddressNotFoundException patientAddressNotFoundException = new PatientAddressNotFoundException("Patient address not found " + pName);
            throw patientAddressNotFoundException;
        }

        return address;
    }

    @Override
    public BloodGroup getPatientsBloodGroupByPatientName(String pName) {
        BloodGroup bloodGroup = null;
        for (int index = 0; index < patient.length; index++) {
            if (patient[index].getPName().equals(pName)) {
                bloodGroup = patient[index].getBloodGroup();

            }
        }
        if(bloodGroup == null){
            throw new BloodGroupNotFoundException("Blood group not found " + pName);
        }
        return bloodGroup;
    }

    @Override
    public Patient getPatientByPatientId(int patientId) {
        Patient patient1 = null;
        for (int index = 0; index < patient.length; index++) {
            if (patient[index].getPatientId() == (patientId)) {
                patient1 = patient[index];

            }

        }
        if (patient1 == null){
            throw new PatientNotFoundException("Patient not found " +patientId);
        }
        return patient1;
    }

    @Override
    public boolean updatePatientAgeByPatientName(int updateAge, String existingPatientName) {
        boolean isAgeUpdated = false;
        for (int index = 0; index < patient.length; index++){
            if(patient[index].getPName().equals(existingPatientName)){
                patient[index].setPAge(updateAge);
                isAgeUpdated = true;
            }
        }
        if(isAgeUpdated == false){
            throw new AgeNotUpdatedException("Patient's age is not updated");
        }

        return isAgeUpdated;
    }

    @Override
    public boolean updatePatientWardNoByPatientId(String updateWardNo, int existingPatientID) {
        boolean isWardNoUpdated = false;
        for(int index = 0; index < patient.length; index++){
            if(patient[index].getPatientId()==(existingPatientID)){
                patient[index].setWardNO(updateWardNo);
                isWardNoUpdated = true;
            }
        }
        if(isWardNoUpdated == false){
            throw new WardNoNotUpdatedException("ward number not updated");
        }
        return isWardNoUpdated;
    }

    @Override
    public boolean deletePatientByPatientId(int patientId) {
        boolean isPatientDeleted =false;

        int newIndex , oldIndex;
        for(oldIndex = 0 , newIndex = 0; oldIndex < patient.length; oldIndex++){
            if(!(patient[oldIndex].getPatientId() == patientId)){
                patient[newIndex++] = this.patient[oldIndex];
                isPatientDeleted = true;
            }

        }
        if(isPatientDeleted == false){
            throw new PatientNotDeletedException("Patient data is not deleted");
        }
        patient =  Arrays.copyOf(patient,newIndex);

        return isPatientDeleted;
    }
}
