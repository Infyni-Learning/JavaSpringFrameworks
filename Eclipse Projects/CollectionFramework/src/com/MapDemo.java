package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		//LinkedHashMap hm = new LinkedHashMap();
		//TreeMap hm = new TreeMap();
		hm.put(2, "Ravi");
		hm.put(1,"Ramesh");
		hm.put("Raju", "Rajesh");
		System.out.println(hm);
		hm.put(1, "Raju");
		hm.put(4, "Ravi");
		System.out.println(hm);
		
	}

}
