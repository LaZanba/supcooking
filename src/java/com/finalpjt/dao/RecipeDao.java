package com.finalpjt.dao;


import com.finalpjt.entity.Recipe;
import com.finalpjt.entity.User;
import java.util.List;

public interface RecipeDao {
    
    public Recipe addRecipe(Recipe recipe);
    
    public List<Recipe> getAllRecipe();
    
    public List<Recipe> getRecipesByUser(User user);
    
    public Recipe updateRecipe(Recipe recipe);
    
    public Recipe findRecipeById(Long id);
    
}
