package com.spring.practice.controller;

import com.spring.practice.model.Electronic;
import com.spring.practice.model.Food;
import com.spring.practice.model.Product;
import com.spring.practice.service.ProductService;
import com.spring.practice.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ProductController {
    private final ProductService productService = new ProductServiceImpl();

    public ProductController() {
        // 샘플 데이터 추가
        productService.addProduct(new Electronic("노트북", 1500000, "삼성"));
        productService.addProduct(new Food("초콜릿", 3000, "2025-12-31"));
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String showProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        List<Map<String, String>> productDetails = new ArrayList<>();

        for (Product product : products) {
            Map<String, String> details = new HashMap<>();
            details.put("name", product.getName());
            details.put("price", product.getPrice() + "원");

            if (product instanceof Electronic) {
                details.put("extra", "브랜드: " + ((Electronic) product).getBrand());
            } else if (product instanceof Food) {
                details.put("extra", "유통기한: " + ((Food) product).getExpirationDate());
            } else {
                details.put("extra", "-");
            }

            productDetails.add(details);
        }

        model.addAttribute("productDetails", productDetails);
        return "productList";  // productList.jsp로 연결
    }
}
