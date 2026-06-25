package com.advanced;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	 public static int[] twoSum(int[] nums, int target) {

	        HashMap<Integer, Integer> map = new HashMap<>();

	        for (int i = 0; i < nums.length; i++) {

	            int complement = target - nums[i];

	            // Check whether required number already exists
	            if (map.containsKey(complement)) {

	                return new int[] { map.get(complement), i };
	            }

	            // Store number and index
	            map.put(nums[i], i);
	        }

	        return new int[] {};
	    }


	    public static void main(String[] args) {


	        // Example 1
	        int[] nums1 = {2, 7, 11, 15};
	        int target1 = 9;

	        System.out.println(Arrays.toString(twoSum(nums1, target1)));


	        // Example 2
	        int[] nums2 = {3, 2, 4};
	        int target2 = 6;

	        System.out.println(Arrays.toString(twoSum(nums2, target2)));


	        // Example 3
	        int[] nums3 = {3, 3};
	        int target3 = 6;

	        System.out.println(Arrays.toString(twoSum(nums3, target3)));

	    }
}
