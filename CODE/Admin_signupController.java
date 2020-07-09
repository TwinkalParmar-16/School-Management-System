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
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import static school_mangement.Admin_loginController.infoBox;

/**
 * FXML Controller class
 *
 * @author user
 */
public class Admin_signupController implements Initializable {

    @FXML
    private TextField t1;
    @FXML
    private PasswordField t2;
    @FXML
    private PasswordField t3;
    @FXML
    private Button p1 = new Button();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signup(ActionEvent event) throws SQLException {
        DbConnection connectionClass=new DbConnection();
             String dbname="oop";
        String userName="root";
        String password="";
    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
    
        //System.out.println(t1.getText());
        String a1=t1.getText().toString();
        String a2=t2.getText().toString();
        String a3=t3.getText().toString();
        if(a1.isEmpty())
         {
            infoBox("Please enter your username",null,"Error"); 
         }
         else if(a2.isEmpty())
         {
            infoBox("Please enter your password",null,"Error"); 
         }
        else if(a3.isEmpty())
         {
            infoBox("Please RE-Enter your password",null,"Error"); 
         }
        else if(!a2.equals(a3))
        {
        infoBox("Password does not match..try again!!",null,"OOps!"); 
        }
        else{
        String sql = "INSERT INTO `admin_login`(`username`, `password`) VALUES (?,?)";
    //PreparedStatement pst=connection.prepareStatement(sql);
    try{
        PreparedStatement preparedStatement2 = connection.prepareStatement(sql);
        preparedStatement2.setString(1,a1);
        preparedStatement2.setString(2,a2);
        preparedStatement2.executeUpdate();
        //Stage s=null;
        infoBox("SignUp Successfull",null,"Success" );
        Stage s = (Stage)p1.getScene().getWindow();
        s.close();
        //System.out.println("yess");
         
          try{
            //System.out.println("Ye chla");
           AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("admin_login.fxml"));
        Stage dashboardstage= new Stage();
        dashboardstage.setTitle("Admin_signup/admin_login");
        Scene scene = new Scene(root,600,400);
        dashboardstage.setScene(scene);
        dashboardstage.show();
        
        
        }
          catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        
        
        
        
        
      
    }
catch(Exception e){
    e.printStackTrace();
}    
        
    }
    }
    
}
