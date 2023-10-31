package com.xworkz.hospital.exception;

public class PatientNotFoundException extends RuntimeException{
    public PatientNotFoundException(String errorMessage ){
        System.out.println(errorMessage);
    }
}
