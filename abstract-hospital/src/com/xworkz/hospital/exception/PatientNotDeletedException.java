package com.xworkz.hospital.exception;

public class PatientNotDeletedException extends RuntimeException{
    public PatientNotDeletedException(String errorMessage){
        System.out.println(errorMessage);
    }
}
