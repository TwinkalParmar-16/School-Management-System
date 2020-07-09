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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import static school_mangement.Admin_loginController.infoBox;

/**
 * FXML Controller class
 *
 * @author user
 */
public class Add_teacherController implements Initializable {

    @FXML
    private Font x1;
    @FXML
    private Insets x3;
    @FXML
    private Insets x2;
    @FXML
    private TextField p1;
    @FXML
    private TextField p2;
    @FXML
    private TextField p3;
    @FXML
    private TextField p4;
    @FXML
    private TextField p5;
    @FXML
    private TextField p6;
    /**
     * Initializes the controller class.
     */
    PreparedStatement preparedStatement2 = null;
    ResultSet resultSet = null;
    @FXML
    private Button c1;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
     @FXML
    public void close(MouseEvent event) {
        
        HelperStage.close((Node)event.getSource());
        
    }

   

    @FXML
    private void addDB_teacher(ActionEvent event) throws SQLException {
        
        DbConnection connectionClass=new DbConnection();
        String dbname="oop";
        String userName="root";
        String password="";
    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
    
        //System.out.println(t1.getText());
        String a1=p1.getText().toString();
        String a2=p2.getText().toString();
        String a3=p3.getText().toString();
         String a4=p4.getText().toString();
        String a5=p5.getText().toString();
         String a6=p6.getText().toString();
         
         
        //System.out.println( "Insert into login(username,password)VALUES (" + "'" + t1.getText() + "'" + "," + "'" + t2.getText() + "'" +")");
        
        String sql = "Insert into add_teacher(   `first_name`, `last_name`, `city`, `degree`, `age`, `subjects`)VALUES(?,?,?,?,?,?)";
    //PreparedStatement pst=connection.prepareStatement(sql);
    try{
                PreparedStatement preparedStatement2 = connection.prepareStatement(sql);
        preparedStatement2.setString(1,a1);
        preparedStatement2.setString(2,a2);
        preparedStatement2.setString(3,a3);
        preparedStatement2.setString(4,a4);
        preparedStatement2.setString(5,a5);
        preparedStatement2.setString(6,a6);
        
        preparedStatement2.executeUpdate();
        infoBox("Added Successfully",null,"Success" );
         //message.setText("Inserted Sucessfully"); 
    //Statement statement = connection.createStatement();
    //statement.executeUpdate(sql);
    }
catch(Exception e){
    e.printStackTrace();
}    
  
        
    }

    
}
