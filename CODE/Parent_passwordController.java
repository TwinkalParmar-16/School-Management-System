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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static school_mangement.Admin_loginController.infoBox;

/**
 * FXML Controller class
 *
 * @author user
 */
public class Parent_passwordController implements Initializable {

    @FXML
    private TextField t1;
    @FXML
    private PasswordField t2;
    @FXML
    private PasswordField t3;
    @FXML
    private PasswordField t4;
    @FXML
    private Button b1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void update_password(ActionEvent event) throws SQLException {
        DbConnection connectionClass=new DbConnection();
             String dbname="oop";
        String userName="root";
        String password="";
    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
    
        //System.out.println(t1.getText());
        String a1=t1.getText().toString();
        String a2=t2.getText().toString();
        String a3=t3.getText().toString();
        String a4=t4.getText().toString();
        if(a1.isEmpty())
         {
            infoBox("Please enter your username",null,"Error");
            //signup();
            
         }
         else if(a2.isEmpty())
         {
            infoBox("Please enter your old password",null,"Error"); 
            
         }
        else if(a3.isEmpty())
         {
            infoBox("Please enter your password",null,"Error"); 
            
         }
        else if(a4.isEmpty())
         {
            infoBox("Please RE-Enter your password",null,"Error"); 
            
         }
        else if(!a3.equals(a4))
        {
        infoBox("Password does not match..try again!!",null,"OOps!"); 
        }
        else{
        String sql = "UPDATE `parents_login` SET `username`=?,`password`=? WHERE username=? and password=?";
    //PreparedStatement pst=connection.prepareStatement(sql);
    try{
        
        PreparedStatement preparedStatement2 = connection.prepareStatement(sql);
        preparedStatement2.setString(1,a1);
        preparedStatement2.setString(2,a3);
        preparedStatement2.setString(3,a1);
        preparedStatement2.setString(4,a2);
        
        preparedStatement2.executeUpdate();
        infoBox("Updated Successfully",null,"Success" );
         Stage s = (Stage)b1.getScene().getWindow();
        s.close();
        
    }
     catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
    }
    
}
