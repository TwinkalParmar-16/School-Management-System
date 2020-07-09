/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mangement;

import javafx.scene.Parent;
import javafx.scene.control.Dialog;
import javafx.stage.StageStyle;

/**
 *
 * @author user
 */
public class HelperDialogs {
    
    private HelperDialogs(){
    
    }
    
    public static Dialog getDialog(String resouce )
    {
        Parent root =HelperLoadResources.loadFXML( resouce);
        Dialog dialog = new Dialog();
        dialog.getDialogPane().setContent(root);
        
        root.setStyle("-fx-background-color:transparent");
        
        dialog.initStyle(StageStyle.TRANSPARENT);
        dialog.show();
 
        return dialog;
    
    }
}
