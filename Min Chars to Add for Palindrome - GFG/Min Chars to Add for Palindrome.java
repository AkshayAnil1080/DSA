class Solution {
    public static int minChar(String s) {
       //Write your code here
       
       StringBuilder res = new StringBuilder(s);
       
        String rev = res.reverse().toString();
        res.reverse().append("$").append(rev);

      
        int lps[] = LPS(res.toString());
        return s.length() - lps[res.length() - 1];
       
    }
   static  int[] LPS(String str)
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
