/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.quize.app.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author vaibh
 */
public class DBConnection {
    
    private static Connection conn=null;
    static{
         try
        {
        Class.forName("oracle.jdbc.OracleDriver");
        
        conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-L6G2U19:1521/xe","tech","quize");
        JOptionPane.showMessageDialog(null," Connection Done succesfully ","DB COnnection",JOptionPane.INFORMATION_MESSAGE);
        
        }catch(SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Errore in Connection ","DB COnnection",JOptionPane.ERROR);
        }catch(ClassNotFoundException clf)
        {
            clf.printStackTrace();
             JOptionPane.showMessageDialog(null,"Errore in Class Not Found ","DB COnnection",JOptionPane.ERROR);
        }
    }
    public static Connection getConnection() 
    {
       
        return conn;
    }
    
      public static void  closeConnection()
      {
          if(conn!=null)
          {
              try{
            conn.close();
              JOptionPane.showMessageDialog(null," Connection Close succesfully ","DB COnnection",JOptionPane.INFORMATION_MESSAGE);
        
              }catch(SQLException e)
              {
                   e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Errore in Closing Connection ","DB COnnection",JOptionPane.ERROR);
              }
          }
      }
    
    
}
