package com.xworkz.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLToExcelConverter  {
    public static void main(String[] args) {
        try {
            // Establish a database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram", "root", "Xworkzodc@123");

            // Write an SQL query to retrieve data
            String sql = "SELECT * FROM profile_dto";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select profile_id, profile_phno");

            // Create an Excel workbook
            Workbook workbook = new HSSFWorkbook();
            Sheet sheet = workbook.createSheet("SQLData");

            // Write data to Excel
            int rowNumber = 0;
            while (resultSet.next()) {
                Row row = sheet.createRow(rowNumber++);
                row.createCell(0).setCellValue(resultSet.getString("profile_id"));
                row.createCell(1).setCellValue(resultSet.getString("profile_phno"));
                row.createCell(2).setCellValue(resultSet.getString("profile_age"));
                row.createCell(3).setCellValue(resultSet.getString("profile_password"));
                row.createCell(4).setCellValue(resultSet.getString("profile_uniqueProfileName"));


                // Add more cells as needed for your data
            }

            // Save the Excel file
            FileOutputStream fileOut = new FileOutputStream("output.xlsx");
            workbook.write(fileOut);
            fileOut.close();

            // Close the database connection
            conn.close();

            System.out.println("Excel file created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }}