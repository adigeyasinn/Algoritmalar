
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feda1
 */
public class connection {
    
    public static void main(String[] args) {
        try {
            
            Connection myConn=(Connection) DriverManager.getConnection("jdbc:mysql:localhost:3306/universty","root","1234");
            Statement myStatement=(Statement) myConn.createStatement();
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
