package com.example.ecommerce.ecommerceservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.ecommercemodel.Product;
import com.example.ecommerce.ecommercerepo.ProductRepo;

@Service
public class ProductService {
    
    @Autowired
     ProductRepo prorepo;
    public void createPro(Product pro) {
         prorepo.save(pro);
    }
    public List<Product> getAllProduct() {
        return prorepo.findAll();
    }
    public Product getProductById(Integer id) {
        return prorepo.findById(id).get();
    }
    public void deleteProduct(Integer id) {
        prorepo.deleteById(id);
    }
}
