/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.quize.app.dao;

import com.tech.quize.app.dbutil.DBConnection;
import com.tech.quize.app.entityPoJo.QuestionPojo;
import com.tech.quize.app.entityPoJo.QuestionStorePojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vaibh
 */
public class QuestionDAO {
    
    public static void addQuestion(QuestionStorePojo questionStore)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        ArrayList<QuestionPojo> questionList=questionStore.getAllQuestions();
        
        PreparedStatement ps= conn.prepareStatement("insert into question values(?,?,?,?,?,?,?,?,?)");
       
        for(QuestionPojo ques:questionList)
            {
                ps.setString(1,ques.getExamId() );
                ps.setInt(2,ques.getQno());
                ps.setString(3, ques.getQuestion());
                ps.setString(4, ques.getAnswer1());
                ps.setString(5, ques.getAnswer2());
                ps.setString(6, ques.getAnswer3());
                ps.setString(7, ques.getAnswer4());
                ps.setString(8, ques.getCorrectAnswer());
                ps.setString(9,ques.getLanguage());
                ps.executeUpdate();
             }
    }
    
    
    public static ArrayList<QuestionPojo>  getQuestionsByExamId(String examId) throws SQLException
    {
        ArrayList<QuestionPojo> questionList=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from question where examid=? order by qno");
        ps.setString(1,examId);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
               int qno=rs.getInt(2);
               String question=rs.getString(3);
               String option1=rs.getString(4);
               String option2=rs.getString(5);
               String option3=rs.getString(6);
               String option4=rs.getString(7);
               String correctAnswer=rs.getString(8);
               String language=rs.getString(9);
               QuestionPojo obj=new QuestionPojo(examId,qno,language,option1,option2,option3,option4,correctAnswer,question);
               questionList.add(obj);
    }
    return questionList;
    
    }

    public static void updateQuestions(QuestionStorePojo qStore)throws SQLException{
       ArrayList<QuestionPojo> qlist=qStore.getAllQuestions();
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("update question set  QUESTION=?,answer1=?,answer2=?,answer3=?,answer4=?,correct_answer=? where examid=? and qno=?");
       
       for(QuestionPojo obj:qlist)
       {
           ps.setString(1, obj.getQuestion());
           ps.setString(2, obj.getAnswer1());
           ps.setString(3, obj.getAnswer2());
           ps.setString(4, obj.getAnswer3());
           ps.setString(5, obj.getAnswer4());
           ps.setString(6, obj.getCorrectAnswer());
           ps.setString(7, obj.getExamId());
           ps.setInt(8,obj.getQno());

           ps.executeUpdate();
       }
        
        
    }
  }
