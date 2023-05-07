package com.example.ecommerce.ecommercemodel;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orders {
    
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderid;

    @ManyToOne
    @JoinColumn(name = "user_id")
     private User user;

  
    @ManyToOne
    @JoinColumn(name = "pro_id")
    private Product productModel;

   
    @ManyToOne
    @JoinColumn(name = "add_id")
    private Address addid;

    private Integer proquantity;
}
