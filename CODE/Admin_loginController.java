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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class Admin_loginController implements Initializable {

    @FXML
    private TextField t1;
    @FXML
    private TextField t2;

    /**
     * Initializes the controller class.
     */
    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();
    }
    @FXML
    private Button b1;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void login(ActionEvent event) throws SQLException {
        DbConnection connectionClass=new DbConnection();
     String dbname="oop";
     String userName="root";
     String password="";
     Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
      
        
         
         String first_name,last_name,city,age,gender,mobile_num;
         String a1=t1.getText();
         String a2=t2.getText();
         if(a1.isEmpty())
         {
            infoBox("Please enter your username",null,"Error"); 
         }
         else if(a2.isEmpty())
         {
            infoBox("Please enter your password",null,"Error"); 
         }
         PreparedStatement pstmt;
         ResultSet rs;
         pstmt = connection.prepareStatement("SELECT * FROM admin_login where username=? and password=?"); 
         pstmt.setString(1,a1); 
         pstmt.setString(2,a2);
         rs = pstmt.executeQuery();    
         if(!rs.next()){
                infoBox("Please enter correct Email and Password", null, "Failed");
            }
         else{
         infoBox("Login Successfull",null,"Success" );
          Stage s = (Stage)b1.getScene().getWindow();
        s.close();
                 try{
            //System.out.println("Ye chla");
          AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Apps.fxml"));
        Stage dashboardstage= new Stage();
        dashboardstage.setTitle("ADMIN_LOGIN/APPS");
        Scene scene = new Scene(root,971,517);
        dashboardstage.setScene(scene);
        dashboardstage.show();
        
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        
    }
    
    }

}

