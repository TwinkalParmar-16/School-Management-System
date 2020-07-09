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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class MainController implements Initializable {

    @FXML
    private Button b1;
    @FXML
    private Button b2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void LOGIN(ActionEvent event) {
        try{
            //System.out.println("Ye chla");
             
            AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("loginas.fxml"));
        Stage dashboardstage= new Stage();
        dashboardstage.setTitle("Main/loginas");
        Scene scene = new Scene(root,997,373);
        scene.getStylesheets().add(getClass().getResource("apps.css").toExternalForm());
        dashboardstage.setScene(scene);
        dashboardstage.show();
        
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }

    @FXML
    private void SIGNUP(ActionEvent event) {
         try{
            //System.out.println("Ye chla");
             
            AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("signup.fxml"));
        Stage dashboardstage= new Stage();
        dashboardstage.setTitle("Main/signupas");
        Scene scene = new Scene(root,997,373);
        scene.getStylesheets().add(getClass().getResource("apps.css").toExternalForm());
        dashboardstage.setScene(scene);
        dashboardstage.show();
        
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
