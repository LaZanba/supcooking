/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finalpjt.service;

import com.finalpjt.dao.ProductDao;
import com.finalpjt.entity.Product;
import com.finalpjt.entity.Recipe;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ProductService {
    
    @EJB
    private ProductDao productDao;
    
    public Product addProduct(Product product) {
        return productDao.addProduct(product);
    }
     
    public List<Product> getAllProductRecipe(Recipe recipe) {
        return productDao.getAllProductRecipe(recipe);
    }
    
    public void updateProduct(Product product) {
        productDao.updateProduct(product);
    }

    public Product findProductById(Long id) {
        return productDao.findProductById(id);
    }
     
}
