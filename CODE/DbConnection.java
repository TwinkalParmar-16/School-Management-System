/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mangement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */

public class DbConnection {
    public Connection connection;
    public Connection getconnection() throws SQLException{
        String dbname="oop";
        String userName="root";
        String password="";
        try{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
        }catch(ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        return connection;
    }

    

    

    
}
