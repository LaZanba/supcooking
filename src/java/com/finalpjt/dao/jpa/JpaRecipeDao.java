package com.finalpjt.dao.jpa;

import com.finalpjt.dao.RecipeDao;
import com.finalpjt.entity.Recipe;
import com.finalpjt.entity.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Stateless
public class JpaRecipeDao implements RecipeDao{
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public Recipe addRecipe(Recipe recipe) {
        em.persist(recipe);
        
        return recipe;
    }

    @Override
    public List<Recipe> getAllRecipe() {
        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Recipe> query = cb.createQuery(Recipe.class);
                
        return em.createQuery(query).getResultList(); 
    }

    @Override
    public List <Recipe> getRecipesByUser(User user) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery qu =  cb.createQuery(Recipe.class);
        Root<Recipe> employee = qu.from(Recipe.class);
        
        qu.where( cb.equal(employee.get("owner") , user) );
        
        return em.createQuery(qu).getResultList();
    }

    @Override
    public Recipe findRecipeById(Long recipeId) {
         return em.find(Recipe.class, recipeId);
    }

    @Override
    public Recipe updateRecipe(Recipe recipe) {
        return em.merge(recipe);
    }
    
}
