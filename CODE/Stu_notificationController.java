/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mangement;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import static school_mangement.Admin_loginController.infoBox;

/**
 * FXML Controller class
 *
 * @author user
 */
public class Stu_notificationController implements Initializable {

    @FXML
    private TextArea t1;
    @FXML
    private TextField k1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    
     

    @FXML
    private void show(ActionEvent event) throws SQLException {
        
     System.out.println("search");
     DbConnection connectionClass=new DbConnection();
     String dbname="oop";
     String userName="root";
     String password="";
     Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
      
     try {    
         
         String comment;
         //String a1=k1.getText();
         //System.out.println(a1);
         PreparedStatement pstmt;
         ResultSet rs;
         pstmt = connection.prepareStatement("SELECT * FROM query2 "); 
         String ans="";
         rs = pstmt.executeQuery();
          if(!rs.next()){
                infoBox("No notifications!!!", null, "Oops");
            }
          else{
              rs = pstmt.executeQuery();
              System.out.println("else");
         while (rs.next()) 
         {  
          System.out.println("else");
          comment = rs.getString(2);
          ans+="\n";
          //t1.setText(comment);
          ans+=comment;
          
         }
         t1.setText(ans);
          }
         rs.close();                        
         pstmt.close();                     
      } catch(SQLException e) {
         System.out.println("SQL exception occured" + e);
      }
        
    }
     

    
}
