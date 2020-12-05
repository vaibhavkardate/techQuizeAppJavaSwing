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
public class AnswerStorePojo {
    ArrayList<AnswerPojo> answerStore ;

    public AnswerStorePojo() {
        answerStore =new ArrayList<AnswerPojo>();
    }
    
    public void addAnswer(AnswerPojo answer){
        answerStore.add(answer);
    }
    public AnswerPojo getAnswer(int pos){
        return answerStore.get(pos);
    }
    public void removeAnswer(int pos){
        answerStore.remove(pos);
    }
    public void setAnswerAt(int pos,AnswerPojo answer){
        answerStore.add(pos, answer);
    }
    public ArrayList<AnswerPojo> getAllAnswers(){
        return answerStore;
    }
    public int getCount(){
        return answerStore.size();
    }
    public AnswerPojo getAnswerByQno(int qno){
        for(AnswerPojo answer: answerStore){
            if(answer.getQno()==qno)
                return answer;
        }
        return null;
    }
    public int removeAnswer(AnswerPojo answer){
       int pos=answerStore.indexOf(answer);
        answerStore.remove(pos);
        return pos;
    }

    
}
