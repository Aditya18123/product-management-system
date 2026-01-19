package com.Product.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.Product.entity.Product;
import com.Product.repo.ProductRepository;

public class ProductService {
	ProductRepository repo = new ProductRepository();

    // 1. getAllProducts
    public List<Product> getAllProducts() {
        return repo.getProducts();
    }

    // 2. getProductByName
    public Product getProductByName(String name) {
        for (Product p : repo.getProducts()) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    // 3. getProductByCategory
    public List<Product> getProductByCategory(String category) {
        List<Product> result = new ArrayList<>();
        for (Product p : repo.getProducts()) {
            if (p.getCategory().equalsIgnoreCase(category)) {
                result.add(p);
            }
        }
        return result;
    }

    // 4. getByAscPrice
    public List<Product> getByAscPrice() {
        List<Product> list = repo.getProducts();
        list.sort(Comparator.comparingDouble(Product::getPrice));
        return list;
    }

    // 5. getProductByExpYear
    public List<Product> getProductByExpYear(String year) {
        List<Product> result = new ArrayList<>();
        for (Product p : repo.getProducts()) {
            if (p.getExp().endsWith(year)) {
                result.add(p);
            }
        }
        return result;
    }
}
