/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hiran
 */
public class DBConnect {
     public static Connection connect(){
         Connection conn = null;
      try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable","root","hiran97");
      }catch (Exception e){
          System.out.println(e);
      }
     return conn;
     }
}
