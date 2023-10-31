package com.xworkz.hospital.patient;

import com.xworkz.hospital.constant.BloodGroup;
import com.xworkz.hospital.constant.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Patient {
    private int patientId;
    private String pName;
    private int pAge;
    private String address;
    private String attenderName;
    private String wardNO;
    private String hospitalName;
    private Gender gender;
    private BloodGroup bloodGroup;




    public Patient() {


    }


}
