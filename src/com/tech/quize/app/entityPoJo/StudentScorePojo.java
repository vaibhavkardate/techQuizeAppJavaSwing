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
public class StudentScorePojo {
    
    private String language;
    private double per;

    public StudentScorePojo() {
    }

    public StudentScorePojo(String language, double per) {
        this.language = language;
        this.per = per;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }
   
    
    
}
