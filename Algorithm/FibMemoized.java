package com.javalec.advanced_programming_hw1.alg;

import java.util.HashMap;

public class FibMemoized implements Fibonacci{

	private HashMap<Integer, Integer> cache = new HashMap<>();
	
	@Override
	public int fib(int num) {
		// TODO Auto-generated method stub
		if(num == 0) {
			cache.put(0, 0);
			return 0;
		} else if(num == 1) {
			cache.put(1, 1);
			return 1;
		} else if(!cache.containsKey(num)) {
			cache.put(num, fib(num-2) + fib(num-1));
		}
		return cache.get(num);
		
	}

}
