package com.javalec.advanced_programming_hw1.alg;

public class MergeSort implements Sort{

	@Override
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		if(arr == null) 
			throw new Error("################ Array is null ################");
		if(arr.length <= 1) 
			return arr;
		int arr_len = arr.length;
		int mid = arr_len/2;
		int[] left = new int[mid];
		int[] right = new int[arr_len - mid];
		
		int i = 0, j = 0;
		for(int ptr = 0;ptr < arr_len; ptr++) {
			if(ptr < mid) {
				left[i++] = arr[ptr];
			} else {
				right[j++] = arr[ptr];
			}
		}
		left = sort(left);
		right = sort(right);
		return merge(left, right);
	}
	
	private int[] merge(int[] left, int[] right) {
		
		int left_len = left.length;
		int right_len = right.length;
		int ret[] = new int[left_len + right_len];
		int l_ptr = 0, r_ptr = 0;
		
		for(int ret_ptr = 0; ret_ptr < ret.length; ret_ptr++ ) {
			if(l_ptr == left_len) {
				ret[ret_ptr] = right[r_ptr++];
			} else if (r_ptr == right_len) {
				ret[ret_ptr] = left[l_ptr++];
			} else if(left[l_ptr] <= right[r_ptr]) {
				ret[ret_ptr] = left[l_ptr++];
			} else {
				ret[ret_ptr] = right[r_ptr++];
			}
		}
		return ret;
	}

}
