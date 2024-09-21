https://www.geeksforgeeks.org/problems/longest-prefix-suffix2527/1
Given a string of characters, find the length of the longest proper prefix which is also a proper suffix.

NOTE: Prefix and suffix can be overlapping but they should not be equal to the entire string.

Examples :

Input: str = "abab"
Output: 2
Explanation: "ab" is the longest proper prefix and suffix. 
Input: str = "aaaa"
Output: 3
Explanation: "aaa" is the longest proper prefix and suffix. 
Expected Time Complexity: O(|str|)
Expected Auxiliary Space: O(|str|)

  
class Solution {
    int lps(String str) {
        // code here
        int arr[] = LPS(str);
        // for(int x : arr){
        //   System.out.print(x + " ");
        // }
        return arr[str.length()-1];
        
    }
    
     int[] LPS(String str)
	{
	    int n = str.length();
	    int lps[] = new int[n];
	    int i = 1, len = 0;
	    lps[0] = 0; // lps[0] is always 0
	     
	    while (i < n)
	    {
	        if (str.charAt(i) == str.charAt(len))
	        {
	            len++;
	            lps[i] = len;
	            i++;
	        }
	        else
	        {
	           
	            if (len == 0)
	            {
	                lps[i] = 0;
	                i++;
	 
	            }
	            else
	            {
	                len = lps[len - 1];
	            }
	        }
	    }
	     return lps;
	}
}
