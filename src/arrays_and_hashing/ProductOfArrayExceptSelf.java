package arrays_and_hashing;

//	Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//	
//	The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//	
//	You must write an algorithm that runs in O(n) time and without using the division operation.
//	
//	 
//	
//	Example 1:
//	
//	Input: nums = [1,2,3,4]
//	Output: [24,12,8,6]
//	Example 2:
//	
//	Input: nums = [-1,1,0,-3,3]
//	Output: [0,0,9,0,0]

//	https://leetcode.com/problems/product-of-array-except-self/description/

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1,2,3,4 };
		int[] nums1 = { -1,1,0,-3,3 };
		System.out.println(productExceptSelf(nums));
	}

	 public static int[] productExceptSelf(int[] nums) {
	        int[] arr = new int[nums.length];
	        int right = 1, left = 1;
	        for (int i = 0; i < nums.length; i++) {
	            arr[i] = left;
	            left *= nums[i];
	        }
	        for (int i = nums.length - 1; i >= 0; i--) {
	            arr[i] *= right;
	            right *= nums[i];
	        }
	        return arr;
	    }

	    public int[] productExceptSelfNumsAsPrefix(int[] nums) {
	        int[] output = new int[nums.length];
	        output[0] = 1;

	        for (int i = 0; i < nums.length - 1; i++) output[i + 1] =
	            output[i] * nums[i];

	        for (int i = nums.length - 2; i >= 0; i--) {
	            output[i] = nums[i + 1] * output[i];
	            nums[i] = nums[i] * nums[i + 1];
	        }
	        return output;
	    }
}
