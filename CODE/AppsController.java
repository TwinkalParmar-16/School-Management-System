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
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class AppsController implements Initializable {

    @FXML
    private Font x1;
    @FXML
    private Button b1;
    @FXML
    private Insets x2;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private Button b5;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
 
    

    @FXML
    public void add_dashboard(ActionEvent event){
        try{
            System.out.println("Ye chla");
            AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Dashboardnew.fxml"));
        Stage dashboardstage= new Stage();
         dashboardstage.setTitle("Apps/Dashboardnew");
        Scene scene = new Scene(root,890,670);
        scene.getStylesheets().add(getClass().getResource("apps.css").toExternalForm());
        dashboardstage.setScene(scene);
        dashboardstage.show();
        
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

   

    @FXML
    public void show_parents(ActionEvent event) {
         try{
            System.out.println("Ye chla");
            AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("new_parents.fxml"));
        Stage dashboardstage= new Stage();
         dashboardstage.setTitle("Apps/new_parents");
        Scene scene = new Scene(root,986,649);
        dashboardstage.setScene(scene);
        dashboardstage.show();
        
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    public void show_teachers(ActionEvent event) {
        try{
            System.out.println("Ye chla");
            AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("new_teacher.fxml"));
        Stage dashboardstage= new Stage();
         dashboardstage.setTitle("Apps/new_teacher");
        Scene scene = new Scene(root,971,517);
        dashboardstage.setScene(scene);
        dashboardstage.show();
        
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    public void show_students(ActionEvent event) {
        try{
            //System.out.println("Ye chla");
            AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("new_students.fxml"));
        Stage dashboardstage= new Stage();
        dashboardstage.setTitle("Apps/new_students");
        Scene scene = new Scene(root,971,517);
        dashboardstage.setScene(scene);
        dashboardstage.show();
        
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    private void show_timetable(ActionEvent event) {
        
          try{
            //System.out.println("Ye chla");
        AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("timetable.fxml"));
        Stage dashboardstage= new Stage();
        dashboardstage.setTitle("Apps/timetable");
        Scene scene = new Scene(root,997,742);
        dashboardstage.setScene(scene);
        dashboardstage.show();
        
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }
    

    

    

    
}
