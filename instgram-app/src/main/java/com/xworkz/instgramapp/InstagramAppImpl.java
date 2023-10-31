package com.xworkz.instgramapp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InstagramAppImpl implements InstagramApp {
    @Override
    public boolean addCustomer(ProfileDto dto) {
        Connection con = null;
        PreparedStatement stmt = null;


            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram", "root", "Xworkzodc@123");
                stmt = con.prepareStatement("insert into profile_dto (profile_phno,profile_age,profile_password,profile_uniqueProfileName(?,?,?,?)");
                stmt.setInt(1,(int)Math.random()+1);
                stmt.setLong(2,dto.getProfile_phno());
                stmt.setInt(3,dto.getProfile_age());
                stmt.setString(4, dto.getProfile_password());
                stmt.setString(5, dto.getProfile_uniqueProfileName());

               int noOfRowsAffected = stmt.executeUpdate();
                System.out.println(noOfRowsAffected);
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (stmt != null) {
                        stmt.close();

                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
            return false;


    }

    @Override
    public List<ProfileDto> getAllProfileDto() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<ProfileDto> profileDtos = new ArrayList<>();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram", "root", "Xworkzodc@123");
            stmt = con.prepareStatement("select * from profile_dto");
            rs = stmt.executeQuery();

            while(rs.next()){
                ProfileDto profileDto = new ProfileDto();
                profileDto.setProfile_id(rs.getInt(1));
                profileDto.setProfile_phno(rs.getLong(2));
                profileDto.setProfile_age(rs.getInt(3));
                profileDto.setProfile_password(rs.getString(4));
                profileDto.setProfile_uniqueProfileName(rs.getString(5));
                profileDtos.add(profileDto);
            }
//

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();

                }


            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return profileDtos;


    }

}






