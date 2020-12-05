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
public class UsersProfilePojo {
    
    private static String userId;
    private static String userType;

 public UsersProfilePojo() {
    }

    public static String getUserId() {
        return userId;
    }

    public static void setUserId(String userId) {
        UsersProfilePojo.userId = userId;
    }

    public static String getUserType() {
        return userType;
    }

    public static void setUserType(String userType) {
        UsersProfilePojo.userType = userType;
    }
 
 
 
}
