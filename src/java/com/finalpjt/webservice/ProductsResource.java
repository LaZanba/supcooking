package com.finalpjt.webservice;

import com.finalpjt.entity.Product;
import com.finalpjt.entity.Recipe;
import com.finalpjt.service.ProductService;
import com.finalpjt.service.RecipeService;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/products")
public class ProductsResource {
    
    @EJB private RecipeService recipeService;
    @EJB private ProductService productService;
    
    @GET
    @Path("/recipe/{idRecipe}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product[] getProducts(@PathParam("idRecipe") Long idRecipe) { 
        
       Recipe recipe = this.recipeService.findRecipeById(idRecipe);
       List <Product> products = this.productService.getAllProductRecipe(recipe);
       
       Product[] productArr = new Product[products.size()];
       productArr = products.toArray(productArr);
       
       return productArr;
    }
    
    @GET
    @Path("/{idProduct}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product getProduct(@PathParam("idProduct") Long id) { 
        
       Product product = this.productService.findProductById(id);
       
       return product;
    }
}
