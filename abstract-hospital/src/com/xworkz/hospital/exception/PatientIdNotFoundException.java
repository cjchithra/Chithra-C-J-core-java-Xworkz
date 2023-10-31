package com.xworkz.hospital.exception;

public class PatientIdNotFoundException extends Exception{
    public PatientIdNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }



}
