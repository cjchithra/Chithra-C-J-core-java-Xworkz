package com.xworkz.instgramapp;

import java.util.List;
import java.util.Scanner;

public class InstagramTester {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        System.out.println("Main started");

        InstagramApp app = new InstagramAppImpl();
        Scanner sc = new Scanner(System.in);
        ProfileDto dto = new ProfileDto();
        List<ProfileDto> dtos = app.getAllProfileDto();
        dtos.stream().forEach(System.out::println);
        System.out.println("Main ended");
        System.out.println("enter profile phone number");
        dto.setProfile_phno(sc.nextLong());

        System.out.println("enter profile age");
        dto.setProfile_age(sc.nextInt());

        System.out.println("enter profile password");
        dto.setProfile_password(sc.next());

        System.out.println("enter profile's unique profile name");
        dto.setProfile_uniqueProfileName(sc.next());

       app.addCustomer(dto);


    }
}
