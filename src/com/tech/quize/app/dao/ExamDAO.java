/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.quize.app.dao;

import com.tech.quize.app.dbutil.DBConnection;
import com.tech.quize.app.entityPoJo.ExamPOJO;
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
public class ExamDAO {
    
    public static String getExamId()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st= conn.createStatement();
        ResultSet rs=st.executeQuery("select count(*) from exam");
        rs.next();
        int count=rs.getInt(1);
        
        return "EX-"+(count+1);
    }
    
    public static boolean addExam(ExamPOJO examPOJO)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into exam values(?,?,?)");
        ps.setString(1, examPOJO.getExamId());
        ps.setString(2, examPOJO.getLanguage());
        ps.setInt(3,examPOJO.getTotalQue());
        int ans= ps.executeUpdate();
        
        return ans==1;
    }
    
     public static  ArrayList<String> getExamIdBySubject(String  subject)throws SQLException
    {
        ArrayList<String> examid=new ArrayList<String>();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select examid from exam where language=?");
        ps.setString(1, subject);
        ResultSet rs= ps.executeQuery();
        while(rs.next())
        {
           examid.add(rs.getString(1));
        }
        return examid;
    }
     
     public static int getQuestionCountByExamID(String  examid)throws SQLException
    {
        
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select TOTAL_QUESTION from exam where EXAMID=?");
        ps.setString(1, examid);
        ResultSet rs= ps.executeQuery();
        rs.next();
        return rs.getInt(1);
    }

    public static boolean updateStudentDataByUserID(String cheUserID, String chePassword)throws SQLException{
         Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set userid=? ,password=? where userid=? and Usertype='student'");
        ps.setString(1, cheUserID);
         ps.setString(2, chePassword);
          ps.setString(3,UsersProfilePojo.getUserId());
        int rs= ps.executeUpdate();
       return rs==1;
    }

    public static boolean isAnyPaperSet(String toString)throws SQLException{
        
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps= conn.prepareStatement("Select examid from exam where  LANGUAGE=?");
        ps.setString(1, toString);
       ResultSet rs= ps.executeQuery();
       return rs.next();
    }
     
    //for only not give exams of that subject  
     public static ArrayList<String> getExamIdBySubject(String userid,String subject)throws SQLException{
         
          ArrayList<String> examid=new ArrayList<String>();
         Connection conn=DBConnection.getConnection();
        PreparedStatement ps= conn.prepareStatement("Select examid from Exam where language= ? minus Select examid from performence where userid=?");
        ps.setString(2, userid);
        ps.setString(1, subject);
       ResultSet rs= ps.executeQuery();
       while(rs.next())
       {
           examid.add(rs.getString(1));
       }
       return examid;
     }
     
    public static int getQuestionCountByExam(String examId)throws SQLException{
        String qry="select total_question from Exam where examid=?";
        Connection conn=DBConnection.getConnection();
          PreparedStatement ps=conn.prepareStatement(qry);
          ps.setString(1,examId);
          ResultSet rs=ps.executeQuery();
	    rs.next();
          int rowCount=rs.getInt(1);
          return rowCount;
        }
 
     
    
}
