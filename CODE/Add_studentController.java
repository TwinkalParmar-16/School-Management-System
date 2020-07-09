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
public class Add_studentController implements Initializable {

    @FXML
    private Font x1;
    @FXML
   
    private TextField t1;
    @FXML
    private TextField t2;
    @FXML
    private TextField t3;
    @FXML
    private TextField t4;
    @FXML
    private TextField t5;
    @FXML
    private Insets x3;
    @FXML
    private TextField t6;
    @FXML
    private Insets x2;
    @FXML
     private TextField t7;
    @FXML
    private Button b2;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   
    PreparedStatement preparedStatement2 = null;
    ResultSet resultSet = null;
    @FXML
    public void add_students(ActionEvent event) throws SQLException {
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
        String a5=t5.getText().toString();
         String a6=t6.getText().toString();
        String a7=t7.getText().toString();
        //System.out.println( "Insert into login(username,password)VALUES (" + "'" + t1.getText() + "'" + "," + "'" + t2.getText() + "'" +")");
        
        String sql = "INSERT INTO `add_students`( `first_name`, `last_name`, `city`, `age`, `gender`, `mob_num`,'class') VALUES(?,?,?,?,?,?,?)";
    //PreparedStatement pst=connection.prepareStatement(sql);
    try{
        
         preparedStatement2 = connection.prepareStatement(sql);
        preparedStatement2.setString(1,a1);
        preparedStatement2.setString(2,a2);
        preparedStatement2.setString(3,a3);
        preparedStatement2.setString(4,a4);
        preparedStatement2.setString(5,a5);
        preparedStatement2.setString(6,a6);
       preparedStatement2.setString(7,a7);
       System.out.println(a1);
        preparedStatement2.executeUpdate();
        System.out.println("hello");
        infoBox("Added Successfully",null,"Success" );
    //Statement statement = connection.createStatement();
    //statement.executeUpdate(sql);
    }
catch(Exception e){
    e.printStackTrace();
}    
    
    }

    @FXML
    private void close(MouseEvent event) {
        HelperStage.close((Node)event.getSource());
    }
    
}
