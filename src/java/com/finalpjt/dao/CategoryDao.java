/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finalpjt.dao;

import com.finalpjt.entity.Category;
import java.util.List;
import javax.ejb.Local;

@Local
public interface CategoryDao {
    
    public void addCategory(Category category);
    
    public List<Category> getAllCategory();
    
    public void updateCategory(Category category);
    
    public Category findCategoryById(Long id);
       
}
