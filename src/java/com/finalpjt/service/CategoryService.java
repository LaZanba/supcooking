/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finalpjt.service;

import com.finalpjt.dao.CategoryDao;
import com.finalpjt.entity.Category;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;


@Stateless
public class CategoryService {
    
    @EJB
    private CategoryDao categoryDao;
    
    public void addCategory(Category category) {
        categoryDao.addCategory(category);
    }
    
    public List<Category> getAllCategory() {
        return categoryDao.getAllCategory();
    }
    
    public void updateCategory(Category category) {
        categoryDao.updateCategory(category);
    }
    
    public Category findCategoryById(Long categoryId) {
        return categoryDao.findCategoryById(categoryId);
    }
}
