package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "theme")
@AllArgsConstructor
@NoArgsConstructor
public class Theme {

    public Long id;

    public String themeName;

    public String themeDiscription;

}
