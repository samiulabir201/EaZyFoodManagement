/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author samiu
 */
public class tables {
    public static void main(String[] args)
    {
        Connection con = null;
        Statement st = null;
        try
        {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            //st.executeUpdate("create table users(name varchar(200),email varchar(200),password varchar(50),securityQuestion varchar(50), answer varchar(200),address varchar(200),status varchar(20));");
            //st.executeUpdate("create table food(OrderNo varchar(10),orderType varchar(200),food varchar(200),price int,status varchar(20))");
            st.executeUpdate("create table customer2(id int , name varchar(200),mobileNumber varchar(10),email varchar(200),address varchar(200),takeOrder varchar(50),orderNo varchar(10),food varchar(200),orderType varchar(200),price int(10),status varchar(20),confirmOrder varchar(50))");
            JOptionPane.showMessageDialog(null, "Table Created");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
        {
            con.close();
            st.close();
        }
        catch(Exception e)
        {
            
        }
        }
    }
    
}
