package service;

import java.util.ArrayList;
import java.util.ListIterator;

import bean.Product;

public class ProductService {
	ArrayList<Product> listOfProduct = new ArrayList<Product>();
		/*
		public void addProduct(int pid,String pname,float price, float gst) {
			
		}
		*/
	public void addProduct(Product p) {
							if(listOfProduct.add(p)) {
								System.out.println("Product Added....");
							}
	}
	
	public void displayAllProduct() {
							ListIterator<Product> li = listOfProduct.listIterator();
							while(li.hasNext()) {
							//Object obj = li.next();
							//Product p = (Product)obj;
								Product p = li.next();				//auto-unboxing 
							//System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPrice());
								System.out.println(p);
							}
	}
	public void deleteByIndex(int i) {
						if(listOfProduct.remove(i)!=null) {
							System.out.println("Record deleted...");
						}
	}
	public void productSize() {
			System.out.println("Number of product are "+listOfProduct.size());
	}
}
