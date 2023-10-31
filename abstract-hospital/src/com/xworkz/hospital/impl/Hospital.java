package com.xworkz.hospital.impl;

import com.xworkz.hospital.constant.BloodGroup;
import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.exception.PatientIdNotFoundException;
import com.xworkz.hospital.patient.Patient;

public interface Hospital {

    public boolean savePatient(Patient patient);
    public void getAllPatients();
    public String getPatientsAttenderNameByPatientId(int patientId) throws PatientIdNotFoundException;
    public Gender getPatientsGenderByPatientName(String pName);
    public int getPatientAgeByPatientId(int patientId);
    public String getPatientAddressByPatientName(String pName);
    public BloodGroup getPatientsBloodGroupByPatientName(String pName);
    public Patient getPatientByPatientId(int patientId);
    public  boolean updatePatientAgeByPatientName(int updateAge , String existingPatientName);
    public boolean updatePatientWardNoByPatientId(String updateWardNo, int existingPatientID);
    public boolean deletePatientByPatientId(int patientId);

}
