package com.finalpjt.webservice;

import com.finalpjt.entity.Product;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/products")
public class ProductsResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProducts() { 
        
        Product p = new Product();
        p.setId(Long.valueOf(1234));
        p.setName("Mass daboss ");
        
        return Response.status(200).entity(p.toString()).build();
        
    }
    
  
}
