/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finalpjt.dao;

import com.finalpjt.entity.User;


public interface UserDao {
    
    public void addUser(User user);
    
    public User getUser(Long id);
    
    
    
}
