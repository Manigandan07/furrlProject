package com.example.demo.Repository;

import com.example.demo.Models.DefaultTheme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefaultThemeRepository extends JpaRepository<DefaultTheme,int> {


}
