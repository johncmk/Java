package com.javalec.advanced_programming_hw1.alg;

public class FibRecursive implements Fibonacci {

	@Override
	public int fib(int num) {
		// TODO Auto-generated method stub
		if(num == 0) {
			return 0;
		} else if(num == 1) {
			return 1;
		}
		return fib(num-1) + fib(num-2);
	}

}
