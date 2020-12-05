/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.quize.app.dao;

import com.tech.quize.app.dbutil.DBConnection;
import com.tech.quize.app.entityPoJo.PerformencePojo;
import com.tech.quize.app.entityPoJo.StudentScorePojo;
import com.tech.quize.app.entityPoJo.UsersProfilePojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author vaibh
 */
public class PERFORMENCEDAO {

    public static ArrayList<String> getAllExamId(String userId) throws SQLException{
       ArrayList<String> examIdList=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select examid from PERFORMENCE where userid=?");
       ps.setString(1, userId);
        ResultSet rs=ps.executeQuery();
           
           while(rs.next()){
               String id=rs.getString(1);
               examIdList.add(id);
           }
               
    return examIdList;                      

    }
    
  public static void addPerformance(PerformencePojo performance)throws SQLException{
    String qry="Insert into performence values(?,?,?,?,?,?,?)";
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
           ps.setString(1, performance.getUserId());
           ps.setString(2, performance.getExamId());
           ps.setInt(3,performance.getRight());
           ps.setInt(4,performance.getWrong());
           ps.setInt(5,performance.getUnattempted());
           ps.setDouble(6,performance.getPer());
           ps.setString(7,performance.getLanguage());
           ps.executeUpdate();
           }

  public static PerformencePojo getlangperByExamid(String examid)throws SQLException{
    String qry="select LANGUAGE,PER from performence where userid=? and examid=?";
    PerformencePojo p=new PerformencePojo();
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
           ps.setString(1, UsersProfilePojo.getUserId());
           ps.setString(2, examid);
          ResultSet rs= ps.executeQuery();
            rs.next();
            p.setLanguage(rs.getString(1));
            p.setPer(rs.getDouble(2));
            return p;
  
  }

  
  
  public static ArrayList<String> getAllStudentId()throws SQLException
    {
       String qry="select distinct userid from performence";
       ArrayList<String> studentIdList=new ArrayList<>();
       Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery(qry);
           
           while(rs.next()){
               String id=rs.getString(1);
               studentIdList.add(id);
           }
               
    return studentIdList;                      
   }

    public static ArrayList<String> getAllExamIdbyUserId(String userId)throws SQLException
    {
       String qry="select examid from performence where userid=?";
       ArrayList<String> examIdList=new ArrayList<>();
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement(qry);
       ps.setString(1, userId);
       ResultSet rs=ps.executeQuery();
        while(rs.next()){
               String id=rs.getString(1);
               examIdList.add(id);
           }
    return examIdList;                      
   }
   public static StudentScorePojo getScore(String studentId,String examId)throws SQLException{
        String qry="Select language,per from Performence where userid=? and examid=?";
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,studentId);
        ps.setString(2,examId);
        ResultSet rs=ps.executeQuery();
        rs.next();
        StudentScorePojo scoreObj=new StudentScorePojo();
        scoreObj.setLanguage(rs.getString(1));
        scoreObj.setPer(rs.getDouble(2));
        return scoreObj;
        }

   
   public static ArrayList<PerformencePojo> getAllData()throws SQLException
   {
       ArrayList<PerformencePojo> allperPerformence=new ArrayList<>();
       Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs= st.executeQuery("Select * from performence");
       while (rs.next()) {
           PerformencePojo p=new PerformencePojo(rs.getString(2), rs.getString(7), rs.getString(1), rs.getInt(3), rs.getShort(4), rs.getShort(5), rs.getShort(6));
           
           allperPerformence.add(p);
           
       }
        
        
        return allperPerformence;
   }
   
   
}
