package com.revature.challenges;

import java.util.Arrays;

public class MedianCodingChallenge {

	
	public static void main (String [] args) {
		//instantating a double for handling decimal places, avoiding the float primitive in the case we need to have more memory/best practices
		double median;
		
		//instantiating all the values that are needed to solve the challenge
		int nums1 [] = {1, 3};
		int nums2 [] = {2, 4};
		
		//the lengths of the arrays are instantiated
		int m = nums1.length;
		int n = nums2.length;
		
		//the total length is instantiated
		int o = (m + n);
		
		//the .copyOf method is used to 
		int finalArray [] = Arrays.copyOf(nums1, (n + m));
		
		//copies from the array nums2[] from the part 0 and continued to the finalArray at points m, and n
		System.arraycopy(nums2, 0, finalArray, m, n);
		Arrays.sort(finalArray);
		
		
		if (finalArray.length % 2 == 0) {
			//the median is given if there isn't a middle number
			median = ((double) finalArray[finalArray.length / 2] + (double) finalArray[finalArray.length / 2 - 1]) / 2;
		
			
		} else {
			//conversely if there is a middle number this is performed. 
			median = finalArray[(finalArray.length / 2)];
		}

		// output of solutions
		System.out.println("The median is: " + median);
	}
		
		
		
		//the sort Array function sorts an array from low to high so that way the median can be found.
		
		
		
		
}

