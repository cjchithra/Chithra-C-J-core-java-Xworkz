package com.xworkz.hospital.exception;

public class PatientGenderNotFoundException extends RuntimeException {
    public PatientGenderNotFoundException(String errorMessage){
        System.out.println(errorMessage);

    }
}
