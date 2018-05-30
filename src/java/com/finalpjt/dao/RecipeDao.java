/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finalpjt.dao;

import com.finalpjt.entity.Category;
import com.finalpjt.entity.Description;
import com.finalpjt.entity.Recipe;
import com.finalpjt.entity.User;
import java.util.List;

public interface RecipeDao {
    
    public void addRecipe(Category category,Description description,Recipe recipe,User user);
    
    public List<Recipe> getAllRecipe(Recipe recipe);
    
    public Recipe getRecipeByUser(User user);
    
    public void updateRecipeUser(Recipe recipe, User user);
    
}
