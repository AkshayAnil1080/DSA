//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.splitArray(arr,N,K));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int splitArray(int[] arr , int N, int K) {
        // code here
        
        int low=1; int high=0;
        for(int i =0; i<N ;i++)
        high+= arr[i];
        
        int ans=0;
        //bs
        while(low<=high)
        {
            int mid = (low+high)/2;
            
            //if this mid is poss ans
            // isPoss- finding the count of all poss SA(sum<mid) to make sure our mid is an ach ans.
            if(isPoss(mid, arr, N, K))
            {
                //true : count<=k
                high =mid-1; // ans =mid is ach - but question constrain to find min poss ans-> lower the rang
                ans=mid;
            }
            else// count<k; 
            low =mid+1;
        }
        return ans;
    }
    static boolean isPoss(int mid, int a[], int N, int k)
    {
        int count=0;  //count of all poss SA
        int sum=0;
        
        for(int i=0; i<N; i++)
        {
            if(a[i]>mid) return false;
            
            //2
            sum+=a[i];
            
            //3
            if(sum>mid){
                
             count++;
             sum=a[i];
            }
        }
        count++;
        
        // mid is ach ans when count<=k
        return (count<=k) ? true : false;
    }
};