//{ Driver Code Starts
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
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int[] ans = new Solution().kLargest(arr, n, k);
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends

class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        
        // mm2
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //min heap
        for(int i=0; i<k; i++)  //k
        {
            pq.add(arr[i]); 
        }
        for(int i=k; i<n ;i++) // for n-k ele and i am removing in heap of size k => (n-k)logk
        {
            if(arr[i] >= pq.peek())
            {
                pq.remove();
                pq.add(arr[i]);
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
         
          for( int i=0;i<k;i++)
            al.add(pq.remove());  //k logk
        Collections.sort(al, Collections.reverseOrder()); //klogk
        
        int a[] = new int[k]; // k
        for(int i=0; i<k; i++)
        a[i] = al.get(i);
        
        return a;
    }
}