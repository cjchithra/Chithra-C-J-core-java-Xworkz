package com.xworkz.excelsheet;

import com.mysql.cj.MysqlConnection;

import java.sql.*;

public class MySqlConnection {
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

        con = MySqlConnection.connect();
        try{
            stmt = con.createStatement();
            String query = "Select * from sales";
            rs = stmt.executeQuery(query);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;

    }

}
