package com.javalec.advanced_programming_hw1.alg;

import java.util.Random;

public class QuickSort implements Sort{

	@Override
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		if(arr == null) 
			throw new Error("################ Array is null ################");
		int left = 0;
		int right = arr.length-1;
		return ( right <= 0)? arr : split(left, right, arr);
	}

	private int[] split(int left, int right, int[] arr) {

		int pivot = arr[new Random().nextInt(right)];
		int l_ptr = left;
		int r_ptr = right;
		
		while( l_ptr <= r_ptr ) {
			while(arr[l_ptr] < pivot) {
				l_ptr++;
			}
			while(arr[r_ptr] > pivot) {
				r_ptr--;				
			}
			if( l_ptr <= r_ptr ) {
				swap(l_ptr, r_ptr, arr);
				l_ptr++;
				r_ptr--;
			}
		}
		if( left < r_ptr) 
			split(left, r_ptr, arr);
		if( l_ptr < right)
			split(l_ptr, right, arr);
		return arr;
	}
	
	private void swap( int l_ptr , int r_ptr , int[] arr) {
		int temp = arr[l_ptr];
		arr[l_ptr] = arr[r_ptr];
		arr[r_ptr] = temp;
	}
}
