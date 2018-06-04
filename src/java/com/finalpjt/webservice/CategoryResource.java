package com.finalpjt.webservice;

import com.finalpjt.entity.Category;
import com.finalpjt.service.CategoryService;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/categories")
public class CategoryResource {
    
    @EJB CategoryService categoryService;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Category[] getCategories () {
        
        List <Category> categories = this.categoryService.getAllCategory();
        
        Category[] categoriesArr = new Category[categories.size()];
        
        return categories.toArray(categoriesArr);
    }
    
}
