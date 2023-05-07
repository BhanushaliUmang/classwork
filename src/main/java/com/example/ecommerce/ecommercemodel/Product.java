package com.example.ecommerce.ecommercemodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pro_id")
    private Integer proid;

    @Column
    private String proname;

    @Column
    private Integer productprice;

    @Column
    private String prodescription;

    @Column
    private String procategory;

    @Column
    private String probrand;
}
