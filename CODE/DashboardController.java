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
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import static school_mangement.Admin_loginController.infoBox;

/**
 * FXML Controller class
 *
 * @author user
 */
public class DashboardController implements Initializable {

    private VBox border_pane;
    @FXML
    private Insets x1;
    @FXML
    private Insets x2;
    @FXML
    private Button x6;
    @FXML
    private Button x3;
    @FXML
    private Insets x5;
    @FXML
    private Insets x26;
    @FXML
    private Insets x4;
    @FXML
    private Button x7;
    @FXML
    private Button x8;
    @FXML
    private Button x9;
    @FXML
    private Button x10;
    @FXML
    private Button x11;
    @FXML
    private Button x12;
    @FXML
    private Button x13;
    @FXML
    private Button x14;
    @FXML
    private Button x15;
    @FXML
    private Button x16;
    @FXML
    private Button x17;
    @FXML
    private Button x18;
    @FXML
    private Button x19;
    @FXML
    private Button x20;
    @FXML
    private Button x21;
    @FXML
    private Button x22;
    @FXML
    private Button x23;
    @FXML
    private Button x24;
    @FXML
    private Button x25;
    @FXML
    private Button x27;
    @FXML
    private Button x28;
    @FXML
    private Button x29;
    @FXML
    private Button x30;
    @FXML
    private Button x31;
    @FXML
    private Button x32;
    @FXML
    private Button x33;
    @FXML
    private Button x34;
    @FXML
    private TextField l1;
    @FXML
    private TextField l2;
    @FXML
    private TextField l3;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    /*@FXML
    private void add_teacher(MouseEvent event) throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("add_teacher.fxml"));
       
        border_pane.setCenter(p);
    }*/

    @FXML
    private void g_teacher(ActionEvent event) throws SQLException {
        DbConnection connectionClass=new DbConnection();
     String dbname="oop";
     String userName="root";
     String password="";
     Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
     try {    
         
         
         PreparedStatement pstmt;
         ResultSet rs;
         pstmt = connection.prepareStatement("SELECT COUNT(*) FROM add_teacher"); 
         
         rs = pstmt.executeQuery();
         
          if(!rs.next()){
                infoBox("Result not found!!!", null, "Failed");
            }
          else{
              rs = pstmt.executeQuery();
              
         while (rs.next()) 
         {  
          System.out.println("else");
          int count = rs.getInt(1);        
          String str=Integer.toString(count);
          //System.out.println(count);
          l1.setText(str);
          
          
         // System.out.println(first_name +" "+last_name+" "+city+" "+age+" "+gender+" "+mobile_num);
         }
          }
         rs.close();                        
         pstmt.close();                     
      } catch(SQLException e) {
         System.out.println("SQL exception occured" + e);
      }
    }

    @FXML
    private void g_students(ActionEvent event) throws SQLException {
        DbConnection connectionClass=new DbConnection();
     String dbname="oop";
     String userName="root";
     String password="";
     Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
     try {    
         
         
         PreparedStatement pstmt;
         ResultSet rs;
         pstmt = connection.prepareStatement("SELECT COUNT(*) FROM add_students"); 
         
         rs = pstmt.executeQuery();
         
          if(!rs.next()){
                infoBox("Result not found!!!", null, "Failed");
            }
          else{
              rs = pstmt.executeQuery();
              
         while (rs.next()) 
         {  
          System.out.println("else");
          int count = rs.getInt(1);        
          String str=Integer.toString(count);
          System.out.println(count);
          l3.setText(str);
          
          
         // System.out.println(first_name +" "+last_name+" "+city+" "+age+" "+gender+" "+mobile_num);
         }
          }
         rs.close();                        
         pstmt.close();                     
      } catch(SQLException e) {
         System.out.println("SQL exception occured" + e);
      }
    }

    @FXML
    private void g_parents(ActionEvent event) throws SQLException {
       DbConnection connectionClass=new DbConnection();
     String dbname="oop";
     String userName="root";
     String password="";
     Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
     try {    
         
         
         PreparedStatement pstmt;
         ResultSet rs;
         pstmt = connection.prepareStatement("SELECT COUNT(*) FROM add_parents"); 
         
         rs = pstmt.executeQuery();
         
          if(!rs.next()){
                infoBox("Result not found!!!", null, "Failed");
            }
          else{
              rs = pstmt.executeQuery();
              
         while (rs.next()) 
         {  
          //System.out.println("else");
          int count = rs.getInt(1);        
          String str=Integer.toString(count);
          System.out.println(count);
          l2.setText(str);
          
          
         // System.out.println(first_name +" "+last_name+" "+city+" "+age+" "+gender+" "+mobile_num);
         }
          }
         rs.close();                        
         pstmt.close();                     
      } catch(SQLException e) {
         System.out.println("SQL exception occured" + e);
      }
    }
    
}
