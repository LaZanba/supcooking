/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finalpjt.dao;

import com.finalpjt.entity.Product;
import com.finalpjt.entity.Recipe;
import java.util.List;


public interface ProductDao {
    
    public void addProduct(Product product);
    
    public List<Product> getAllProductRecipe(Recipe recipe);
    
    public void updateProduct(Product product);
    
    
    
}
