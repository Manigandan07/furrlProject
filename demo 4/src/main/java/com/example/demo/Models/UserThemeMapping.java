package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_theme_mapping")
@AllArgsConstructor
@NoArgsConstructor
public class UserThemeMapping {

    public Long id;

    public Long userId;

    public Long themeId;
}
