package arrays_and_hashing;

import java.util.*;
//	Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//	
//	An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//	
//
//	
//	Example 1:
//	
//	Input: strs = ["eat","tea","tan","ate","nat","bat"]
//	Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//	Example 2:
//	
//	Input: strs = [""]
//	Output: [[""]]
//	Example 3:
//	
//	Input: strs = ["a"]
//	Output: [["a"]]
//			
//  https://leetcode.com/problems/group-anagrams/description/
		
public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store groups of anagrams
        Map<String, List<String>> anagramGroups = new HashMap<>();

        // Iterate through each string in the array
        for (String str : strs) {
            // Sort the characters in the string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // Add the string to its corresponding group in the HashMap
            anagramGroups.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        // Return the values (groups of anagrams) from the HashMap
        return new ArrayList<>(anagramGroups.values());
    }
}
