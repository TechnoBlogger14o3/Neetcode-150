package arrays_and_hashing;
import java.util.*;

//	Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
//	
//			 
//	
//	Example 1:
//	
//	Input: nums = [1,1,1,2,2,3], k = 2
//	Output: [1,2]
//	Example 2:
//	
//	Input: nums = [1], k = 1
//	Output: [1]
//	 
//	https://leetcode.com/problems/top-k-frequent-elements/description/
//		
public class TopKFrequentElements {
	public static void main(String[] args) {
		
	}

	public int[] topKFrequent(int[] nums, int k) {
	    // Create a HashMap to store the frequency of each element
	    Map<Integer, Integer> frequencyMap = new HashMap<>();
	    for (int num : nums) {
	        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	    }
	
	    // Create a min heap to store elements based on their frequencies
	    PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
	            Comparator.comparingInt(Map.Entry::getValue)
	    );
	
	    // Add entries from the frequency map to the min heap
	    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	        minHeap.add(entry);
	        if (minHeap.size() > k) {
	            minHeap.poll(); // Remove the least frequent element
	        }
	    }
	
	    // Create an array to store the k most frequent elements
	    int[] result = new int[k];
	
	    // Populate the result array with the top k frequent elements
	    int i = 0;
	    while (!minHeap.isEmpty()) {
	        result[i++] = minHeap.poll().getKey();
	    }
	
	    return result;
	}
}