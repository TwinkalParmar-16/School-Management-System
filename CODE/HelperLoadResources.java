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

/**
 *
 * @author user
 */
public class HelperLoadResources {
    
  public static Parent loadFXML(String resouce){
    Parent root = null;
        try {
            root = new FXMLLoader().load(new HelperLoadResources().getClass().getResource(resouce +".fxml"));
        } catch (IOException ex) {
            Logger.getLogger(HelperLoadResources.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return root;
    }
    
}
