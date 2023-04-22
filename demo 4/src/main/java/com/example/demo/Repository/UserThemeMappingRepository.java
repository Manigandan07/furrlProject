package com.example.demo.Repository;

import com.example.demo.Models.UserThemeMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserThemeMappingRepository extends JpaRepository<UserThemeMapping,Long> {

    @Query(value = "SELECT * FROM user_theme_mapping where userId = :userId", nativeQuery = true)
    List<UserThemeMapping> findAllThemeByUserId(Long userId);
}
