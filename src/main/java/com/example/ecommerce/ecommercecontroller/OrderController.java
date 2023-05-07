package com.example.ecommerce.ecommercecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.ecommercemodel.Orders;
import com.example.ecommerce.ecommerceservice.OrderService;

@RestController
public class OrderController {
    @Autowired
     OrderService orderservice;
    @PostMapping("/createorder")
    public void createOrder(@RequestBody Orders o){
        orderservice.createOrder(o);

    }

    @GetMapping("/orderid/{id}")
    public Orders getOrderById(@PathVariable Integer id){
        return orderservice.getOrderById(id);
    }
}
