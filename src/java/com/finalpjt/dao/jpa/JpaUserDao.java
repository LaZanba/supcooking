/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finalpjt.dao.jpa;

import com.finalpjt.dao.UserDao;
import com.finalpjt.entity.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class JpaUserDao implements UserDao{
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Override
    public User getUser(Long userId) {
        return em.find(User.class, userId);
    }
        
    
}
