package com.games;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoArrayList {

	
	public static void main(String[] args) {
		
		List<String> li = new ArrayList<>(Arrays.asList("sasi", "manoj", "venu", "ramesh"));
		
		System.out.println(li.size());

		
		for(int i=0; i<li.size(); i++) {
			String name = li.get(i);
			System.out.println(name);
		}
		
		//print in reverse order
		
		// write loop in while and do while.
		
		
	}
}
