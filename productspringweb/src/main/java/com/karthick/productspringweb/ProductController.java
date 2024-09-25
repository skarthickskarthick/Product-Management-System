package com.karthick.productspringweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController

public class ProductController {
    @Autowired
    ProductService service;

    // hey, this is for products request
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }



    @GetMapping("/product/{name}")
    public Product getProduct(@PathVariable String name){
        return service.getProduct(name);
    }
    @PostMapping("/product")
    public void addProduct(@RequestBody Product p){
        service.addProduct(p);
    }
    @PutMapping("/update")
    public Product updateproduct(@RequestBody Product p)
    {
        return service.updateproduct(p);
    }
   @DeleteMapping("/delete/{id}")
    public String deleteproduct(@PathVariable Integer id)
   {
       return service.deleteproduct(id);
   }

}
