package com.example.demo.Controller;


import com.example.demo.Models.Product;
import com.example.demo.ServiceClass.ProductPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/furrl/home")
public class ListingController {

    @Autowired
    ProductPageService productPageService;

    @GetMapping("/getProduct")
    public List<Product> getProductForHomePage(@RequestParam long userId, @RequestParam int page) throws Exception {
        return productPageService.getProductForHomePage(userId,page);
    }


}
