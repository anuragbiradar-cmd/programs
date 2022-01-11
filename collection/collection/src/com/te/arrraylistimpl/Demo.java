package com.te.arrraylistimpl;

import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;

public class Demo {
	public static void main(String[] args) {
		

	HashMap<Integer, String> hashMap= new HashMap<>();
	hashMap.put(1, "ramya");
	hashMap.put(2, "sunny");
	hashMap.put(3, "jaquee");
	hashMap.put(1, "Emmy");
	
	Set<Integer> keySet=hashMap.keySet();
	
	for(Integer i:keySet) {
		System.out.println("keys:"+i+"values:"+hashMap.get(i));
	}
	

	
	}
}
