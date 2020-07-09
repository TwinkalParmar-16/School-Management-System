/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mangement;

import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;


/**
 *
 * @author user
 */
public class HelperStage {
    private HelperStage(){
    
    }
    
    public static void close(Node node){
     ImageView img = (ImageView) node;
     Stage window = (Stage) img.getScene().getWindow();
     window.close();
    }
    
}
