package com.xworkz.excel;

import com.mysql.cj.MysqlConnection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Tester {
    public static void main(String[] args) {
        try{
            ResultSet resultSet = MysqlConnection.getDataFromDataBase();
            SQLToExcelConverter.exportToExcel(resultSet,"data.xlsx");
            System.out.println("Data exported to Excel successfully");
        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
