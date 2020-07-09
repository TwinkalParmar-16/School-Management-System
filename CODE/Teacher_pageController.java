/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mangement;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class Teacher_pageController implements Initializable {

    @FXML
    private Font x1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    



    @FXML
    private void show_notification(ActionEvent event) {
        
        try{
            
           //  Stage s = (Stage)b1.getScene().getWindow();
        //s.close();
        
        AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("show_notification.fxml"));
        Stage dashboardstage= new Stage();
        dashboardstage.setTitle("teacher_page/show_notification");
        Scene scene = new Scene(root,620,410);
        dashboardstage.setScene(scene);
        dashboardstage.show();
        //System.out.println("Ye chla");
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }


    @FXML
    private void show_timetable(ActionEvent event) {
        try{
            
           //  Stage s = (Stage)b1.getScene().getWindow();
        //s.close();
        
        AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("show_timetable.fxml"));
        Stage dashboardstage= new Stage();
        dashboardstage.setTitle("teacher_page/show_timetable");
        Scene scene = new Scene(root,997,747);
        dashboardstage.setScene(scene);
        dashboardstage.show();
        //System.out.println("Ye chla");
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    private void update_password(ActionEvent event) {
        try{
            
           //  Stage s = (Stage)b1.getScene().getWindow();
        //s.close();
        
        AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("teacher_password.fxml"));
        Stage dashboardstage= new Stage();
        dashboardstage.setTitle("teacher_page/teacher_password");
        Scene scene = new Scene(root,600,428);
        dashboardstage.setScene(scene);
        dashboardstage.show();
        //System.out.println("Ye chla");
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }

    @FXML
    private void add_result(ActionEvent event) throws IOException {
        try{
        AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("add_result.fxml"));
        Stage dashboardstage= new Stage();
        dashboardstage.setTitle("teacher_page/add_result");
        dashboardstage.setTitle("Teacher-page");
        Scene scene = new Scene(root,600,450);
        dashboardstage.setScene(scene);
        dashboardstage.show();
        //System.out.println("Ye chla");
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }
    
}
