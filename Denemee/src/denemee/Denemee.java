/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denemee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author feda1
 */
public class Denemee {

    public static void main(String[] args) throws SQLException {
        Connection connection=null;
        DBHelper helper=new DBHelper();
        PreparedStatement statement=null;
        ResultSet resultSet;
     
        try {
            connection=helper.getConnection();
            String sql="insert into city (Name,CountryCode,District,Population) values(?,?,?,?)";
            statement=connection.prepareStatement(sql);
            statement.setString(1,"Düzce");
            statement.setString(1,"TUR");
            statement.setString(1,"Turkey");
            statement.setInt(4,70000);
            int result=statement.executeUpdate();
                
            
            System.out.println("Kayıt Eklendi");
        } catch (SQLException  exception) {
            helper.showErrorMessage(exception);
        }
        finally{
            statement.close();
            connection.close();
        }
    }
    
}
