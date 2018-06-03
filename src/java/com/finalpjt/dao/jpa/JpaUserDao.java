/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finalpjt.dao.jpa;

import com.finalpjt.dao.UserDao;
import com.finalpjt.entity.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Stateless
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

    @Override
    public User getConnecteUser(String userName, String password) {
       CriteriaBuilder cb = em.getCriteriaBuilder();
       CriteriaQuery qu =  cb.createQuery(User.class);
       Root<User> user = qu.from(User.class);
       
       qu.select(user);
       qu.where(cb.equal(user.get("login"), userName),
                cb.equal(user.get("password"), password)
       );
       
       return (User) em.createQuery(qu).getResultList().get(0);
    }
    
    
            
}
