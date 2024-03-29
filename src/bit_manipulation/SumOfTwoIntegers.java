package bit_manipulation;


//	Given two integers a and b, return the sum of the two integers without using the operators + and -.
//	
//			 
//	
//	Example 1:
//	
//	Input: a = 1, b = 2
//	Output: 3
//	Example 2:
//	
//	Input: a = 2, b = 3
//	Output: 5
//	 
//	
//	Constraints:
//	
//	-1000 <= a, b <= 1000
//	
//	https://leetcode.com/problems/sum-of-two-integers/description/

public class SumOfTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int getSum(int a, int b) {
        if(b == 0) return a;
        return getSum(a ^ b, (a & b) << 1);
    }
	
}
