package com.xworkz.excelsheet;

import com.mysql.cj.MysqlConnection;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Tester {
    public static void main(String[] args) {
        try{
            ResultSet resultSet = MySqlConnection.getDataFromDatabase();
            ExcelExporter.exportToExcel(resultSet,"C:\\Users\\ADMIN\\OneDrive\\Desktop\\Profile_data.csv");
            System.out.println("Data exported to Excel successfully");
        }catch(SQLException | IOException e){
            e.printStackTrace();

        }

    }

}
