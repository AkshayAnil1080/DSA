//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String [] str = br.readLine().trim().split(" ");
			String s = str[0];
			int m = Integer.parseInt(str[1]);
			Solution obj = new Solution();
			System.out.println(obj.modulo(s,m));
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
	int modulo(String s, int m) {
		//Write your code here
		 int base = 1;
         int dec_value = 0;
        int len = s.length();
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == '1')
                dec_value += base;
                
            
             dec_value %=m;
            base = base * 2;
            base %=m;
            
        }
        return dec_value%m;
	}
}
