package Electricity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

        public class conn{

    Connection c;
                Statement s;
            
            conn(){
                
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(conn.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                   c =DriverManager.getConnection("jdbc:mysql://localhost:3306/electricity","root","250800");
                   s = c.createStatement();
                } catch (SQLException ex) {
                    Logger.getLogger(conn.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                    

            }
        }