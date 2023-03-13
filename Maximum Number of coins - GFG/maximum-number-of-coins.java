//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int N = Integer.parseInt(br.readLine());
			ArrayList<Integer> arr = new ArrayList<>(N);
			String [] str = br.readLine().trim().split(" ");
			for(int i = 0; i < N; i++) {
				arr.add(Integer.parseInt(str[i]));
			}
			Solution obj = new Solution();
			System.out.println(obj.maxCoins(N, arr));
		}
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    static int dp[][];
    int maxCoins(int N, ArrayList<Integer> al) {
		//Write your code here
		int arr[] = new int[N];
		for(int i=0; i<N; i++)
		arr[i] = al.get(i);
		
		
	int a[] = new int[N+2];
    int n = a.length;
    a[0]=1; a[n-1]=1;
    
    for(int i=1; i<=n-2;i++)
    a[i] = arr[i-1];
    
    dp = new int[n][n];
    for(int rows[] : dp) Arrays.fill(rows,-1);
    
    return solve(a, 0 , n-1);
    
  }
  static int solve(int a[], int st, int end)
  {
      if(end - st ==1) return 0;
      
      if(dp[st][end]!=-1) return dp[st][end];
      
      //m vary
      int ans=0;
      for(int m=st+1; m<end; m++)
      {
          int curr = a[st]*a[m]*a[end] + solve(a, st, m) + solve(a, m , end);
          ans = Math.max(ans,curr);
      }
      return dp[st][end] = ans;
  }
	
}