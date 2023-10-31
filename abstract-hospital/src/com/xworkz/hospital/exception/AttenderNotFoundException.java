package com.xworkz.hospital.exception;
//custom unchecked
public class AttenderNotFoundException extends RuntimeException{
    public AttenderNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }

}

