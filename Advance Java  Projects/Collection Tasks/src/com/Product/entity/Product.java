package com.Product.entity;

public class Product {
	    private int id;
	    private String name;
	    private String category;
	    private double price;
	    private String mfg;
	    private String exp;
	    
	    
	    
		public Product(int id, String name, String category, double price, String mfg, String exp) {
			super();
			this.id = id;
			this.name = name;
			this.category = category;
			this.price = price;
			this.mfg = mfg;
			this.exp = exp;
		}



		public int getId() {
			return id;
		}



		public String getName() {
			return name;
		}



		public String getCategory() {
			return category;
		}



		public double getPrice() {
			return price;
		}



		public String getMfg() {
			return mfg;
		}



		public String getExp() {
			return exp;
		}



		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", mfg="
					+ mfg + ", exp=" + exp + "]";
		}
		
		
	    
	    
	    
}
