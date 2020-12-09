package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import bean.Product;

public class ProductService {
	ArrayList<Product> listOfProduct = new ArrayList<Product>();
	public void addProduct(Product pp) {
						int flag = 0;
						Iterator<Product> li = listOfProduct.iterator();
						while(li.hasNext()) {
							Product p = li.next();
								if(p.getPid()==pp.getPid()) {
									flag++;
								}
						}
						if(flag==0) {
						listOfProduct.add(pp);
						System.out.println("Product Added...");
						}else {
							System.out.println("id must be unique");
						}
	}
	
	public void displayAllProduct() {
		for(Product p :listOfProduct) {
			System.out.println(p);
		}
	}
}
