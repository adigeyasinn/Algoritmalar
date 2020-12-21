
package Project;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author feda1
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","1234");
            return con;
        } catch (Exception e) {
            return null;
        }
    }
    
}
