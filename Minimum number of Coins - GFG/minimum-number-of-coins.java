//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> numbers= new ArrayList<Integer>();
            numbers = ob.minPartition(N);
            for(int i: numbers){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> minPartition(int N)
    {
        int[] coins = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        int[] dp = new int[N+1];  // storing min number of couns needed for to make value i
        int[] dp2 = new int[N+1]; // to make val i, which coinwas  used.
        dp[0] = 0;
        dp2[0] = 0;
        
        for(int i = 1; i <= N; i++){
	        dp[i] = Integer.MAX_VALUE;
	        dp2[i] = -1;
	    }
	    for(int i = 0; i < 10; i++){
	        for(int j = 1; j <=N; j++){ // val for loop
	            if(j >= coins[i]){ // val bada hoga coins[i] se tb to subtract krnge
	                dp[j] = Integer.min(dp[j], 1+dp[j-coins[i]]);
	                dp2[j] = i; // to make val j , which other coins we used.
	            }
            }
        }
        // itr in value N to for dp2 to see which coins were used and 
        // int k = N;
        List<Integer> num = new ArrayList<Integer>();
        // for(int i = N; i> 0 & N >= 0;){
        //     if(dp2[i] != -1)
        //         num.add(coins[dp2[i]]);   
        //     N = N - coins[dp2[i]];
        //     i = N;
        // }
        int x = N; // number to be processed
        while(x>0 && N>=0)
        {
        if(dp2[x] != -1)
                num.add(coins[dp2[x]]);   
            N = N - coins[dp2[x]];
            x = N;
        }
        return num;
    }
}