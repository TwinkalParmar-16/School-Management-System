/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mangement;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import static school_mangement.Admin_loginController.infoBox;

/**
 *
 * @author user
 */
public class parentController  implements Initializable{

    @FXML
    private Insets x1;
    @FXML
    private Insets x2;
    @FXML
    private Insets x3;
    @FXML
    private TextField parent_search_t;
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
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
   


    @FXML
    private void close(MouseEvent event) {
        
        
        HelperStage.close((Node)event.getSource());
        
    
    }

    @FXML
    public void add_parents(ActionEvent event) {
        try{
             Stage s = (Stage)b1.getScene().getWindow();
        s.close();
            System.out.println("Ye chla");
            AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("add_parent.fxml"));
        Stage dashboardstage= new Stage();
        dashboardstage.setTitle("parent/add_parent");
        Scene scene = new Scene(root,600,400);
        dashboardstage.setScene(scene);
        dashboardstage.show();
        
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    private void search_parent(ActionEvent event) throws SQLException {
     DbConnection connectionClass=new DbConnection();
     String dbname="oop";
     String userName="root";
     String password="";
     Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
      
     try {    
         
         String first_name,last_name,city,mobile_num,gaurdian_of,salary;
         String a1=parent_search_t.getText();
         PreparedStatement pstmt;
         ResultSet rs;
         pstmt = connection.prepareStatement("SELECT * FROM add_parents where first_name=?"); 
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
          mobile_num = rs.getString(5);      
          gaurdian_of = rs.getString(6);        
          salary = rs.getString(7);
            l1.setText(first_name);
          l2.setText(last_name);
          l3.setText(city);
          l4.setText(mobile_num);
          l5.setText(gaurdian_of);
          l6.setText(salary);


          System.out.println(first_name +" "+last_name+" "+city+" "+mobile_num+" "+gaurdian_of+" "+salary);
         }
          }
         rs.close();                        
         pstmt.close();                     
      } catch(SQLException e) {
         System.out.println("SQL exception occured" + e);
      }
        

        
    }

    @FXML
    private void delete_parent(ActionEvent event) throws SQLException {
        
            System.out.println("Delete");
     DbConnection connectionClass=new DbConnection();
     String dbname="oop";
     String userName="root";
     String password="";
     Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
      
     try {    
          
         String first_name,last_name,city,age,gender,mobile_num;
         String a1=parent_search_t.getText();
         System.out.println(a1);
         PreparedStatement pstmt;
         ResultSet rs;
         pstmt = connection.prepareStatement("DELETE FROM add_parents where first_name=?"); 
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
    private void edit_parent(ActionEvent event) throws SQLException {
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
        
         //String first_name,last_name,city,degree,age,gender;
         String A1=parent_search_t.getText();
         System.out.println(a1);
         System.out.println(a2);System.out.println(a3);System.out.println(a4);
         
         
         
         
         PreparedStatement pstmt;
         ResultSet rs;
         pstmt = connection.prepareStatement("UPDATE `add_parents` SET `first_name`=?,`last_name`=?,`city`=?,`mobile_num`=?,`guardian_of`=?,`salary`=? WHERE first_name=? "); 
         pstmt.setString(1,a1);
         pstmt.setString(2,a2);
         pstmt.setString(3,a3);
         pstmt.setString(4,a4);
         pstmt.setString(5,a5);
         pstmt.setString(6,a6);
         pstmt.setString(7,A1);
         
         pstmt.executeUpdate();
         
         
         infoBox("Updated Sucessfully!!!!", null, "Success");
         pstmt.close();                     
      } catch(SQLException e) {
         System.out.println("SQL exception occured" + e);
      }
  
        
        
    }
    }
    
    
    
