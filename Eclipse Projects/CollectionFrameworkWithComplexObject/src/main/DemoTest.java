package main;

import java.util.Scanner;

import bean.Product;
import service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String con=null;
		int ch=0,pid;
		String pname;
		float price;
		ProductService ps = new ProductService();
		
		do {
			System.out.println("1:Add ");
			System.out.println("2:Display All Product");
			System.out.println("Plz enter your choice");
			ch = sc.nextInt();
			switch(ch) {
			case 1:System.out.println("Enter the id");
			        pid = sc.nextInt();
			        System.out.println("Enter the name");
			        pname = sc.next();
			        System.out.println("Enter the price");
			        price = sc.nextFloat();
			        Product p1 = new Product(pid, pname, price);
			        ps.addProduct(p1);
			        break;
			case 2:ps.displayAllProduct();
					break;
					
			default :System.out.println("Wrong choice");
			       break;
			}
			System.out.println("Do you want to continue?");
			con = sc.next();
		} while (con.equalsIgnoreCase("y"));
		System.out.println("Thank You!");
		
		/*
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
		ps.displayAllProduct();*/
		
	}

}
