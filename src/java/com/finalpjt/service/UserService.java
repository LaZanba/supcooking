/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finalpjt.service;

import com.finalpjt.dao.UserDao;
import com.finalpjt.entity.User;
import javax.ejb.EJB;
import javax.ejb.Stateless;


@Stateless
public class UserService {

    @EJB
    private UserDao userDao;
    
    public void addUser(User user) {
        userDao.addUser(user);
    }
    
    public User getUser(Long userId) {
        
        System.out.println(userId);
        
        return userDao.getUser(userId);
    }
    
}
