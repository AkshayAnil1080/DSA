//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        // Your code here
        int n = str.length();
        int lc=0; int uc=0;
        for(int i=0; i<n; i++)
        {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch))
            uc++;
            else
            lc++;
        }
        //s2
        char lower[] = new char[lc];
        char upper[] = new char[uc];
        int i=0; int j=0; int k=0;
        for(k=0; k<n;k++)
        {
            char ch = str.charAt(k);
            if(Character.isUpperCase(ch))
            upper[j++] = ch;
            
            else
            lower[i++]=ch;
        }
        // lower - defers, upper - RTSUXI
        //s3
        Arrays.sort(lower); Arrays.sort(upper);
        //s4
        StringBuilder ans = new StringBuilder();
        i=j=0;
        for(k=0; k<n; k++)
        {
            char ch = str.charAt(k);
            if(Character.isUpperCase(ch))
            ans.append(upper[j++]);
            else
            ans.append(lower[i++]);
        }
        
        return ans.toString();
    }
}

//{ Driver Code Starts.

class GFG {
	public static void main (String[] args) {
		
    	try {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    PrintWriter out=new PrintWriter(System.out);
    	    String[] words = br.readLine().split("\\s+");
    	    int numTestCases = Integer.parseInt(words[0]);
    	    
    	    for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
    	        words = br.readLine().split("\\s+");
    	        int size = Integer.parseInt(words[0]);
    	        String str = br.readLine();
    	        String sortedStr = new Solution().caseSort(str);
    	        out.println(sortedStr);
    	    }
    	    out.close();
    	}
    	catch (IOException e) {
    	    System.out.println(e);
    	}
	}
}
// } Driver Code Ends