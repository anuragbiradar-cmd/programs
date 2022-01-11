package com.te.hashset;
import java.util.*;

public class Demo {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		hs.add(70);

		for (int res : hs) {
			System.out.println(res);

		}
		System.out.println("======================");
		Iterator<Integer> iterator = hs.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
