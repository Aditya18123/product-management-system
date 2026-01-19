package com.Product.controller;

import com.Product.service.ProductService;

public class ProductController {
	ProductService service = new ProductService();

    public void showAll() {
        service.getAllProducts().forEach(System.out::println);
    }

    public void getByName(String name) {
        System.out.println(service.getProductByName(name));
    }

    public void getByCategory(String category) {
        service.getProductByCategory(category).forEach(System.out::println);
    }

    public void getByAscPrice() {
        service.getByAscPrice().forEach(System.out::println);
    }

    public void getByExpYear(String year) {
        service.getProductByExpYear(year).forEach(System.out::println);
    }
}
