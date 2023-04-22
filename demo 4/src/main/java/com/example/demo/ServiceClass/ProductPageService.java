package com.example.demo.ServiceClass;

import com.example.demo.Models.DefaultTheme;
import com.example.demo.Models.Product;
import com.example.demo.Models.User;
import com.example.demo.Models.UserThemeMapping;
import com.example.demo.Repository.DefaultThemeRepository;
import com.example.demo.Repository.ProductRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Repository.UserThemeMappingRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Log4j2
public class ProductPageService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserThemeMappingRepository userThemeMappingRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    DefaultThemeRepository defaultThemeRepository;


    public List<Product> getProductForHomePage(Long userId, int page) throws Exception {
        log.debug("Enter into getProductForHomePage() with userId:{} & page:{} ", userId, page);

        Optional<User> userOptional = userRepository.findById(userId);
        User user = null;
        if (userOptional.isPresent()) {
            user = userOptional.get();
        }

        if (user != null) {

            List<UserThemeMapping> userThemeMappingList = userThemeMappingRepository.findAllThemeByUserId(userId);
            Set<Long> themeIds = new HashSet<>();
            for (UserThemeMapping userThemeMapping : userThemeMappingList) {
                themeIds.add(userThemeMapping.themeId);
            }

            if (themeIds.isEmpty()) {
                List<DefaultTheme> defaultThemeList = defaultThemeRepository.findAll();
                for (DefaultTheme defaultTheme : defaultThemeList) {
                    themeIds.add(defaultTheme.themeId);
                }
            }
            page = page * 20;
            List<Product> productList = productRepository.getListOfProductForHomePage(themeIds, page);
            return productList;

        } else {
            throw new Exception("Not a valid User");
        }

    }
}
