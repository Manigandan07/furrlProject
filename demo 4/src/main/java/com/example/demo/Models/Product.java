package com.example.demo.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    public Long id;

    public String productName;

    public String productId;

    public String itemCode; //optional

    public double price;

    public double discountPercentage;

    public double gst;

    public String hsnCode;

    public Long createdTimeStamp;

    @OneToMany(fetch = FetchType.LAZY)
    public List<ProductThemeMapping> productThemeMappingList;
}
