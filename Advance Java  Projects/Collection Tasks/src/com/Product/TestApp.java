package com.Product;

import com.Product.controller.ProductController;

public class TestApp{
	public static void main(String[] args) {

        ProductController controller = new ProductController();

        System.out.println("---- All Products ----");
        controller.showAll();

        System.out.println("\n---- Product By Name ----");
        controller.getByName("Cake");

        System.out.println("\n---- Product By Category ----");
        controller.getByCategory("Personal");

        System.out.println("\n---- Products By Asc Price ----");
        controller.getByAscPrice();

        System.out.println("\n---- Products By Exp Year ----");
        controller.getByExpYear("2026");
    }

}
