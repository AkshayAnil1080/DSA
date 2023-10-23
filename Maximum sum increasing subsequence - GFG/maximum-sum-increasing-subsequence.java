//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int maxSumIS(int a[], int n)  
	{  
	      int msis[] = new int[n];   msis[0] = a[0];
     
        int res=msis[0];
        
        for (int i = 1; i < n; i++)
        {
            msis[i] = a[i];
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i] && msis[i] < msis[j] + a[i])
                {
                    msis[i] = msis[j] + a[i];
                }
            }
             res= Math.max(res, msis[i]);
        }
        return res;//code here.
	}  
}