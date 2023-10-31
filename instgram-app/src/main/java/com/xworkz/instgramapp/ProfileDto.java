package com.xworkz.instgramapp;

;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDto implements Serializable {
    private int profile_id;
    private long profile_phno;
    private int profile_age;
    private String profile_password;
    private String profile_uniqueProfileName;

}
