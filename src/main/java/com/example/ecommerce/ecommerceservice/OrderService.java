package com.example.ecommerce.ecommerceservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.ecommercemodel.Orders;
import com.example.ecommerce.ecommercerepo.OrderRepo;

@Service
public class OrderService {
    
    @Autowired
     OrderRepo orderrepo;
    public Orders createOrder(Orders o) {
        return orderrepo.save(o);
    }
    public Orders getOrderById(Integer id) {
        return orderrepo.findById(id).get();
    }
}
