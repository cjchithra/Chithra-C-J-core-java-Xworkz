package com.xworkz.excel;

import com.mysql.cj.MysqlConnection;

import java.sql.*;

public class SqlConnector {
    public static Connection connect(){
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram", "root", "Xworkzodc@123");

        }catch (SQLException e){
            e.printStackTrace();
        }
        return con;

    }
    public static ResultSet getDataFromDatabase(){
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        con = MysqlConnection.connect();
        try{
            stmt = con.createStatement();
            String query = "Select * from profile_dto";
            rs = stmt.executeQuery(query);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;

    }

}
