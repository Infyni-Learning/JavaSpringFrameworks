package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIterator {

	public static void main(String[] args) {
		HashMap hm  = new HashMap();
		hm.put(1, "Ravi");
		hm.put(2, "Rajesh");
	System.out.println(hm);
	//convert map to set 
	Set ss = hm.entrySet();
	Iterator ii = ss.iterator();
	while(ii.hasNext()) {
		Map.Entry me = (Map.Entry)ii.next();		//converting set to Map 
		System.out.println(" Only key "+me.getKey());
		//System.out.println(ii.next());
	}
	}

}
