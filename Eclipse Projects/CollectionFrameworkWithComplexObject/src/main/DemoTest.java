package main;

import bean.Product;
import service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.setPid(100);
		p1.setPname("Laptop");
		p1.setPrice(85000);
		
		Product p2 = new Product(101, "Sony TV", 150000);
		ProductService ps  = new ProductService();
		ps.addProduct(p1);
		ps.addProduct(p2);
		
		ps.addProduct(new Product(102, "PC", 45000));
		ps.addProduct(new Product(103, "Shirt", 2500));
		ps.addProduct(new Product(104, "Jacket", 5000));
		
		ps.productSize();
		ps.deleteByIndex(1);
		ps.displayAllProduct();
	}

}
