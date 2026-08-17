
lps video - https://www.youtube.com/watch?v=1gC6Q-WXuEQ

secret ciper video link- https://youtu.be/0OtolLUZuAQ


try it yourself- https://www.geeksforgeeks.org/problems/secret-cipher--141631/1
n,n,


  class Solution {
    int lps[];
    public String compress(String s) {
        // code here
        int n = s.length();
        lps = new int[n];
        LPS(s);
        
        // traverse from right to left 
        StringBuilder ans = new StringBuilder();

        int i = n - 1;

        while (i >= 0) {

            int len = i + 1; // current length

            // must be even to divide in equal halves.
            if (len % 2 == 0) {

                int period = len - lps[i];

                // Check if prefix can be X + X
                if (lps[i] >= len / 2
                        && len % (2 * period) == 0) {

                    // Replace second X with '*'
                    ans.append('*');

                    // Now process only the first half
                    i = i / 2 + 1;

                } 
                else {
                    ans.append(s.charAt(i));
                }

            }
            //if length odd, just directly add the current char
            else {
                ans.append(s.charAt(i));
            }

            i--;
        }

        return ans.reverse().toString();
    }
    
    void LPS(String str)
	{
	    int n = str.length();
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
	}
}
