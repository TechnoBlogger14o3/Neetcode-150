package arrays_and_hashing;
import java.util.*;

/**

	Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
	
			 
	Example 1:
	
	Input: nums = [1,2,3,1]
	Output: true
	Example 2:
	
	Input: nums = [1,2,3,4]
	Output: false
	Example 3:
	
	Input: nums = [1,1,1,3,3,4,3,2,4,2]
	Output: true
	 
	
	Constraints:
	
	1 <= nums.length <= 105
	-109 <= nums[i] <= 109
	
	https://leetcode.com/problems/contains-duplicate/description/

*/

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 1,1,1,3,3,4,3,2,4,2 };
		System.out.println(containsDuplicate(nums));
	}
	
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		
		for(int i : nums) {
			if(set.contains(nums[i])) {
				return true;
			} else {
				set.add(nums[i]);
			}
		}
		return false;
	}

}
