package com.xworkz.hospital.exception;

public class BloodGroupNotFoundException extends RuntimeException{
    public BloodGroupNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
