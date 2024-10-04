/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demoqlsv;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class DemoQLSV {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        try{
            // 1. Nạp drive
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // 2. Tạo kết nối cơ sở dữ liệu
            String username = "sa";
            String password  = "11101978";
            String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName = QLSV; encrypt = false";
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            System.out.println("ket noi thanh cong");
        }
        catch(Exception ex){
        System.out.println("Loi : " + ex.getMessage());
        }
    }
}
