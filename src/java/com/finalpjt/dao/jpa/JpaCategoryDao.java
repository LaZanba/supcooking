/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finalpjt.dao.jpa;

import com.finalpjt.dao.CategoryDao;
import com.finalpjt.entity.Category;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

@Stateless
public class JpaCategoryDao implements CategoryDao{
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public void addCategory(Category category) {
        em.persist(category);
    }

    @Override
    public List<Category> getAllCategory() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        
        CriteriaQuery<Category> query = cb.createQuery(Category.class);

        return em.createQuery(query).getResultList(); 
    }

    @Override
    public void updateCategory(Category category) {
       em.merge(category);
    }

    @Override
    public Category findCategoryById(Long categoryId) {
        return em.find(Category.class, categoryId);
    }

    
    
}
