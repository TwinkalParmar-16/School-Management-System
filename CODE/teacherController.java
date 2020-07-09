/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mangement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import static school_mangement.Admin_loginController.infoBox;

/**
 *
 * @author user
 */
public class teacherController {

    @FXML
    private Insets x1;
    @FXML
    private Insets x2;
    @FXML
    private Insets x3;
    @FXML
    private TextField search_t;

    PreparedStatement preparedStatement2 = null;
    ResultSet resultSet = null;
    @FXML
    private Button b1;
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
    public void add_teacher(ActionEvent event) {
        try{
             Stage s = (Stage)b1.getScene().getWindow();
        s.close();
           // System.out.println("Ye chla");
            AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("add_teacher.fxml"));
        Stage dashboardstage= new Stage();
         dashboardstage.setTitle("teacher/add_teacher");
        Scene scene = new Scene(root,600,400);
        dashboardstage.setScene(scene);
        dashboardstage.show();
        
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    public void search_teacher(ActionEvent event) throws SQLException 
    {
     DbConnection connectionClass=new DbConnection();
     String dbname="oop";
     String userName="root";
     String password="";
     Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
      
     try {    
         
         String first_name,last_name,city,degree,age,gender;
         String a1=search_t.getText();
         PreparedStatement pstmt;
         ResultSet rs;
         pstmt = connection.prepareStatement("SELECT * FROM add_teacher where first_name=?"); 
         pstmt.setString(1,a1); 
         rs = pstmt.executeQuery();  
          l1.setText("");
          l2.setText("");
          l3.setText("");
          l4.setText("");
          l5.setText("");
          l6.setText("");
          if(!rs.next()){
                infoBox("Result not found!!!", null, "Failed");
            }
          else{
              rs = pstmt.executeQuery();
              System.out.println("else");
         while (rs.next()) 
         {        
          first_name = rs.getString(2);        
          last_name = rs.getString(3); 
          city = rs.getString(4);        
          degree = rs.getString(5);      
          age = rs.getString(6);        
          gender = rs.getString(7); 
           l1.setText(first_name);
          l2.setText(last_name);
          l3.setText(city);
          l4.setText(degree);
          l5.setText(age);
          l6.setText(gender);

          System.out.println(first_name +" "+last_name+" "+city+" "+degree+" "+age+" "+gender);
         }
          }
         rs.close();                        
         pstmt.close();                     
      } catch(SQLException e) {
         System.out.println("SQL exception occured" + e);
      }
        
    }
    

    @FXML
    private void delete_teacher(ActionEvent event) throws SQLException {
     
     System.out.println("Delete");
     DbConnection connectionClass=new DbConnection();
     String dbname="oop";
     String userName="root";
     String password="";
     Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
      
     try {    
          
         String first_name,last_name,city,age,gender,mobile_num;
         String a1=search_t.getText();
         System.out.println(a1);
         PreparedStatement pstmt;
         ResultSet rs;
         pstmt = connection.prepareStatement("DELETE FROM add_teacher where first_name=?"); 
         pstmt.setString(1,a1); 
         l1.setText("");
          l2.setText("");
          l3.setText("");
          l4.setText("");
          l5.setText("");
          l6.setText("");
         
         pstmt.executeUpdate();
         infoBox("Deleted Sucessfully!!!!", null, "SUCCESS");
         
        
         pstmt.close();                     
      } catch(SQLException e) {
         System.out.println("SQL exception occured" + e);
      }
        
 
        
    }

    @FXML
    private void edit_teacher(ActionEvent event) throws SQLException {
        
     System.out.println("edit");
     DbConnection connectionClass=new DbConnection();
     String dbname="oop";
     String userName="root";
     String password="";
     Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
      
     try {    
        String a1=l1.getText().toString();
        String a2=l2.getText().toString();
        String a3=l3.getText().toString();
        String a4=l4.getText().toString();
        String a5=l5.getText().toString();
        String a6=l6.getText().toString();
        
         String first_name,last_name,city,degree,age,gender;
         String A1=search_t.getText();
         System.out.println(a1);
         System.out.println(a2);System.out.println(a3);System.out.println(a4);
         
         
         
         
         PreparedStatement pstmt;
         ResultSet rs;
         pstmt = connection.prepareStatement("UPDATE `add_teacher` SET `first_name`=?,`last_name`=?,`city`=?,`degree`=?,`age`=?,`subjects`=? WHERE first_name=? "); 
         pstmt.setString(1,a1);
         pstmt.setString(2,a2);
         pstmt.setString(3,a3);
         pstmt.setString(4,a4);
         pstmt.setString(5,a5);
         pstmt.setString(6,a6);
         pstmt.setString(7,A1);
         
         pstmt.executeUpdate();
         
         
         infoBox("Updated Sucessfully!!!!", null, "Failed");
         pstmt.close();                     
      } catch(SQLException e) {
         System.out.println("SQL exception occured" + e);
      }
  
        
        
    }
    
}    
    
    
    


