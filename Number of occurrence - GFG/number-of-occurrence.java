//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


// class Solution {
//     int count(int[] arr, int n, int x) {
//         // code here
//         int cnt=0;
//         for(int y :arr)
//         if(y==x)
//         cnt++;
        
//         return cnt;
//     }
// }



// class Solution {
//     int count(int[] arr, int n, int x) {
//         // code here
//         HashMap<Integer, Integer>  mp = new HashMap<>();
//         int cnt=0;
        
//         for(int i=0; i<n; i++)
//         mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        
//         for(Map.Entry<Integer, Integer> z : mp.entrySet())
//         {
//             if(z.getKey()==x)
//             cnt = z.getValue();
//         }
        
//         return cnt;
//     }
// }


class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int  first = l_idx(arr, x);
        int last = h_idx(arr,x);
        
        // System.out.println(first +  " " + last);
        if(last==-1)
        return 0;
        
        return last-first+1;
    }
    int h_idx(int arr[], int x)
    {
        int n = arr.length;
        int idx=-1;
        int low=0; int high=n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] > x)
            high = mid-1;
            
            else if(arr[mid]==x)
            {
                idx=mid; low=mid+1;
            }
            
            // if(arr[mid] < x)
            else
            low= mid+1;
            
        }
        return idx;
    }
    
    int l_idx(int arr[], int x)
    {
        int n = arr.length;
        int idx=-1;
        int low=0; int high=n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] > x)
            high = mid-1;
            
            else if(arr[mid]==x)
            {
             idx=mid; high=mid-1;
            }
            
            // if(arr[mid] < x)
            else
            low= mid+1;
            
        }
         return idx;
    }
}
