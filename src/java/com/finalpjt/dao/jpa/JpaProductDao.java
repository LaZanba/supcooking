/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finalpjt.dao.jpa;

import com.finalpjt.dao.ProductDao;
import com.finalpjt.entity.Product;
import com.finalpjt.entity.Recipe;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Stateless
public class JpaProductDao implements ProductDao{
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public Product addProduct(Product product) {
        em.persist(product);
        return product;
    }

    @Override
    public List<Product> getAllProductRecipe(Recipe recipe) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery qu = cb.createQuery(Product.class);
        Root<Product> product = qu.from(Product.class);
        
        qu.where(cb.equal(product.get("coockingRecipe"), recipe));
        
        return em.createQuery(qu).getResultList();
    }

    @Override
    public void updateProduct(Product product) {
        em.merge(product);
    }
    
}
