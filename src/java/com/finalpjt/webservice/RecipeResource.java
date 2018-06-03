package com.finalpjt.webservice;

import com.finalpjt.entity.Recipe;
import com.finalpjt.entity.Recipe;
import com.finalpjt.entity.User;
import com.finalpjt.service.RecipeService;
import com.finalpjt.service.UserService;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/recipe")
public class RecipeResource {
    
    @EJB private RecipeService recipeService;
    @EJB private UserService userService;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Recipe[] getRecipes() { 
        
       List<Recipe> recipes = this.recipeService.getAllRecipe();
       
       return this.toTable(recipes);
    }
    
    @GET
    @Path("{idUser}")
    @Produces(MediaType.APPLICATION_JSON)
    public Recipe[] getUserRecipes(@PathParam("idUser") Long idUser) { 
       
       User user = this.userService.getUser(idUser);
       List<Recipe> recipes = this.recipeService.getRecipesByUser(user);
       
       return this.toTable(recipes);
    }
    
    /**
     * 
     * @param recipes
     * @return Recipe[] 
     */
    private Recipe[] toTable(List<Recipe> recipes) {
        
       Recipe[] recipeArr = new Recipe[recipes.size()]; 
       
       return recipes.toArray(recipeArr);
    }
}
