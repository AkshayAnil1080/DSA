//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.dominantPairs(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


 class Solution {
    public static int dominantPairs(int n, int[] arr) {
        // code here
              
        Arrays.sort(arr,0,n/2); //sort left half
        Arrays.sort(arr,n/2,n); //sort right half
        
        //  sort(arr.begin(),arr.begin()+(n/2));c++
        // sort(arr.begin()+(n/2),arr.end()); c++
        
        int ans=0;
        int j=n/2;
        for(int i=0; i<n/2; i++)
        {
             while(j<n && arr[i]>=5*arr[j])
                j++;
                
            ans+= j-n/2;
        }
        return ans;
    }
}
        
