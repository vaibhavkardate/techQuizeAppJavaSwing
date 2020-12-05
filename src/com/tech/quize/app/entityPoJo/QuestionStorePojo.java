/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.quize.app.entityPoJo;

import java.util.ArrayList;

/**
 *
 * @author vaibh
 */
public class QuestionStorePojo {
    
    private ArrayList<QuestionPojo> questionList;

    public QuestionStorePojo() {
        questionList=new ArrayList<>();
        
    }
    
    public void addQuestion(QuestionPojo question)
    {
        questionList.add(question);
    }
     public QuestionPojo getQuestionByQno(int qno)
    {
        for(QuestionPojo quest: questionList){
            if(quest.getQno()==qno)
                return quest;
        }
        return null;
    }

    @Override
    public String toString() {
        return "QuestionStorePojo{" + "questionList=" + questionList + '}';
    }
    
    public void removeQuestion(int qno)
    {
        questionList.remove(qno);
    }
    
      public QuestionPojo getQuestion(int pos)
      {
        return questionList.get(pos);
       }

      public void setQuestionAt(int pos,QuestionPojo q)
      {
        questionList.add(pos, q);
       }
      public ArrayList<QuestionPojo> getAllQuestions()
      {
        return questionList;
       }
      
      public int getCount(){
        return questionList.size();
    }
 
}
