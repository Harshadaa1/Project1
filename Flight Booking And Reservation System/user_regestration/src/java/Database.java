
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Database {
    
     Connection cn=null;
    Statement st=null;
    String Connectdb()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
            return("Database connected");
         }
        catch(Exception ex)
        {
             return(ex.toString());       
         }
    }
    String Query(String sql,String message)
    {
        try
        {
             st=cn.createStatement() ;
             st.executeUpdate(sql);
             return (message);
        } catch (Exception e)
        {
            return (e.toString());
        }
    }   
   
    
}
