/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.quize.app.entityPoJo;

/**
 *
 * @author vaibh
 */
public class ExamPOJO {
    
    private String examId;
    private String language;
    private int totalQue;

    public ExamPOJO(String examId, String language, int totalQue) {
        this.examId = examId;
        this.language = language;
        this.totalQue = totalQue;
    }

    public ExamPOJO() {
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getTotalQue() {
        return totalQue;
    }

    public void setTotalQue(int totalQue) {
        this.totalQue = totalQue;
    }
        
        
    
}
