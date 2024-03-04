package arrays_and_hashing;
import java.util.*;

//	Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//	
//	You must write an algorithm that runs in O(n) time.
//	
//	 
//	
//	Example 1:
//	
//	Input: nums = [100,4,200,1,3,2]
//	Output: 4
//	Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
//	Example 2:
//	
//	Input: nums = [0,3,7,2,5,8,4,6,0,1]
//	Output: 9
//	 
//	
//	Constraints:
//	
//	0 <= nums.length <= 105
//	-109 <= nums[i] <= 109
//	
//	https://leetcode.com/problems/longest-consecutive-sequence/description/
//		
	
public class LongestConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Create a HashSet to store the elements
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        // Iterate through the array to find the start of sequences
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) { // Check if num is the start of a sequence
                int currentNum = num;
                int currentStreak = 1;

                // Check consecutive elements in the sequence
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest streak
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
