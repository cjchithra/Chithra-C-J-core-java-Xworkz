package com.xworkz.hospital.exception;

public class PatientAddressNotFoundException extends RuntimeException{
    public PatientAddressNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
