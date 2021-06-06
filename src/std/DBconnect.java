
package std;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ACER
 */
public class DBconnect {
    
    public static Connection connect()
    {
         Connection conn = null;
         
         try
         {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable","root","rockyrox");
            System.out.println("Database Connection Sucess-!!!!!");
         }
         catch (Exception e)
         {
         System.out.println("Database Connection Failed-!!!!!");
         }
         return conn;
    
    }
    
}
