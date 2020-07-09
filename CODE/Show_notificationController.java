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
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import static school_mangement.Admin_loginController.infoBox;

/**
 * FXML Controller class
 *
 * @author user
 */
public class Show_notificationController implements Initializable {

    @FXML
    private TextArea t1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        // TODO
    }    

    @FXML
    private void notify_stu(ActionEvent event) throws SQLException {
        
                DbConnection connectionClass=new DbConnection();
             String dbname="oop";
        String userName="root";
        String password="";
    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
    
        //System.out.println(t1.getText());
        String a1=t1.getText().toString();
        
        //System.out.println( "Insert into login(username,password)VALUES (" + "'" + t1.getText() + "'" + "," + "'" + t2.getText() + "'" +")");
        
        String sql = "INSERT INTO `query2` (`comment`, `by_whom`,`to_whom`) VALUES (?,'teacher','student')";
    //PreparedStatement pst=connection.prepareStatement(sql);
    try{
        PreparedStatement preparedStatement2 = connection.prepareStatement(sql);
        preparedStatement2.setString(1,a1);
        preparedStatement2.executeUpdate();
        
        infoBox("Query added sucessfully",null,"Success" );
    //Statement statement = connection.createStatement();
    //statement.executeUpdate(sql);
    }
catch(Exception e){
    e.printStackTrace();
}  
    }

    @FXML
    private void notify_parent(ActionEvent event) throws SQLException {
                         DbConnection connectionClass=new DbConnection();
             String dbname="oop";
        String userName="root";
        String password="";
    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
    
        //System.out.println(t1.getText());
        String a1=t1.getText().toString();
        
        //System.out.println( "Insert into login(username,password)VALUES (" + "'" + t1.getText() + "'" + "," + "'" + t2.getText() + "'" +")");
        
        String sql = "INSERT INTO `query1` (`comment`, `by_whom`,`to_whom`) VALUES (?,'teacher','parent')";
    //PreparedStatement pst=connection.prepareStatement(sql);
    try{
        PreparedStatement preparedStatement2 = connection.prepareStatement(sql);
        preparedStatement2.setString(1,a1);
        preparedStatement2.executeUpdate();
        
                infoBox("Query added sucessfully",null,"Success" );

    //Statement statement = connection.createStatement();
    //statement.executeUpdate(sql);
    }
catch(Exception e){
    e.printStackTrace();
} 
    }
}

    
    /*private void notify_both(ActionEvent event) throws SQLException {
                       DbConnection connectionClass=new DbConnection();
             String dbname="oop";
        String userName="root";
        String password="";
    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
    
        //System.out.println(t1.getText());
        String a1=t1.getText().toString();
        
        //System.out.println( "Insert into login(username,password)VALUES (" + "'" + t1.getText() + "'" + "," + "'" + t2.getText() + "'" +")");
        
        String sql = "INSERT INTO `query1` (`comment`, `by`,`to`) VALUES (?,'teacher','all')";
        String sql = "INSERT INTO `query2` (`comment`, `by`,`to`) VALUES (?,'teacher','all')";
    //PreparedStatement pst=connection.prepareStatement(sql);
    try{
        PreparedStatement preparedStatement2 = connection.prepareStatement(sql);
        preparedStatement2.setString(1,a1);
        preparedStatement2.executeUpdate();
        infoBox("Query added sucessfully",null,"Success" );
        
        
    //Statement statement = connection.createStatement();
    //statement.executeUpdate(sql);
    }
catch(Exception e){
    e.printStackTrace();
} */
    
    

