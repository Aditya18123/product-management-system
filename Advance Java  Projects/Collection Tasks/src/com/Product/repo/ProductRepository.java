package com.Product.repo;

import java.util.ArrayList;
import java.util.List;

import com.Product.entity.Product;

public class ProductRepository {
	private List<Product> productList = new ArrayList<>();

    public ProductRepository() {
        productList.add(new Product(1,"Milk","Dairy",50,"10/01/2025","18/01/2025"));
        productList.add(new Product(2,"Curd","Dairy",40,"09/01/2025","18/01/2025"));
        productList.add(new Product(3,"Bread","Bakery",30,"15/01/2025","25/01/2025"));
        productList.add(new Product(4,"Cake","Bakery",250,"10/01/2025","30/01/2025"));
        productList.add(new Product(5,"Oil","Grocery",150,"01/01/2025","01/01/2026"));
        productList.add(new Product(6,"Rice","Grocery",70,"05/01/2025","05/01/2026"));
        productList.add(new Product(7,"Soap","Personal",35,"01/12/2024","01/12/2026"));
        productList.add(new Product(8,"Shampoo","Personal",180,"01/11/2024","01/11/2026"));
        productList.add(new Product(9,"Butter","Dairy",90,"10/01/2025","20/01/2025"));
        productList.add(new Product(10,"Cheese","Dairy",120,"12/01/2025","18/01/2025"));
    }

    public List<Product> getProducts() {
        return productList;
    }
}
