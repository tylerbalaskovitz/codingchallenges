package com.revature.challenges;

import java.util.Arrays;

public class Launcher {

	
	public static void main (String [] args) {
		
		
		//instantiating all the values that are needed to solve the challenge
		int nums1 [] = {1, 3};
		int nums2 [] = {2, 4};
		int m = nums1.length;
		int n = nums2.length;
		int o = (m + n);
		
		//the .copyOf method is used to 
		int finalArray [] = Arrays.copyOf(nums1, (n + m));
		
		//copies from the array nums2[] from the part 0 and continued to the finalArray at points m, and n
		System.arraycopy(nums2, 0, finalArray, m, n);
		
		
		
		
		
		
		//the sort Array function sorts an array from low to high so that way the median can be found.
		Arrays.sort(finalArray);
		
		
		
}
}
