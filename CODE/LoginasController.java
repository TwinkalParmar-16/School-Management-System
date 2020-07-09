/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mangement;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class LoginasController implements Initializable {

    @FXML
    private Font x1;
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void login_admin(ActionEvent event) {
        try{
            //System.out.println("Ye chla");
             Stage s = (Stage)b1.getScene().getWindow();
        s.close();
            AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("admin_login.fxml"));
        Stage dashboardstage= new Stage();
        dashboardstage.setTitle("loginas/admin_login");
        Scene scene = new Scene(root,600,400);
        dashboardstage.setScene(scene);
        dashboardstage.show();
        
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    private void login_teacher(ActionEvent event) {
        try{
            //System.out.println("Ye chla");
             Stage s = (Stage)b2.getScene().getWindow();
        s.close();
            AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("teacher_login.fxml"));
        Stage dashboardstage= new Stage();
        dashboardstage.setTitle("loginas/teacher_login");
        Scene scene = new Scene(root,600,400);
        dashboardstage.setScene(scene);
        dashboardstage.show();
        
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    private void login_student(ActionEvent event) {
        try{
             Stage s = (Stage)b3.getScene().getWindow();
        s.close();
            //System.out.println("Ye chla");
            AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("student_login.fxml"));
        Stage dashboardstage= new Stage();
        dashboardstage.setTitle("loginas/student_login");
        Scene scene = new Scene(root,600,400);
        dashboardstage.setScene(scene);
        dashboardstage.show();
        
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    private void login_parent(ActionEvent event) {
        try{
             Stage s = (Stage)b4.getScene().getWindow();
        s.close();
            //System.out.println("Ye chla");
            AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("parent_login.fxml"));
        Stage dashboardstage= new Stage();
        dashboardstage.setTitle("loginas/parent_login");
        Scene scene = new Scene(root,600,400);
        dashboardstage.setScene(scene);
        dashboardstage.show();
        
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    
}
