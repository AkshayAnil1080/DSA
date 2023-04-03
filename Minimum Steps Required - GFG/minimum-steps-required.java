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
			String str = br.readLine();
			Solution obj = new Solution();
			System.out.println(obj.minSteps(str));
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
	int minSteps(String str) {
		//Write your code here
	int cnt=0;
    for(int i=1; i<str.length(); i++)
    {
        if(str.charAt(i-1)!=str.charAt(i))
        cnt++;
    }
    if(cnt%2!=0)
    return (cnt+1)/2+1;
    
    return cnt/2 +1;
	}
}