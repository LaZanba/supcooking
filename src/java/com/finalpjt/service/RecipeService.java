/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finalpjt.service;

import com.finalpjt.dao.RecipeDao;
import com.finalpjt.entity.Recipe;
import com.finalpjt.entity.User;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;


@Stateless
public class RecipeService {

    @EJB
    private RecipeDao recipeDao;
    
    public Recipe addRecipe(Recipe recipe) {
        return recipeDao.addRecipe(recipe);
    }
    
    public List<Recipe> getAllRecipe() {
        return recipeDao.getAllRecipe();
    }
    
    public List<Recipe> getRecipesByUser(User user) {
        return recipeDao.getRecipesByUser(user);
    }
    
    public Recipe updateRecipe(Recipe recipe) {
        return recipeDao.updateRecipe(recipe);
    }
    
    public Recipe findRecipeById(Long recipeId) {
        return recipeDao.findRecipeById(recipeId);
    }
}
