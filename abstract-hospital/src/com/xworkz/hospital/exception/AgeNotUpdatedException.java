package com.xworkz.hospital.exception;

public class AgeNotUpdatedException extends RuntimeException{
    public AgeNotUpdatedException(String errorMessage){
        System.out.println(errorMessage);
    }
}
