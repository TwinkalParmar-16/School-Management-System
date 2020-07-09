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
import javafx.scene.control.TextField;
import static school_mangement.Admin_loginController.infoBox;

/**
 * FXML Controller class
 *
 * @author user
 */
public class Show_resultController implements Initializable {

    @FXML
    private TextField l7;
    @FXML
    private TextField l1;
    @FXML
    private TextField l2;
    @FXML
    private TextField l3;
    @FXML
    private TextField l4;
    @FXML
    private TextField l5;
    @FXML
    private TextField l6;
    @FXML
    private TextField l8;
    @FXML
    private TextField search_t;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void search_student(ActionEvent event) throws SQLException {
         System.out.println("search");
     DbConnection connectionClass=new DbConnection();
     String dbname="oop";
     String userName="root";
     String password="";
     Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
      
     try {    
         
         String first_name,last_name,city,age,gender,mobile_num,class1,result;
         String a1=search_t.getText();
         System.out.println(a1);
         PreparedStatement pstmt;
         ResultSet rs;
         pstmt = connection.prepareStatement("SELECT * FROM add_students where first_name=?"); 
         pstmt.setString(1,a1); 
         rs = pstmt.executeQuery();
         
          if(!rs.next()){
                infoBox("Result not found!!!", null, "Failed");
            }
          else{
              rs = pstmt.executeQuery();
              System.out.println("else");
         while (rs.next()) 
         {  
          System.out.println("else");
          first_name = rs.getString(2);        
          last_name = rs.getString(3); 
          city = rs.getString(4);        
          age = rs.getString(5);      
          gender = rs.getString(6);        
          mobile_num = rs.getString(7);
          class1 =rs.getString(8);
          result =rs.getString(9);
          l1.setText(first_name);
          l2.setText(last_name);
          l3.setText(city);
          l4.setText(age);
          l5.setText(gender);
          l6.setText(mobile_num);
          l7.setText(class1);
          l8.setText(result);
          
          System.out.println(first_name +" "+last_name+" "+city+" "+age+" "+gender+" "+mobile_num);
         }
          }
         rs.close();                        
         pstmt.close();                     
      } catch(SQLException e) {
         System.out.println("SQL exception occured" + e);
      }
    }
    }
    

