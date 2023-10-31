package com.xworkz.hospital.exception;

public class WardNoNotUpdatedException extends RuntimeException{
    public WardNoNotUpdatedException(String errorMessage){
        System.out.println(errorMessage);
    }
}
