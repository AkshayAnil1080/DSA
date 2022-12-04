//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.rearrange(S, N);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public String rearrange(String S, int N){
     
     HashSet<Character> st = new HashSet<Character>();
        st.add('a');
     	st.add ('e');
    	st.add ('i');
    	st.add ('o');
    	st.add ('u');
    	int vow[] = new int[26]; int con[] = new int[26];
    	int c1=0;  int c2=0;
    	Character smallestVow = 'u'; Character smallestCon = 'z';
    	for(int i =0; i<N; i++)
    	{
    	    //vow
    	    Character ch = S.charAt(i);
    	    if(st.contains(ch))
    	    {
    	        c1++;
    	        vow[ch-'a']++;
    	        if(smallestVow> ch)
    	        smallestVow = ch;
 
    	    }
    	    else
    	    {
    	        c2++;
    	        con[ch-'a']++;
    	       if(smallestCon > ch)
    	       smallestCon = ch;
    	    }
    	}
    	if(Math.abs(c1-c2)>1)
    	return "-1";
    // s2 - decsion where to start from	
    	boolean flag = true; // ew need to proceed with vow
    	if(c1==c2)
    	{
    	    if(smallestVow> smallestCon)
    	    flag = false; 
    	    else
    	    flag = true;
    	    
    	}
    	else if(c1>c2)
    	flag = true;
    	
    	else 
    	flag = false;
    	//
    	//s3
    	int i=0;  int j =0;
    	StringBuilder sb = new StringBuilder();
    	while(i<26 || j<26)
    	{
    	    if(flag)
    	    {
    	        while(i<26 && vow[i]==0) i++;
    	        if(i==26) break;
    	        sb.append( (char)('a'+i));
    	        vow[i]--;
    	        flag = false;
    	        
    	    }
    	    else
    	     {
    	         while(j<26 && con[j]==0) j++;
    	        if(j==26) break;
    	        sb.append( (char)('a'+j));
    	        con[j]--;
    	        flag = true;
    	     }
    	}
    	return sb.toString();
    }
}