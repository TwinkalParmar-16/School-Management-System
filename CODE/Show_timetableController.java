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
import javafx.scene.control.TextField;
import static school_mangement.Admin_loginController.infoBox;

/**
 * FXML Controller class
 *
 * @author user
 */
public class Show_timetableController implements Initializable {

    @FXML
    private TextField search_t;
    @FXML
    private Insets x1;
    @FXML
    private Insets x2;
    @FXML
    private TextField t1;
    @FXML
    private Insets x3;
    @FXML
    private TextField t6;
    @FXML
    private TextField t11;
    @FXML
    private TextField t16;
    @FXML
    private TextField t21;
    @FXML
    private TextField t2;
    @FXML
    private TextField t7;
    @FXML
    private TextField t12;
    @FXML
    private TextField t17;
    @FXML
    private TextField t22;
    @FXML
    private TextField t3;
    @FXML
    private TextField t8;
    @FXML
    private TextField t13;
    @FXML
    private TextField t18;
    @FXML
    private TextField t23;
    @FXML
    private TextField t4;
    @FXML
    private TextField t9;
    @FXML
    private TextField t14;
    @FXML
    private TextField t19;
    @FXML
    private TextField t24;
    @FXML
    private TextField t5;
    @FXML
    private TextField t10;
    @FXML
    private TextField t15;
    @FXML
    private TextField t20;
    @FXML
    private TextField t25;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void search(ActionEvent event) throws SQLException {
        DbConnection connectionClass=new DbConnection();
     String dbname="oop";
     String userName="root";
     String password="";
     Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
      
     try {    
         
        String p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25;
         //String a1=search_t.getText();
         PreparedStatement pstmt;
         ResultSet rs;
         pstmt = connection.prepareStatement("SELECT * FROM timetable "); 
         //pstmt.setString(1,a1); 
         rs = pstmt.executeQuery(); 
          
          if(!rs.next()){
                infoBox("Result not found!!!", null, "Failed");
            }
          else{
              rs = pstmt.executeQuery();
              System.out.println("else");
         while (rs.next()) 
         {        
           p1= rs.getString(1);        
          p2= rs.getString(2);
          p3= rs.getString(3);
          p4= rs.getString(4);
          p5= rs.getString(5);
          p6= rs.getString(6);        
          p7= rs.getString(7);
          p8= rs.getString(8);
          p9= rs.getString(9);
          p10= rs.getString(10);
          p11= rs.getString(11);        
          p12= rs.getString(12);
          p13= rs.getString(13);
          p14= rs.getString(14);
          p15= rs.getString(15);
          p16= rs.getString(16);        
          p17= rs.getString(17);
          p18= rs.getString(18);
          p19= rs.getString(19);
          p20= rs.getString(20);
          p21= rs.getString(21);        
          p22= rs.getString(22);
          p23= rs.getString(23);
          p24= rs.getString(24);
          p25= rs.getString(25);
          
            t1.setText(p1);
            t2.setText(p2);
            t3.setText(p3);
            t4.setText(p4);
            t5.setText(p5);
             t6.setText(p6);
            t7.setText(p7);
            t8.setText(p8);
            t9.setText(p9);
            t10.setText(p10);
            t11.setText(p11);
            t12.setText(p12);
            t13.setText(p13);
            t14.setText(p14);
            t15.setText(p15);
             t16.setText(p16);
            t17.setText(p17);
            t18.setText(p18);
            t19.setText(p19);
            t20.setText(p20);
            t21.setText(p21);
            t22.setText(p22);
            t23.setText(p23);
            t24.setText(p24);
            t25.setText(p25);
             
          


         // System.out.println(first_name +" "+last_name+" "+city+" "+mobile_num+" "+gaurdian_of+" "+salary);
         }
          }
         rs.close();                        
         pstmt.close();                     
      } catch(SQLException e) {
         System.out.println("SQL exception occured" + e);
      }
    }
    
}
