package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_theme_mapping")
public class ProductThemeMapping {

    public Long id;

    public Long productId;

    public Long themeId;
}
