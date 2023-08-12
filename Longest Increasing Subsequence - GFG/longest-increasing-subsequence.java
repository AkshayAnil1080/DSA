//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends




// class Solution 
// {
//     //Function to find length of longest increasing subsequence.
//     static int longestSubsequence(int n, int a[])
//     {
//       int lis[] =new int[n];  lis[0]=1;
//         int res=lis[0];
//         for(int i=1; i<n ;i++)
//         {
//             lis[i]=1;
//             for(int j=0; j<i; j++)
//             {
//                 if(a[j]<a[i])
//                 lis[i] = Math.max(lis[i], lis[j]+1);
//             }
//              res= Math.max(res, lis[i]);
//         }
//         return res;
//     }
// }

class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int n, int arr[])
    {
        // code here
        int ans[] = new int[n]; int len=1;
        ans[0] = arr[0];
        
        for(int i = 1 ;i <n ;i++)
        {
            if(arr[i] > ans[len-1] )
            {
                ans[len] = arr[i]; len++;
            }
            else // arr[i] < ans[len-1];
            {
                int c = ceilIndex(ans, 0 , len-1, arr[i]);
                ans[c] = arr[i];
            }
        }
        return len;
    }
    
    static int ceilIndex( int ans[] , int l , int r, int x)
    {
        while(l<r)
        {
            int m = (l+r)/2;
            if(ans[m] >= x)
            {
                r =m;
            }
            else
            l = m+1;
        }
        return r;
    }
} 
