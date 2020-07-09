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
public class TimetableController implements Initializable {

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

    @FXML
    private void add_timetable(ActionEvent event) throws SQLException {
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
        String a8=t8.getText().toString();
        String a9=t9.getText().toString();
         String a10=t10.getText().toString();
        String a11=t11.getText().toString();
         String a12=t12.getText().toString();
         String a13=t13.getText().toString();
        String a14=t14.getText().toString();
        String a15=t15.getText().toString();
         String a16=t16.getText().toString();
        String a17=t17.getText().toString();
         String a18=t18.getText().toString();
         String a19=t19.getText().toString();
        String a20=t20.getText().toString();
        String a21=t21.getText().toString();
         String a22=t22.getText().toString();
        String a23=t23.getText().toString();
         String a24=t24.getText().toString();
          String a25=t25.getText().toString();
        //System.out.println( "Insert into login(username,password)VALUES (" + "'" + t1.getText() + "'" + "," + "'" + t2.getText() + "'" +")");
        
        String sql = "INSERT INTO `timetable`(`t1`, `t2`, `t3`, `t4`, `t5`, `t6`, `t7`, `t8`, `t9`, `t10`, `t11`, `t12`, `t13`, `t14`, `t15`, `t16`, `t17`, `t18`, `t19`, `t20`, `t21`, `t22`, `t23`, `t24`, `t25`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    //PreparedStatement pst=connection.prepareStatement(sql);
    try{
        PreparedStatement preparedStatement2 = connection.prepareStatement(sql);
        preparedStatement2.setString(1,a1);
        preparedStatement2.setString(2,a2);
        preparedStatement2.setString(3,a3);
        preparedStatement2.setString(4,a4);
        preparedStatement2.setString(5,a5);
        preparedStatement2.setString(6,a6);
        preparedStatement2.setString(7,a7);
        preparedStatement2.setString(8,a8);
        preparedStatement2.setString(9,a9);
        preparedStatement2.setString(10,a10);
        preparedStatement2.setString(11,a11);
        preparedStatement2.setString(12,a12);
        preparedStatement2.setString(13,a13);
        preparedStatement2.setString(14,a14);
        preparedStatement2.setString(15,a15);
        preparedStatement2.setString(16,a16);
        preparedStatement2.setString(17,a17);
        preparedStatement2.setString(18,a18);
        preparedStatement2.setString(19,a19);
        preparedStatement2.setString(20,a20);
        preparedStatement2.setString(21,a21);
        preparedStatement2.setString(22,a22);
        preparedStatement2.setString(23,a23);
        preparedStatement2.setString(24,a24);
        preparedStatement2.setString(25,a25);
        
        preparedStatement2.executeUpdate();
       
                infoBox("Added Successfully!!!", null, "Success");
            
          
        
    //Statement statement = connection.createStatement();
    //statement.executeUpdate(sql);
    }
catch(Exception e){
    e.printStackTrace();
}    
    
    }

    @FXML
    private void update_timetable(ActionEvent event) throws SQLException {
        DbConnection connectionClass=new DbConnection();
     String dbname="oop";
     String userName="root";
     String password="";
     Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userName,password);
      
     try {    
        String a1=t1.getText().toString();
        String a2=t2.getText().toString();
        String a3=t3.getText().toString();
         String a4=t4.getText().toString();
        String a5=t5.getText().toString();
         String a6=t6.getText().toString();
         String a7=t7.getText().toString();
        String a8=t8.getText().toString();
        String a9=t9.getText().toString();
         String a10=t10.getText().toString();
        String a11=t11.getText().toString();
         String a12=t12.getText().toString();
         String a13=t13.getText().toString();
        String a14=t14.getText().toString();
        String a15=t15.getText().toString();
         String a16=t16.getText().toString();
        String a17=t17.getText().toString();
         String a18=t18.getText().toString();
         String a19=t19.getText().toString();
        String a20=t20.getText().toString();
        String a21=t21.getText().toString();
         String a22=t22.getText().toString();
        String a23=t23.getText().toString();
         String a24=t24.getText().toString();
          String a25=t25.getText().toString();
        
         //String first_name,last_name,city,degree,age,gender;
         String A1=search_t.getText();
         System.out.println(a1);
         System.out.println(a2);System.out.println(a3);System.out.println(a4);
         
         
         
         
         PreparedStatement preparedStatement2;
         ResultSet rs;
        preparedStatement2= connection.prepareStatement("UPDATE `timetable` SET `t1`=?,`t2`=?,`t3`=?,`t4`=?,`t5`=?,`t6`=?,`t7`=?,`t8`=?,`t9`=?,`t10`=?,`t11`=?,`t12`=?,`t13`=?,`t14`=?,`t15`=?,`t16`=?,`t17`=?,`t18`=?,`t19`=?,`t20`=?,`t21`=?,`t22`=?,`t23`=?,`t24`=?,`t25`=? WHERE 1 "); 
         
        preparedStatement2.setString(1,a1);
        preparedStatement2.setString(2,a2);
        preparedStatement2.setString(3,a3);
        preparedStatement2.setString(4,a4);
        preparedStatement2.setString(5,a5);
        preparedStatement2.setString(6,a6);
        preparedStatement2.setString(7,a7);
        preparedStatement2.setString(8,a8);
        preparedStatement2.setString(9,a9);
        preparedStatement2.setString(10,a10);
        preparedStatement2.setString(11,a11);
        preparedStatement2.setString(12,a12);
        preparedStatement2.setString(13,a13);
        preparedStatement2.setString(14,a14);
        preparedStatement2.setString(15,a15);
        preparedStatement2.setString(16,a16);
        preparedStatement2.setString(17,a17);
        preparedStatement2.setString(18,a18);
        preparedStatement2.setString(19,a19);
        preparedStatement2.setString(20,a20);
        preparedStatement2.setString(21,a21);
        preparedStatement2.setString(22,a22);
        preparedStatement2.setString(23,a23);
        preparedStatement2.setString(24,a24);
        preparedStatement2.setString(25,a25);
         
         preparedStatement2.executeUpdate();
         
         
         infoBox("Updated Sucessfully!!!!", null, "Success");
        preparedStatement2.close();                     
      } catch(SQLException e) {
         System.out.println("SQL exception occured" + e);
      }
  
        
    }

    }

    

