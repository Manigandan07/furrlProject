package com.example.demo.Repository;

import com.example.demo.Models.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ProductRepository {


    @Query(value = "select * from product where id in (select productId from product_theme_mapping where themeId in (:themeIds)) order by price asc,createdTimeStamp desc  limit :page,20)", nativeQuery = true)
    List<Product> getListOfProductForHomePage(Set<Long> themeIds, int page);
}
