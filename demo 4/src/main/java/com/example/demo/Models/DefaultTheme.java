package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "default_theme")
public class DefaultTheme {

    public int id;

    public Long themeId;

    public String themeName;
}
