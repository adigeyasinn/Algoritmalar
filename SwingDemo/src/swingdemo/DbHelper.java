/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
/**
 *
 * @author feda1
 */
public class DbHelper {
    private String userName="root";
    private String password="12345";
    private String dbURL="jdbc:mysql://localhost:3306/world?useSSL=false&serverTimezone=UTC";
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbURL,userName,password);
        
        
    }
    public void showErrorMessage(SQLException exception){
        System.out.println("Error"+exception);
        System.out.println("Error code"+exception.getErrorCode());
    }
    
}
