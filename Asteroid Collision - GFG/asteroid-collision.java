//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] asteroids = new int[N];
            for (int i = 0; i < N; i++) asteroids[i] = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.asteroidCollision(N, asteroids);

            for (int e : res) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int n, int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++)
        {
            if(arr[i]>0)
            st.push(arr[i]);
            
            else{ // arr[i] <0
                
                // 3 , -4(curr ele) - for coll - need +ve val x- x<Math.abs(curr) - pop x
                while(!st.isEmpty() && st.peek()>0 && st.peek() < Math.abs(arr[i]))
                st.pop();
                
                // 5 , -4 // do nothing
                
                //  -3/empty,-4(curr) - push curr
                if(st.isEmpty() || st.peek()<0)
                st.push(arr[i]);
                
                //  4, -4(curr) - pop
                if(st.peek() + arr[i] ==0) 
                st.pop();
            }
        }
    // now ourstack has finalized states
    int ans[] = new int[st.size()];
    for(int i = st.size()-1 ;i>=0; i--)
    {
        ans[i] = st.pop();
    }
    return ans;
        
    }
}
