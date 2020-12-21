
package denemee;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author feda1
 */
public class DBHelper {
    
    private String username="root";
    private String password="feda1903";
    private String dbUrl="jdbc:mysql://localhost:3306/world";
    
    public java.sql.Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl,username,password);
        
    }
    public void showErrorMessage(SQLException exception){
        System.out.println("Error:"+exception.getMessage());
        System.out.println("Error code:"+exception.getErrorCode());
    }
    
}
