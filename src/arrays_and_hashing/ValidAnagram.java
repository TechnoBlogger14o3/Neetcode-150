package arrays_and_hashing;

/**
	Given two strings s and t, return true if t is an anagram of s, and false otherwise.
	
	An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
	
	 
	
	Example 1:
	
	Input: s = "anagram", t = "nagaram"
	Output: true
	Example 2:
	
	Input: s = "rat", t = "car"
	Output: false
	 
	
	Constraints:
	
	1 <= s.length, t.length <= 5 * 104
	s and t consist of lowercase English letters.
	
 
 */
public class ValidAnagram {

	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		System.out.println(isAnagram(s, t));
		
	}
	
	 public static boolean isAnagram(String s, String t) {
	        if (s.length() != t.length()) {
	            return false; // Anagrams must have the same length
	        }

	        int[] frequencyArray = new int[26];

	        // Increment frequency for characters in string s,
	        // and decrement for characters in string t
	        for (int i = 0; i < s.length(); i++) {
	            frequencyArray[s.charAt(i) - 'a']++;
	            frequencyArray[t.charAt(i) - 'a']--;
	        }

	        // Check if any frequency is non-zero
	        for (int count : frequencyArray) {
	            if (count != 0) {
	                return false; // Frequencies don't match
	            }
	        }

	        return true; // Strings are anagrams
	    }

}
