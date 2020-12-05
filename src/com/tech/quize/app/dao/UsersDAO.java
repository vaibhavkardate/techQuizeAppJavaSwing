/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.quize.app.dao;

import com.tech.quize.app.dbutil.DBConnection;
import com.tech.quize.app.entityPoJo.UsersPOJO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vaibh
 */
public class UsersDAO {

    /**
     * @param args the command line arguments
     */
    
    //for valid userid and password
    public static boolean validateUser(UsersPOJO user)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where userid=? and password=? and usertype=?");
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUserType());
        
        ResultSet rs=ps.executeQuery();
        return rs.next();
    }

    public static boolean registerUser(UsersPOJO user) throws SQLException{
       Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into users values(?,?,?)");
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUserType());
        
        int  rs=ps.executeUpdate();
        if(rs>0)
        {
        return true;
        }
        else
            return false;
    }
    
}
