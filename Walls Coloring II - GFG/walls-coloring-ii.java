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
			int n = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			int [][] costs = new int[n][k];
			for(int i = 0; i < n; i++) {
				str = br.readLine().trim().split(" ");
				for(int j = 0; j < k; j++) {
					costs[i][j] = Integer.parseInt(str[j]);
				}
			}
			Solution obj = new Solution();
			System.out.println(obj.minCost(costs));
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
	int minCost(int [][] costs) {
		//Write your code here
		
		int n = costs.length; int k =costs[0].length;
		//s1
		int dp[][] = new int[n][k];
	 
		if(n>1 && k==1) return -1;
		//s2 fill firs row with first row of costs
		
		 int m1 = Integer.MAX_VALUE;  int m2 = Integer.MAX_VALUE;
		for(int i=0; i<k; i++)
        {
            dp[0][i] = costs[0][i];
	        if (costs[0][i] < m1) 
	        {
	            m2 = m1;
	            m1 = costs[0][i];
	        } 
	        else if (costs[0][i] < m2) {
	            m2 = costs[0][i];
	        }
        }
		
		//itr for next rows
		 int cm1 = Integer.MAX_VALUE;  int cm2 = Integer.MAX_VALUE;
		for(int itr=1; itr<n; itr++)
		{
		    for(int i=0; i<k; i++)
		    {
		         if (dp[itr - 1][i] == m1) 
		         {
	                dp[itr][i] = costs[itr][i] + m2;
	            }
	            else 
	            {
	                dp[itr][i] = costs[itr][i] + m1;
	            }
	            
	            //update ,m1 and m2 for next itr
	             if (dp[itr][i] < cm1) {
	                cm2 = cm1;
	                cm1 = dp[itr][i];
	            } 
	            else if (dp[itr][i] < cm2) {
	                cm2 = dp[itr][i];
	            }
		    }
		    m1 = cm1;
	        m2 = cm2;
	        cm1 = Integer.MAX_VALUE;
	        cm2 = Integer.MAX_VALUE;
		}
		

		return m1;
	}
}