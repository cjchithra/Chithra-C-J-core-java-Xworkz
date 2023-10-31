package com.xworkz.hospital.exception;

public class PatientAgeNotFoundException extends RuntimeException{
    public PatientAgeNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }

}
