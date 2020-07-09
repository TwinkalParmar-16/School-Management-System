/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mangement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author user
 */
public class dynamicviews {
    private dynamicviews(){
    
}
    public static void loadBorderCenter(BorderPane border_pane,String resource) 
    {
        Parent p = null;
        try {
            p = FXMLLoader.load(new dynamicviews().getClass().getResource(resource+".fxml"));
        } catch (IOException ex) {
            Logger.getLogger(dynamicviews.class.getName()).log(Level.SEVERE, null, ex);
        }
       //Parent teachers = FXMLLoader.load(new dynamicviews().getClass().getResource(resource+".fxml"));
        border_pane.setCenter(p);
         //borderPane.setCenter(teachers);
    }
}
